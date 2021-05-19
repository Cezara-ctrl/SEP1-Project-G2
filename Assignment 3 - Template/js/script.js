//GETTING A RANDOM VALUE
//Math.random() returns a value between range [0,1), max and min are changing that range [min, max).
//First it multiplies the difference between max and min by a number between range [0,1)
//so it's never more than the difference between max and min, and then it adds min.
//Then returns an int.
function getRandom(min, max) {
    return Math.floor(Math.random() * (max - min) + min);
};

//BOTH MOVEMENTS
//1. Slowly move around in random directions.
function moveAround(id, speed)
{
    var x = getRandom(0, $(document).width() - 150);
    var y = getRandom(0, $(document).height() - 150);

    $(id).animate({top: y, left: x}, speed, function() {moveAround(id, speed)} );
};

$(document).ready(function () {
    moveAround("#fish1Id", 6100)
});

$(document).ready(function () {
    moveAround("#fish2Id", 6500)
});

