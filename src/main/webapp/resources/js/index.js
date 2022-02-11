$(".btn-login-entry").click(() => {
    $.ajax({
        url: "LoginServlet",
        method: "POST",
        async: true,
        data: {
            username: $("#username").val(),
            password: $("#password").val()
        },
        success: (result) => {
            console.log(result);
            if (result.status == 200)
                window.location.href="home.jsp";
        },
        error: (result) => {
            sessionStorage.clear();
            console.log("Error")
            console.log(result)
        }
    });
})