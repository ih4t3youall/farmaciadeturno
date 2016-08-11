var farmacias = new Array();

$("tr").each(function(index,item){
  if(index > 1){
  var td = $(item).find("td");
    if($(td[0]).html() != ""){
    var farmacia= new Object();
    farmacia.direccion =$(td[0]).html();
    farmacia.nombre =$(td[1]).html();
    farmacia.letra =$(td[2]).html();
    farmacia.telefono =$(td[3]).html();
    farmacia.urlMaps =$(td[4]).find("a").html();
    farmacia.urlWeb =$(td[5]).html();
    var coordenadas = $(td[6]).html();
    var arr = coordenadas.split(',');
    farmacia.latitud =arr[0];
    farmacia.longitud =arr[1];


    farmacia.horario =$(td[7]).html();
    farmacia.observaciones =$(td[8]).html();
    farmacias.push(farmacia);
    }

  }


});
/*
$(farmacias).each(function(index,farmacia){
  console.log(index);
 console.log(farmacia.direccion);
console.log(farmacia.nombre);
console.log(farmacia.letra);
console.log(farmacia.telefono);
console.log(farmacia.urlMaps);
console.log(farmacia.urlWeb);
console.log(farmacia.latitud);
console.log(farmacia.longitud);
console.log(farmacia.horario);
console.log(farmacia.observaciones);


});*/

var farmacia = farmacias[0];
$(farmacias).each(function(index,farmacia){
$.ajax({

    url:"devolver",
  dataType:"json",
  data:farmacia,
  success:function(data){
console.log(data.direccion);
console.log(data.nombre);
console.log(data.letra);
console.log(data.telefono);
console.log(data.urlMaps);
console.log(data.urlWeb);
console.log(data.latitud);
console.log(data.longitud);
console.log(data.horario);
console.log(data.observaciones);

  },
  error : function(data){

  console.log(data);
  }



});
});
