class AjaxController < ApplicationController



def index



end


def devolver
  @score = Score.all
  @josefo ="miriamo"
  respond_to do |format|
     format.html
     format.json { render json: @josefo }
   end
end


end

$.ajax({

    url:"devolver",
  dataType:"json",
  success:function(data){

  console.log(data);
  },
  error : function(data){

  console.log(data);
  }



});
