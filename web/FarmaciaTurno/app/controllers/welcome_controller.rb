class WelcomeController < ApplicationController
  def index
  end

  def bienvenido
    @martin =Array.new
    farmacia = Farmacia.new
    farmacia.direccion = "2 nro 190 E/ 35 Y 36"
    farmacia.latitud= "-34.898910"
    farmacia.nombre ="Farmacia Franco"
    farmacia.longitud = "-57.959542"
    farmacia.telefono="0221 489-1773"
    farmacia.urlMaps="https://www.google.com.ar/maps/place/Calle+2+190,+B1902CHH+La+Plata,+Buenos+Aires/@-34.8989498,-57.9617145,17z/data=!3m1!4b1!4m5!3m4!1s0x95a2e653053a24f7:0xac34b441c99cfae3!8m2!3d-34.8989542!4d-57.9595312?hl=es-419"
    @martin.push farmacia
#    @martin.push "-34.898910,-57.959542"
#    @martin.push "-34.919332,-57.934647"
#    @martin.push "-34.915223,-57.944679"
  end

end
