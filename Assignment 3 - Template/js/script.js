//BOTH MOVEMENTS
//SLOWLY MOVE AROUND IN RANDOM DIRECTIONS
//Math.random() returns a value between range [0,1), the result is multiplied by page dimensions.
//Subtracting 200px from the document size because the biggest fish image dimension is 200px.
//Returns as an int (floors the result).
function moveAround(id, speed)
{
    var x = Math.floor(Math.random() * ($(document).width() - 200));
    var y = Math.floor(Math.random() * ($(document).height() - 200));

    $(id).animate({top: y, left: x}, speed, function() {moveAround(id, speed)} );
};

$(document).ready(function () {
    moveAround("#fish1Id", 6000)
});

$(document).ready(function () {
    moveAround("#fish2Id", 7000)
});

