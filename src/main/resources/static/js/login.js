/**
 * Created by Lenovo on 2018/6/2.
 */
function user_login(){

    var userName =  document.getElementById("userName");
    var password =  document.getElementById("password");
    if (userName.value == "请输入用户名" || userName.value == "" ){
        document.getElementById("username2_error").innerText = "";
        document.getElementById("username_error").innerHTML = "<div style='color: #FF0000; text-align: center;  font-size: 16px'>你好请输入用户名</div>";
        return false;
    }else {
        document.getElementById("username_error").innerHTML = "";
    }
    if (password.value == "请输入用户名" || password.value == "" ){
        document.getElementById("username2_error").innerText = "";
        document.getElementById("password_error").innerHTML = "<div style='color: #FF0000; text-align: center; font-size: 16px'>你好请输入用户密码</div>";
        return false;
    }else {
        document.getElementById("password_error").innerHTML = "";

    }

}
