defmodule Aloe.Repo.Migrations.CreateUsers do
  use Ecto.Migration

  def change do
    create table(:users) do
      add(:name, :"VARCHAR(31)", null: false)
      add(:address, :"VARCHAR(127)", null: false)
      add(:phone, :"VARCHAR(15)")
      add(:email, :"VARCHAR(63)")
      add(:wechat, :"VARCHAR(31)")
      add(:qq, :"VARCHAR(15)")
      add(:deleted_at, :DATETIME)
      add(:version, :integer, null: false, default: 0)
      add(:updated_at, :DATETIME, null: false)
      add(:created_at, :DATETIME, null: false)
    end

    create(index(:users, [:name]))
    create(index(:users, [:address]))
    create(index(:users, [:name, :address], unique: true))
  end
end
