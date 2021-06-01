//NOTIFICATION BAR

function error(msg) {
    $('<div/>').prependTo('body').addClass('notify-error').html(msg).slideDown();
}

function success(msg) {
    $('<div/>').prependTo('body').addClass('notify-success').html(msg).slideDown();
}


    $('#notify-error').click(function () {
        $(this).slideUp().empty();
    });

    $('#notify-success').click(function () {
        $(this).slideUp().empty();
    });


error('Error!');
success('Success!');
