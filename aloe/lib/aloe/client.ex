defmodule Aloe.Client do
  use Ecto.Schema
  import Ecto.Changeset

  schema "clients" do
    field(:zone, Ecto.Enum, values: [:guest, :lan, :dmz])
    field(:mac, :string)
    field(:ip, :string)
    field(:version, :integer)
    field(:updated_at, :utc_datetime)
    field(:created_at, :utc_datetime)
  end

  @doc false
  def changeset(client, attrs) do
    client
    |> cast(attrs, [:zone, :mac, :ip, :version, :updated_at, :created_at])
    |> validate_required([:zone, :mac, :ip, :version, :updated_at, :created_at])
  end
end
