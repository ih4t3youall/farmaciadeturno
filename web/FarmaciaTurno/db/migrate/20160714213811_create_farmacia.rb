class CreateFarmacia < ActiveRecord::Migration
  def change
    create_table :farmacia do |t|
      t.string :latitud
      t.string :longitud
      t.string :nombre
      t.string :letra
      t.string :direccion
      t.string :telefono
      t.string :urlMaps
      t.string :urlWeb
      t.string :coords
      t.string :horario
      t.string :observaciones
    end
  end
end
