defmodule Aloe.Log do
  use Ecto.Schema
  import Ecto.Changeset

  schema "logs" do
    field(:type, :string)
    field(:ip, :string)
    field(:message, :string)
    field(:created_at, :utc_datetime)
  end

  @doc false
  def changeset(log, attrs) do
    log
    |> cast(attrs, [:type, :ip, :message, :created_at])
    |> validate_required([:type, :ip, :message, :created_at])
  end
end
