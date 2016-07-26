var tr = $("tbody tr");

var farmacias = [];

$(tr).each(function (index,item){
  if(index != 0){
      var farmacia = new Object();
    var td = $(item).find("td");
    farmacia.direccion = $(td[0]).html();
    farmacia.nombre = $(td[1]).html();
    farmacia.tipo = $(td[2]).html();
    farmacia.telefono = $(td[3]).html();

    //farmacia.urlMaps = $(td[4]).html();
    var td6 = $(td[6]).html();
    var coords = td6.split(",");
    farmacia.latitud = coords[0];
    farmacia.longitud = coords[1]
    farmacia.horarios = $(td[7]).html();
    farmacia.observaciones =$(td[8]).html();

    farmacias.push(farmacia);

  }




});
var url = "http://localhost:3000/migrar"
var farma = JSON.stringify(farmacias[3]);
$.ajax({
  type: "GET",
  url: url,
  //dataType: 'json',
   dataType : 'html',
  data: { 'farma' : farma} ,


        success: function(data){

          console.log(data);


        },
        error : function(data){

                console.log(data);

        }
  });
