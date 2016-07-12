class CreateArticles < ActiveRecord::Migration
  def change
    create_table :articles do |t|
      t.string :latitud
      t.text :longitud

      t.timestamps null: false
    end
  end
end
