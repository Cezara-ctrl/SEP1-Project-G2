//NOTIFICATION BAR

function notifyMe() {
    if (!window.Notification) {
        console.log('Browser does not support notifications.');
    } else {

        if (Notification.permission === 'granted') {
            //it  shows the  notification 
            var notify = new Notification('Hi there!', {
                body: 'How are you doing?',
                icon: 'https://bit.ly/2DYqRrh',
            });
        } else {
            // the formula which requests the user for permission
            Notification.requestPermission().then(function (p) {
                if (p === 'granted') {
                    // show notification here
                    var notify = new Notification('Hi there!', {
                        body: 'How are you doing?',
                        icon: 'https://bit.ly/2DYqRrh',
                    });
                } else {
                    console.log('User blocked notifications.');
                }
            }).catch(function (err) {
                console.error(err);
            });
        }
    }
}
