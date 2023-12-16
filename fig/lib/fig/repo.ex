defmodule Fig.Repo do
  use Ecto.Repo,
    otp_app: :fig,
    adapter: Ecto.Adapters.Postgres
end
