defmodule Mix.Tasks.Aloe.Apply do
  use Mix.Task
  require Logger

  @shortdoc "Apply settings to system"

  @moduledoc """
  Generate apply & clear scripts.
  """

  @requirements ["app.config"]

  @impl Mix.Task
  def run(_args) do
    case System.tmp_dir() do
      nil ->
        Logger.error("failed to open tmp folder")

      tmp_dir ->
        timestamp = Calendar.strftime(DateTime.utc_now(), "%y%m%d%H%M%S")
        generate_apply_sh(Path.join(tmp_dir, "apply-#{timestamp}.sh"))
        generate_clear_sh(Path.join(tmp_dir, "clear-#{timestamp}.sh"))
    end
  end

  def generate_apply_sh(file) do
    Logger.info("Generate #{file}")
    # TODO
  end

  def generate_clear_sh(file) do
    Logger.info("Generate #{file}")
    # TODO
  end
end
