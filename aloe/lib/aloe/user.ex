defmodule Aloe.User do
  use Ecto.Schema
  import Ecto.Changeset

  schema "users" do
    field(:name, :string)
    field(:address, :string)
    field(:phone, :string)
    field(:email, :string)
    field(:wechat, :string)
    field(:qq, :string)
    field(:deleted_at, :utc_datetime)
    field(:version, :integer)
    field(:updated_at, :utc_datetime)
    field(:created_at, :utc_datetime)

    has_many(:clients, Client)
  end

  @doc false
  def changeset(user, attrs) do
    user
    |> cast(attrs, [
      :name,
      :address,
      :phone,
      :email,
      :wechat,
      :qq,
      :deleted_at,
      :version,
      :updated_at,
      :created_at
    ])
    |> validate_required([:name, :address, :version, :updated_at, :created_at])
  end
end
