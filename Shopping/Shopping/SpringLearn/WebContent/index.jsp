<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery-1.7.1.js"></script>
</head>
<body>

</body>
<script type="text/javascript">
		$(function(){
			$.ajax({
			     type: 'GET',
			     url: 'mytest/ajax' ,
			    data: {
			    	username:encodeURI('你好'),
			    	
			    } ,
			    dataType: "json",
			    success: function(data){
			    	alert(data.username);
			    }
			})
		})
	</script>
</html>