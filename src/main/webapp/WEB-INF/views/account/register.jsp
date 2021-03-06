<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>用户注册</title>

<script>
	$(document).ready(function() {
		//聚焦第一个输入框
		$("#loginName").focus();
		//为inputForm注册validate函数
		$("#inputForm").validate({
			rules : {
				loginName : {
					remote : "${ctx}/register/checkLoginName"
				}
			},
			messages : {
				loginName : {
					remote : "用户登录名已存在"
				}
			}
		});
	});
</script>
</head>

<body>
	<form id="inputForm" action="${ctx}/register" method="post"
		class="form-horizontal form-signin">
		<fieldset>
			<legend>用户注册</legend>
			<input type="text" class="form-control" placeholder="登录名" required
				autofocus id="loginName" name="loginName" /> 
			<input type="text"
				class="form-control" placeholder="用户名" required id="name"
				name="name" /> 
			<input type="password" class="form-control input-large required" 
				placeholder="密码" required id="plainPassword" name="plainPassword" />
			<input type="password" class="form-control input-large required" id="confirmPassword"
				name="confirmPassword" placeholder="确认密码"
			 equalTo="#plainPassword" />

			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary btn-lg" type="submit"
					value="提交" />&nbsp; 
				<input id="cancel_btn" class="btn btn-lg"
					type="button" value="返回" onclick="history.back()" />
			</div>
		</fieldset>
	</form>
</body>
</html>
