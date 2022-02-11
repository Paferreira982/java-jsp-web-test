<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Boteco Nordestino's | Login</title>
<!-- IMPORTED CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
		
    <div class="container">
        <p id="test"></p>
    </div>

    <!-- IMPORTED JAVASCRIPT -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script>

        $(document).ready(() => {
            console.log("Tentei")
            $.ajax({
                url: "Login",
                method: "POST",
                async: true,
                data: {
                    username: "admin",
                    password: "admin123"
                },
                success: (result) => {
                    console.log(result)
                    $("#test").html(result);
                },
                error: (result) => {
                    console.log("Error")
                    console.log(result)
                    $("#test").html(result);
                }
            });
        })
    </script>
</body>
</html>