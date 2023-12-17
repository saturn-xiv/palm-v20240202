defmodule Aloe.Repo.Migrations.CreateClients do
  use Ecto.Migration

  def change do
    create table(:clients) do
      add(:user_id, references(:users))
      add(:zone, :"VARCHAR(8)", null: false)
      add(:mac, :"CHAR(17)", null: false)
      add(:ip, :"VARCHAR(45)", null: false)
      add(:hostname, :"VARCHAR(63)", null: false)
      add(:location, :"VARCHAR(63)")
      add(:deleted_at, :DATETIME)
      add(:version, :integer, null: false, default: 0)
      add(:updated_at, :DATETIME, null: false)
      add(:created_at, :DATETIME, null: false)
    end

    create(index(:clients, [:zone]))
    create(index(:clients, [:mac]))
    create(index(:clients, [:ip]))
    create(index(:clients, [:hostname]))
    create(index(:clients, [:mac, :zone], unique: true))
  end
end
