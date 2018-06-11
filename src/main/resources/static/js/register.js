/**
 * Created by Lenovo on 2018/6/7.
 */
/*俩次密码的验证*/

function p_a() {

    var userName = document.getElementById("userName");
    var telPhone = document.getElementById("telPhone");
    var password = document.getElementById("password");
    var rePassword = document.getElementById("rePassword");
    var error_password = document.getElementById("error_password");
    var error_password1 = document.getElementById("error_password1");
    var error_password2 = document.getElementById("error_password2");
    var error_password3 = document.getElementById("error_password3");
    var error_password4 = document.getElementById("error_password4");


    if(password.value != rePassword.value){
        error_password.innerHTML = "<div style='color: red;font-size: 10px'>两次输入的密码不一致</div>";

    }else if(true){
        error_password.innerHTML = "<div style='color: red;font-size: 10px'></div>";
        if(password.value == ""){
            error_password.innerHTML = "<div style='color: red;font-size: 10px'>密码不能为空</div>";
        }else {
            error_password.innerHTML = "<div style='color: red;font-size: 10px'></div>";
        }
        if(rePassword.value == ""){
            error_password4.innerHTML = "<div style='color: red;font-size: 10px'>重复密码不能为空</div>";
        }else {
            error_password4.innerHTML = "<div style='color: red;font-size: 10px'></div>";
        }
    }
    if(userName.value == ""){
        error_password1.innerHTML = "<div style='color: red;font-size: 10px'>用户名不能为空</div>";
    }else {
        error_password1.innerHTML = "<div style='color: red;font-size: 10px'></div>";
    }



    if(telPhone.value == ""){
        error_password2.innerHTML = "<div style='color: red;font-size: 10px'>电话不能为空</div>";
    }else {
        error_password2.innerHTML = "<div style='color: red;font-size: 10px'></div>";
    }
}
function u_register() {
    var userName = document.getElementById("userName");
    var telPhone = document.getElementById("telPhone");
    var password = document.getElementById("password");
    var rePassword = document.getElementById("rePassword");
    var error_password = document.getElementById("error_password");
    var error_password1 = document.getElementById("error_password1");
    var error_password2 = document.getElementById("error_password2");
    var error_password3 = document.getElementById("error_password3");
    var error_password4 = document.getElementById("error_password4");
    if(password.value != rePassword.value){
        error_password.innerHTML = "<div style='color: red;font-size: 10px'>两次输入的密码不一致</div>";

    }else if(password.value == "" || rePassword.value=="" ||password.value != rePassword.value){
        error_password.innerHTML = "<div style='color: red;font-size: 10px'></div>";
        if(password.value == ""){
            error_password.innerHTML = "<div style='color: red;font-size: 10px'>密码不能为空</div>";
        }else {
            error_password.innerHTML = "<div style='color: red;font-size: 10px'></div>";
        }

        if(rePassword.value == ""){
            error_password4.innerHTML = "<div style='color: red;font-size: 10px'>重复密码不能为空</div>";
        }else {
            error_password4.innerHTML = "<div style='color: red;font-size: 10px'></div>";
        }
    }

    if(userName.value == ""){
        error_password1.innerHTML = "<div style='color: red;font-size: 10px'>用户名不能为空</div>";
    }else {
        error_password1.innerHTML = "<div style='color: red;font-size: 10px'></div>";

    }

    if(telPhone.value == ""){
        error_password2.innerHTML = "<div style='color: red;font-size: 10px'>电话不能为空</div>";
    }else {
        error_password2.innerHTML = "<div style='color: red;font-size: 10px'></div>";
    }

    if(userName.value == "" ||password.value == "" || rePassword.value == "" || telPhone.value == "" || password.value != rePassword.value){
        return false;
    }
}