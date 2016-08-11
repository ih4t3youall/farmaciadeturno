class AjaxController < ApplicationController



def index



end


def devolver

  @josefo="200Ok"

  @farmacium = Farmacium.new(get_post_parameters)
  @farmacium.save
  respond_to do |format|
     format.html
     format.json { render json: @josefo }
   end
end


private
def get_post_parameters
  params.permit( :nombre, :direccion, :letra, :telefono, :urlMaps, :urlWeb, :latitud, :longitud, :horario, :observaciones)
end


end
