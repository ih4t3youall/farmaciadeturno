class FarmaciaTurnoController < ApplicationController
  def index
    #@martin =Array.new
    #article = Article.new
    #article.latitud = "-34.898910"
    #article.longitud = "-57.959542"
    #@martin.push article
    @farmaciasDeUp =Farmacia.all

    @farmacias =Array.new

  #  farma = Farmacia.new
  #  farma.direccion = "2 nro 190 E/ 35 Y 36"
  #  farma.latitud= "-34.898910"
  #  farma.longitud = "-57.959542"
  #  farma.nombre ="Farmacia Franco"

  #  farma.telefono="0221 489-1773"
  #  farma.urlMaps="https://www.google.com.ar/maps/place/Calle+2+190,+B1902CHH+La+Plata,+Buenos+Aires/@-34.8989498,-57.9617145,17z/data=!3m1!4b1!4m5!3m4!1s0x95a2e653053a24f7:0xac34b441c99cfae3!8m2!3d-34.8989542!4d-57.9595312?hl=es-419"
  #  @farmacias.push farma
  #  farma = Farmacia.new
  #  farma.direccion = "3 nro 1477 E/ 62 Y 63"
  #  farma.latitud= "-34.919332"
  #  farma.longitud = "-57.934647"
  #  farma.nombre ="Farmacia Scasso"

  #  farma.telefono="0221 483-1197"
  #  farma.urlMaps="https://www.google.com.ar/maps/place/Farmacia+Scasso/@-34.9193401,-57.9346351,17z/data=!3m1!4b1!4m5!3m4!1s0x95a2e61eb4ce2dff:0x6b5228525573362c!8m2!3d-34.9193401!4d-57.9346351?hl=es-419"
  #  @farmacias.push farma

    #@farmaciasDeUp.each do |farm|
    #  @farmacias.push farm
    #end

    for i in 50..60
        @farmacias.push @farmaciasDeUp[i]
    end


  end
end
