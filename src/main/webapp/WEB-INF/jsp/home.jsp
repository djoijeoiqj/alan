<%@ page pageEncoding="utf-8" 
contentType="text/html; charset=utf-8" %>
<html>
	<head>
		<title>SSH</title>
	</head>
	<body>
		<%@include file="header.jsp" %>
	
		<div id="content_wrapper">
			<div id="content">
				<h3>Hello, Struts!</h3>
				<h3>Welcome, ${session.username }!</h3>
				<ul>
					<li><a href="${pageContext.request.contextPath }/main/validateImage.action">下载随机验证码图片</a>
					<li><a href="${pageContext.request.contextPath }/main/downloadExcel.action">下载Excel文件</a>
					<li><a href="${pageContext.request.contextPath }/main/responseResult.action?query=full-result">简单的JSON</a>
					<li><a href="${pageContext.request.contextPath }/main/responseResult.action?query=response-result-only">仅返回通过结果的Json</a>
				</ul>
			</div>
		</div>
	</body>
</html>