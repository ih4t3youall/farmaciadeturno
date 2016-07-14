class MigradorController < ApplicationController


  def migrar

    @farmacias = Farmacium.all

    @farmacias.each do |farmacia|

      coords = farmacia.coords.split(",")
      farmacia.latitud = coords[0]
      farmacia.longitud =coords[1]
      farmacia.save
    end


  end

end
