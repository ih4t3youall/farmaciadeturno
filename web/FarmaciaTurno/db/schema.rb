# encoding: UTF-8
# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# Note that this schema.rb definition is the authoritative source for your
# database schema. If you need to create the application database on another
# system, you should be using db:schema:load, not running all the migrations
# from scratch. The latter is a flawed and unsustainable approach (the more migrations
# you'll amass, the slower it'll run and the greater likelihood for issues).
#
# It's strongly recommended that you check this file into your version control system.

ActiveRecord::Schema.define(version: 20160711234014) do

  create_table "articles", force: :cascade do |t|
    t.string   "latitud"
    t.text     "longitud"
    t.datetime "created_at", null: false
    t.datetime "updated_at", null: false
  end

  create_table "farmacia", force: :cascade do |t|
    t.string  "latitud"
    t.string  "longitud"
    t.string  "nombre"
    t.string  "letra"
    t.string  "direccion"
    t.string  "telefono"
    t.string  "urlMaps"
    t.string  "urlWeb"
    t.string  "coords"
    t.string  "coordenadas"
    t.string  "horario"
    t.string  "observaciones"
    t.integer "farm_id"
  end

  add_index "farmacia", ["farm_id"], name: "index_farmacia_on_farm_id"

  create_table "farmacia_tipos", force: :cascade do |t|
    t.integer "id_farmacia"
    t.integer "id_tipo"
  end

  add_index "farmacia_tipos", ["id_farmacia"], name: "index_farmacia_tipos_on_id_farmacia"
  add_index "farmacia_tipos", [nil], name: "index_farmacia_tipos_on_id_tipos"

  create_table "tipos", force: :cascade do |t|
    t.string  "letra"
    t.integer "tipo_id"
  end

  add_index "tipos", ["tipo_id"], name: "index_tipos_on_tipo_id"

  create_table "users", force: :cascade do |t|
    t.string   "name"
    t.string   "last_name"
    t.string   "phone_number"
    t.datetime "created_at",   null: false
    t.datetime "updated_at",   null: false
  end

end
