defmodule Mix.Tasks.Aloe.Init do
  use Mix.Task
  require Logger
  require Ecto.Query

  @shortdoc "Init the system"

  @moduledoc """
  Set default user with admin:change-me
  """

  @requirements ["app.config"]
  @requirements ["app.start"]

  @impl Mix.Task
  def run(_args) do
    init_user()
  end

  def init_user() do
    unless Aloe.Repo.get_by(Aloe.Setting, key: Aloe.Setting.Administrator.key()) do
      admin = %Aloe.Setting.Administrator{}

      Logger.warning(
        "Couldn't find the administrator, will init with #{admin.name}:#{admin.password}"
      )

      now = DateTime.truncate(DateTime.utc_now(), :second)

      %Aloe.Setting{
        key: Aloe.Setting.Administrator.key(),
        value: admin |> :erlang.term_to_binary(),
        created_at: now,
        updated_at: now
      }
      |> Aloe.Repo.insert()

      %Aloe.Log{
        message: "init system",
        created_at: now
      }
      |> Aloe.Repo.insert()
    end

    # aaa = Aloe.Setting |> Ecto.Query.first() |> Aloe.Repo.one()
  end
end
