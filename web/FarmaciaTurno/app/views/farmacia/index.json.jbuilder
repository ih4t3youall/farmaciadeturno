json.array!(@farmacia) do |farmacium|
  json.extract! farmacium, :id, :latitud, :longitud, :nombre, :letra, :direccion, :telefono, :urlMaps, :urlWeb, :coords, :horario, :observaciones
  json.url farmacium_url(farmacium, format: :json)
end
