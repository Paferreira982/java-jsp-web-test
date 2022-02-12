$("#login-form").on("submit", function(event) {
    $.ajax({
        url: "LoginServlet",
        method: "POST",
        async: true,
        data: {
            username: $("#username").val(),
            password: $("#password").val()
        },
        success: (result) => {
            if (result.status == 200)
                window.location.href="home.jsp";
            else {
                showLoginMessage(result.message);
            }
        },
        error: (result) => {
            sessionStorage.clear();
            console.log("Error");
            console.log(result);
        }
    });
    event.preventDefault();
})

const showLoginMessage = (message) => {
    $("#waring-message").html(message);
    $(".alert-warning").show();
    $("#password").val("");
}