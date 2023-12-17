defmodule Aloe.Setting do
  use Ecto.Schema
  import Ecto.Changeset

  schema "settings" do
    field(:key, :string)
    field(:value, :binary)
    field(:version, :integer)
    field(:updated_at, :utc_datetime)
    field(:created_at, :utc_datetime)
  end

  @doc false
  def changeset(setting, attrs) do
    setting
    |> cast(attrs, [:key, :value, :version, :updated_at, :created_at])
    |> validate_required([:key, :value, :version, :updated_at, :created_at])
  end
end
