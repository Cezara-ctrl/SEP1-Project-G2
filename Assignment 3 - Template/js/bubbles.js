//THREE BUBBLES
//Bubbles are the height and width of 100px so there is a 100px margin.
function bubbles(id, speed)
{
    var x = Math.floor(Math.random() * ($(document).width() - 100));
    var y = Math.floor(Math.random() * ($(document).height() - 100));

    //Bubbles start getting animated from the bottom of the page.
    $(id).offset({
        top: $(document).height(),
        left: x}
        );

    //It goes beyond top (-100) so the bubbles fully move out of the view.
    $(id).animate({
        left: x,
        top: -100},
        speed,
        function() {bubbles(id, speed)}
        );
}

//Bubbles fading out function.
function disappear(id, speed)
{
    $(id).stop(true);
    $(id).fadeOut;
    bubbles(id,speed);
}

//Using the fading out function on click.
$(".bubbleClass").click(function ()
{
    disappear($(this), 10000)
});