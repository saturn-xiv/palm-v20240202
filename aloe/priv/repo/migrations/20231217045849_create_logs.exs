defmodule Aloe.Repo.Migrations.CreateLogs do
  use Ecto.Migration

  def change do
    create table(:logs) do
      add(:type, :"VARCHAR(255)", null: false)
      add(:ip, :"VARCHAR(45)", null: false)
      add(:message, :string, null: false)
      add(:created_at, :DATETIME, null: false)
    end

    create(index(:logs, [:type]))
    create(index(:logs, [:ip]))
  end
end