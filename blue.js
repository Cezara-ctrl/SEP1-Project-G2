$("#fish2Id").hover(function(){
    $(this).stop(true);
    moveToRandom($(this));
    fishMoves("#fish2Id", 7000)
});

function moveToRandom(idRef){
    var y = getRandom(0, $(document).height() - 100);
    var x = getRandom(0, $(document).widht() - 100);

    $(idRef).animate
    (
            {top: y, left: x}, 1000
    )
}

funtion ;getRandom(min, max) 
{
    return Math.floor(Math.random() * (max - min + 1)) + min;
}


