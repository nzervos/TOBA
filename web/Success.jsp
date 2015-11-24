<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Titan Online Banking - New Customer</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Success</h1><br>
        <p>Thank you ${user.firstName} ${user.lastName} for signing up.<br>Please review your information:<br>
            First Name: ${user.firstName}<br>
            Last Name: ${user.lastName}<br>
            Phone: ${user.phone}<br>
            Address: ${user.address}<br>
            City: ${user.city}<br>
            State: ${user.state}<br>
            Zip: ${user.zip}<br>
            E-mail: ${user.email}<br>
            Username: ${user.userName}<br>
            Password: ${user.password}<br></p>
        <a href="Transaction.html">Back to Home</a> &nbsp;            
    </body>
</html>
