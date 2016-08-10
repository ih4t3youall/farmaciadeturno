class AjaxController < ApplicationController



def index



end


def devolver

  @josefo =get_post_parameters

  respond_to do |format|
     format.html
     format.json { render json: @josefo }
   end
end


private
def get_post_parameters
  params.permit( :nombre, :apellido)
end


end
