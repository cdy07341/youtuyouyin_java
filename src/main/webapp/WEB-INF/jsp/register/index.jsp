<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>会员中心-用户注册</title>
		<%@include file="../common/meta.jsp" %>
		<link rel="stylesheet" type="text/css" href="/youtuyouyin/static/css/user.css" />
	</head>

	<body>
		<%@include file="../common/headerTop.jsp" %>
		<!--用户注册-->
		<section class="register">
			<div class="wrap">
				<div class="header-login clearfix">
					<a href="{:U('Home/Index/index')}" class="fl"><img src="/youtuyouyin/static/img/common/logo.png" /></a>
					<span class="fl">欢迎注册</span>
				</div>
				<div class="register-wrap">
					<div class="register-header">
						<span class="fl">注册</span>
						<span class="fr">已有账号？<a href="{:U('Home/Login/index')}">直接登录</a></span>
					</div>
					<div class="register-body">
						<form action="" method="post" class="registe-form">
							<input type="text" name="identify" value="" hidden="hidden" />
							<div class="input-group clearfix">
								<label>手机号码：</label>
								<input type="text" name="userphone" id="userphone" maxlength="11" />
							</div>
							<div class="input-group clearfix">
								<label>登录密码：</label>
								<input type="password" name="password" id="password" maxlength="15" />
							</div>
							<div class="input-group clearfix">
								<label>重复密码：</label>
								<input type="password" name="re-password" id="re-password" maxlength="15" />
							</div>
							<div class="input-group clearfix">
								<label></label>
								<input style="width:100px;margin-right: 5px;" type="text" name="pic-code"maxlength="15" />
								<img style="float:left;"src="/youtuyouyin/validate/index" class="codeimg" alt="点击获取新的验证码">
								<div style="float: left;margin-left: 7px;line-height: 40px;cursor: pointer;" id="code-change"><span style="color:red;">换一张</span></div>
							</div>
							<div class="input-group clearfix" id="phonecode">
								<label>验证码：</label>
								<input type="text" name="code" maxlength="6" />
								<button type="button" id="sendCode">获取验证码</button>
							</div>
							<div class="input-group clearfix">
								<button type="button" id="submit">立即注册</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</section>
		<%@include file="../common/footer.jsp" %>
		<%@include file="../common/commonScript.jsp" %>
		<script src="/youtuyouyin/static/js/register.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			//用户注册入口
			$("input[name='identify']").val("05efea0318b3f16c17c24ff3b6cea785");
			//验证码
			$('#sendCode').click(function() {
				var phone = $('.registe-form input[name="userphone"]').val();
				if(!phone || !(/^1[34578]\d{9}$/.test(phone))) { 
					dialog.msg("手机号码不正确");
					return false;
				}
				var picCode = $("input[name='pic-code']").val();
				if (null == picCode || '' == picCode) {
					dialog.msg("请输入图形验证码");
					return false;
				}
				
				sendPhoneCode();
				$.ajax({
					type: "post",
					url: "/youtuyouyin/sendsms/index",
					async: true,
					data: {
						'phone': phone,
						"code" : picCode
					},
					success: function(res) {
						if(res.code == 0) {
							dialog.msg(res.msg);
						} else if(res.code = 1) {
							dialog.msg(res.msg);
						}
					}
				});
			})
			
			function sendPhoneCode(){
				$(".registe-form #sendCode").text('3s');
				var time=3;
				$(".registe-form #sendCode").attr('disabled',"disabled");
				$(".registe-form #sendCode").css('background-color', '#9c9c9c');
				var timer=setInterval(function(){
					time=time-1;
					$(".registe-form #sendCode").text(time+'s');
					if(time<=0){
						clearInterval(timer);
						$(".registe-form #sendCode").css('background-color', '#00D9B5');
						$(".registe-form #sendCode").text('重新发送');
						$(".registe-form #sendCode").attr('disabled',null);
					}
				},1000);
			}
			
			$(".codeimg, #code-change").on("click", function() {
				var myDate = new Date();
				var time = myDate.getTime();
				$(".codeimg").attr("src", "/youtuyouyin/validate/index?" + time);
			})
		</script>
	</body>

</html>