defmodule Aloe.Repo do
  use Ecto.Repo,
    otp_app: :aloe,
    adapter: Ecto.Adapters.Postgres
end
