<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page
	import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>登录页</title>
</head>

<body>
	

	<script>
		$(document).ready(function() {
			$("#loginForm").validate();
		});
	</script>

	<div class="container">
		<form class="form-signin" role="form" id="loginForm"
			action="${ctx}/login" method="post">
			<%
				String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
				if (error != null) {
			%>
			<div class="alert alert-error input-medium controls">
				<button class="close" data-dismiss="alert">×</button>
				登录失败，请重试.
			</div>
			<%
				}
			%>
			<h2 class="form-signin-heading">请登录</h2>
			<input type="text" class="form-control" placeholder="名称" required
				autofocus name="username" value="${username}"> 
			<input type="password" class="form-control"
				placeholder="密码" required  name="password">
			<div class="checkbox">
				<label>
					<input type="checkbox" value="remember-me"> 记住我
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		</form>
	</div>
	<!-- /container -->
</body>
</html>
