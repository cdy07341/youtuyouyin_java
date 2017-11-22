<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>用户登陆-优图优印</title>
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<%@include file="../common/meta.jsp" %>
		<link rel="stylesheet" type="text/css" href="/youtuyouyin/static/css/user.css" />
	</head>

	<body>
		<%@include file="../common/headerTop.jsp" %>
		<section class="login">
			<div class="wrap clearfix">
				<div class="header-login clearfix">
					<a href="{:U('Home/Index/index')}" class="fl"><img src="/youtuyouyin/static/img/common/logo.png" /></a>
					<span class="fl">欢迎登陆</span>
				</div>
				<div class="login-img fl">
				</div>
				<div class="login-box-wrap fr">
					<div class="tab_name">
						<ul>
							<li class="on">帐号登录</li>
						</ul>
					</div>
					<div class="login_wrap">
						<div class="tab_content tab_content_account">
							<form method="post" id="LoginForm">
								<div class="box box_name">
									<input type="text" name="userphone" id="userphone" class="inputText" placeholder="请输入用户名/手机/邮箱" autocomplete="off" maxlength="11"/>
								</div>
								<div class="box box_passwd">
									<input type="password" name="password" id="password" class="inputText" placeholder="请输入您的密码" autocomplete="off" maxlength="15"/>
								</div>
								<div class="box box_auto_login">
									<input type="checkbox" name="autoLogin" />
									<label>下次自动登录</label>
									<a href="/Home/Register/forgetpasswd.html">忘记密码？</a>
								</div>
								<input type="button" class="btn submit_button" id="accountLoginBtn" value=" 立即登录" />
							</form>
						</div>
					</div>
				</div>
			</div>
		</section>
		<%@include file="../common/footer.jsp" %>
		<%@include file="../common/commonScript.jsp" %>
		<script src="/youtuyouyin/static/js/register.js" type="text/javascript" charset="utf-8"></script>
	</body>

</html>
