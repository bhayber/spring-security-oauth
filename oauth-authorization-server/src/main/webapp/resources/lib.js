function authenticateUser(credentials) {
    var body = {
        grant_type: 'password',
        client_id: 'fooClientIdPassword',
        client_secret: 'secret',
        username: 'ThaAdmin2',
        password: 'ThaAdmin2'
    };

    $.ajax({
        url: 'http://localhost:8081/auth/oauth/token',
        type: 'POST',
        dataType: 'json',
        contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
        data: JSON.stringify(body),
        data: body, /* right */
        complete: function(result) {
            //called when complete
            console.log(result);
        },

        success: function(result) {
            //called when successful
            console.log(result);
        },

        error: function(result) {
            //called when there is an error
            console.log(result);
        },
    });
    return true;
}