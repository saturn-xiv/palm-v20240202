defmodule Aloe.Client do
  use Ecto.Schema
  import Ecto.Changeset

  schema "clients" do
    belongs_to(:user, User)
    field(:zone, Ecto.Enum, values: [:guest, :lan, :dmz])
    field(:mac, :string)
    field(:ip, :string)
    field(:hostname, :string)
    field(:location, :string)
    field(:deleted_at, :utc_datetime)
    field(:version, :integer)
    field(:updated_at, :utc_datetime)
    field(:created_at, :utc_datetime)
  end

  @doc false
  def changeset(client, attrs) do
    client
    |> cast(attrs, [
      :zone,
      :mac,
      :ip,
      :hostname,
      :location,
      :deleted_at,
      :version,
      :updated_at,
      :created_at
    ])
    |> validate_required([:zone, :mac, :ip, :hostname, :version, :updated_at, :created_at])
  end
end
