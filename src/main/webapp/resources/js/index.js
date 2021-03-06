$("#login-form").on("submit", function(event) {
    $(".btn-login-entry").html(`
    <span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span>
    Carregando...`);
    
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
                $(".btn-login-entry").html("Logar");
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