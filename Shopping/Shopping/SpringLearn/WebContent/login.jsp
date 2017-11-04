<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="css/login.style.css">
<script src="js/jquery-1.7.1.js"></script>
</head>
<body>

	<div id="content">
		<div class="login-header">
			<label>管理员登录</label>
		</div>
		<form>
			<div class="login-input-box">
				<span class="icon icon-user"></span> <input type="text"
					placeholder="Please enter your username" id="username" name="username">
			</div>
			<div class="login-input-box">
				<span class="icon icon-password"></span> <input type="password"
					placeholder="Please enter your password" id="password" name="password">
			</div>
		</form>

		<div class="login-button-box">
			<button onclick="login()">Login</button>
		</div>

	</div>
</body>
<script type="text/javascript">
	function login() {
		var username=$('#username').val();
		var password=$('#password').val();
		if(username.length==0 || password.length==0)
			alert("用户名或密码不能为空");
		else{
			$.ajax({

			     type: 'POST',

			     url: 'user/login' ,

			    data: {
			    	username:username,
			    	password:password
			    } ,
			    dataType: "json",
			    success: function(data){
			    
			    	if(data.loginStatus=="success"){
			    		alert('登录成功');
			    		window.location.href="user/checkLogin";
			    	}else{
			    		alert('用户名或密码错误')
			    	}
			    } ,
				error:function(){
					alert("网络出错");
				}

			});
		}
	}
</script>
</html>