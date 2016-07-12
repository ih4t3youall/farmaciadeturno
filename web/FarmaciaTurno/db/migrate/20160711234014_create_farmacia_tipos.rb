class CreateFarmaciaTipos < ActiveRecord::Migration
  def change
    create_table :farmacia_tipos do |t|
      t.integer :id_farmacia
      t.integer :id_tipo

    end
      add_index :farmacia_tipos, :id_farmacia
      add_index :farmacia_tipos, :id_tipos


  end
end
