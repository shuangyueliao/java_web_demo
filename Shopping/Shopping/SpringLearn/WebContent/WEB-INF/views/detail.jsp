<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品详情</title>
<script src="../../js/jquery-1.7.1.js" type="text/javascript"
	charset="utf-8"></script>
<link rel="stylesheet" type="text/css" href="../../css/detail.css" />
</head>
<body>
<input id="myid" name="${id }" type="hidden"></input>
		<div id="main">
			<img src="" />
			<div id="right">
				<div id="name"></div>
				<div id="price">￥</div>
				<pre id="up"></pre>
			</div>
		</div>
		
		<div id="bottom">
			<h1>规格与包装</h1>
			<p id="down"></p>
		</div>
	</body>
	<script src="../../js/detail.js" type="text/javascript" charset="utf-8"></script>
</html>