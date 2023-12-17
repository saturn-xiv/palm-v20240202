defmodule Aloe.Repo.Migrations.CreateSettings do
  use Ecto.Migration

  def change do
    create table(:settings) do
      add(:key, :"VARCHAR(255)", null: false)
      add(:value, :binary, redact: true, null: false)
      add(:version, :integer, null: false, default: 0)
      add(:updated_at, :DATETIME, null: false)
      add(:created_at, :DATETIME, null: false)
    end

    create(index(:settings, [:key], unique: true))
  end
end
