<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function add(){
		var form = document.forms[0];
		form.action = "add";
		form.method="post";
		form.submit();
	}
</script>
</head>
<body>
	<h1>添加商品</h1>
	<form action="" name="shopForm" enctype="multipart/form-data">
		名字：<input type="text" name="name">
		价格：<input type="text" name="price">
		图片：<input type="file" name="file">
		介绍：<input type="text" name="introduction">
		参数：<input type="text" name="standard">
		<input type="button" value="添加商品" onclick="add()">
	</form>
</body>
</html>