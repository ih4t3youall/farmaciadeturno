class CreateTipos < ActiveRecord::Migration
  def change
    create_table :tipos do |t|
      t.string :letra
      t.integer :tipo_id

    end
    add_index :tipos, :tipo_id
  end
end
