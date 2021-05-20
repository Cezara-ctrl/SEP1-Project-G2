//BOTH MOVEMENTS
//SLOWLY MOVE AROUND IN RANDOM DIRECTIONS
//Math.random() returns a value between range [0,1), the result is multiplied by page dimensions.
//Subtracting 250px from the document size because the biggest fish image dimension is 200px.
//Returns as an int (floors the result).
//To move slowly, put a higher value for speed for a fish.
function moveAround(id, speed)
{
    var x = Math.floor(Math.random() * ($(document).width() - 250));
    var y = Math.floor(Math.random() * ($(document).height() - 250));

    //EXTRA FUNCTIONALITY
    //FLIPPING THE FISH ACCORDING TO THE MOVEMENT DIRECTION
    //Depending on position it adds or removes a CSS class responsible for flipping an image.
    if($(id).position().left >= x)
    {    
        $(id).addClass('flip');
    }
    else
    {
        $(id).removeClass('flip');
    }

    $(id).animate({
        top: y,
        left: x},
        speed,
        function() {moveAround(id, speed)}
        );

};

//FISH

$(document).ready(function () {
    moveAround("#fish1Id", 6000)
});

$(document).ready(function () {
    moveAround("#fish2Id", 7000)
});

//EXTRA FISH
$(document).ready(function () {
    moveAround("#fish3Id", 5000)
});

//BUBBLES

$(document).ready(function () {
    bubbles("#bubble1Id", 5000)
});
$(document).ready(function () {
    bubbles("#bubble2Id", 8000)
});
$(document).ready(function () {
    bubbles("#bubble3Id", 2000)
});
