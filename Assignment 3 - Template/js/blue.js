// BLUE FISH

$("#fish2Id").hover(function()
{
    $(this).stop(true);
    moveAround("#fish2Id", 1000)
});

$("#fish2Id").mouseleave(function()
{
    moveAround("#fish2Id", 7000)
})


