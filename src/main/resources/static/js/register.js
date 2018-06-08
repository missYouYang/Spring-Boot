/**
 * Created by Lenovo on 2018/6/7.
 */
/*俩次密码的验证*/

function p_a() {
    var password = document.getElementById("password");
    var rePassword = document.getElementById("rePassword");
    var error_password = document.getElementById("error_password");

    if(password.value != rePassword.value){
        error_password.innerHTML = "<div style='color: red;font-size: 10px'>两次密码不一致一致</div>";
    }
}
/*
function user2_register() {
    alert("号")
}
var password = document.getElementById("password");
var rePassword = document.getElementById("rePassword");

if(password.value != rePassword.value){

}*/
