// ORANGE FISH

//Move to where clicked.
$(document).click(function (event) {
    $("#fish1Id").stop(true);

    $("#fish1Id").animate({
		left: event.pageX,
		top: event.pageY},
		1000
		);
	
    moveAround("#fish1Id", 6000);
});

//Double size on double click.
//Increased size lasts for 5 seconds.
$("#fish1Id").dblclick(function () {
    $(this).stop(true)
	
	$("#fish1Id").animate({
		width: 500,
		height: 500}
		);

    setTimeout(function () {   
    $("#fish1Id").animate({
		width: 250,
		height: 250},
		500);
    }, 5000);  
	
	moveAround("#fish1Id", 6000);
}); 
$("#fish1Id").click(function(){
  ("#fish1Id").fadeOut(5000);
});
$("#fish1Id").click(function(){
  $("#fish1Id").fadeOut(7000,"swing");

});

  $("#fish1").click(function(){
    $("fish1").hide();
  });
  $("#fish1").click(function(){
    $("fish1").show();
  });
