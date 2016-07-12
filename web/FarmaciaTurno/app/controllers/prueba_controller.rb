class PruebaController < ApplicationController


def index
@farmacia=Farmacia.all
@farmacia.each do  |farm|
@coordenadas =farm.coordenadas.split(",")
farm.latitud =@coordenadas[0]
farm.longitud=@coordenadas[1]
farm.save

end
end

def new
  @farmacia=Farmacia.new
end

def create
  @farmacia = Farmacia.new(message_params) # creamos una nueva instancia de un héroe con los datos post
@farmacia.save
#   if @hero.save
#     flash[:notice] = 'El héroe se ha creado correctamente.'
#     redirect_to action: 'index'
#   else
#     render :new
#   end
end

private
  def message_params
    params.require(:farmacia).permit(:nombre,:direccion)
  end


end
