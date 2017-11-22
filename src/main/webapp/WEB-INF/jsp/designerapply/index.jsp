<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>会员中心-设计师入驻</title>
		<%@include file="../common/meta.jsp" %>
		<link rel="stylesheet" type="text/css" href="/youtuyouyin/static/css/user.css" />
	</head>

	<body>
		<include file="Common/headerTop"/>
		<!--用户注册-->
		<section class="register">
			<div class="wrap">
				<div class="header-login clearfix">
					<a href="/Home/Index/index" class="fl"><img src="__PUBLIC__/images/common/logo.png" /></a>
					<span class="fl">欢迎设计师入驻优图优印</span>
				</div>
				<div class="register-wrap">
					<div class="register-header">
						<span class="fl">入驻申请</span><sapn style="font-size: 12px; color: red;margin-left: 15px;">请认真填写资料</sapn>
						<span class="fr">已有账号？<a href="/Home/Login/index">直接登录</a></span>
					</div>
					<div class="register-body">
						<form action="" method="post" id="designerApplyForm">
							<!--个人信息-->
							<div class="input-group clearfixfix">
								<label><span>（必填）</span>真实姓名：</label>
								<input type="text" name="true_name" id="true_name" maxlength="20"/>
							</div>
							<div class="input-group clearfixfix">
								<label><span>（必填）</span>手机号码：</label>
								<input type="text" id="userphone" name="userphone" maxlength="11"/>
							</div>
							<div class="input-group clearfix">
								<label></label>
								<input style="width:100px;margin-right: 5px;" type="text" name="pic-code"maxlength="15" />
								<img style="float:left;"src="/home/sns/captcha/" class="codeimg" alt="点击获取新的验证码">
								<div style="float: left;margin-left: 7px;line-height: 40px;cursor: pointer;" id="code-change"><span style="color:red;">换一张</span></div>
							</div>
							<div class="input-group clearfix" id="phonecode">
								<label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;验证码：</label>
								<input type="text" name="code" id="code" maxlength="6"/>
								<button type="button" id="sendCode">获取验证码</button>
							</div>
							<div class="input-group clearfixfix">
								<label><span>（必填）</span>账户密码：</label>
								<input type="password" name="password" id="password" maxlength="15"/>
							</div>
							<div class="input-group clearfixfix">
								<label><span>（必填）</span>重复密码：</label>
								<input type="password" id="re-password" name="re-password" maxlength="15"/>
							</div>
							<div class="form-item clearfix" style="margin-bottom: 20px;">
								<div class="input-group clearfixfix" style="width: 100%;" id="location">
									<label><span>（必填）</span>所在地：</label>
									<div id="distpicker1">
										<select name="province"></select>
										<select name="city"></select>
										<select name="district"></select>
									</div>
								</div>
							</div>
							<div class="form-item clearfix" style="margin-bottom: 20px;">
								<div class="input-group clearfixfix" style="width: 30%;">
									<label><span>（必填）</span>年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄：</label>
									<input type="number" id="years" name="years" maxlength="2"/>
								</div>
								<div class="input-group clearfixfix" style="width: 50%;margin-left: 30px;" id="sex">
									<label><span>（必填）</span>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</label>
									<div class="sex-radio">
										女：<input type="radio" name="sex" id="sex" value="female" /> 男：
										<input type="radio" name="sex" id="sex" value="male" />
									</div>
								</div>
							</div>
							<div class="input-group clearfixfix">
								<label><span>（必填）</span>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：</label>
								<input type="email" id="useremail" name="email"/>
							</div>
							<div class="input-group clearfixfix">
								<label><span>（必填）</span>毕业学校：</label>
								<input type="text" id="graduation" name="graduation" maxlength="30"/>
							</div>
							<div class="input-group clearfixfix">
								<label><span>（必填）</span>毕业专业：</label>
								<input type="text" id="major" name="major" maxlength="30"/>
							</div>
							<!--设计信息-->
							<div class="input-group clearfix">
								<label><span>（必填）</span>设计经验：</label>
								<select name="experience" id="experience">
									<volist name="experience" id="year">
										<option value="{$year.id}">{$year.value}年</option>
									</volist>
								</select>
							</div>
							<div class="input-group clearfix" style="height: auto;">
								<label><span>（必填）</span>自我介绍：</label>
								<textarea name="description" id="self-description" placeholder="请输入200字以内的自我介绍，经历以及获奖情况"></textarea>
							</div>
							<!--设计范围-->
							<div class="input-group clearfix" style="height: auto;">
								<label><span>（必填）</span>服务报价：</label>
								<div class="designer-serves">
									<div class="serves-item clearfix">
										<span>类型1(必选)</span>
										<select name="serveType[]">
											<volist name="designType" id="typeItem">
												<option value="{$typeItem.id}">{$typeItem.name}</option>
											</volist>
										</select>
										<select name="servePrice[]">
											<volist name="priceRange" id="range">
												<option value="{$range.id}">{$range.value}</option>
											</volist>
										</select>
									</div>
									<div class="serves-item clearfix">
										<span>类型1(必选)</span>
										<select name="serveType[]">
											<volist name="designType" id="typeItem">
												<option value="{$typeItem.id}">{$typeItem.name}</option>
											</volist>
										</select>
										<select name="servePrice[]">
											<volist name="priceRange" id="range">
												<option value="{$range.id}">{$range.value}</option>
											</volist>
										</select>
									</div>
									<div class="serves-item clearfix">
										<span>类型1(必选)</span>
										<select name="serveType[]">
											<volist name="designType" id="typeItem">
												<option value="{$typeItem.id}">{$typeItem.name}</option>
											</volist>
										</select>
										<select name="servePrice[]">
											<volist name="priceRange" id="range">
												<option value="{$range.id}">{$range.value}</option>
											</volist>
										</select>
									</div>
								</div>
							</div>
							<!--设计风格-->
							<div class="input-group clearfix designer-style">
								<label><span>（必填）</span>设计风格：</label>
								<div class="style-wrap clearfix" id="designerStyle">
									<volist name="designStyle" id="styleItem">
										<div class="style-item">
											<input type="checkbox" name="desinger_style[]" value="{$styleItem.id}"/>{$styleItem.name}
										</div>
									</volist>
								</div>
							</div>
							<!--特殊技能-->
							<div class="input-group clearfix special-skill">
								<label><span>（选填）</span>特殊技能：</label>
								<div class="style-wrap clearfix">
									<volist name="specialSkill" id="skill">
										<div class="style-item">
											<input type="checkbox" name="special_skill[]" value="{$skill.id}"/>{$skill.name}
										</div>
									</volist>
								</div>
							</div>
							<div class="input-group clearfix" id="agreement">
								<input type="checkbox" name="agreet" id="agreet" checked="checked"/>
								<label style="width: 250px;" id="agreetLink">我已阅读并同意<a href="/Home/Introduction/ServiceAgreement.html" target="_blank">《优图优印三方合同协议》</a></label>
							</div>
							<input type="text" name="identify" value="" hidden="hidden"/>
							<div class="input-group clearfix" id="phonecode" style="width: 100%;">
								<button type="button" id="submit">马上加入</button>
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
			$("#distpicker1").distpicker();
			//虚拟推广链接
			$("input[name='identify']").val("05efea0318b3f16c17c24ff3b6cea785");
			$('#designerApplyForm #sendCode').click(function() {
				var phone = $('#designerApplyForm input[name="userphone"]').val();
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
					url: "/Home/Sns/phoneCodePort",
					async: true,
					data: {
						'phone': phone,
						"code" : picCode
					},
					success: function(res) {
						var res = JSON.parse(res);
						if(res.status == 0) {
							dialog.msg(res.message);
						} else if(res.status = 1) {
							dialog.msg(res.message);
						}
					}
				});
			})
			
			function sendPhoneCode(){
				$("#designerApplyForm #sendCode").text('120s');
				var time=120;
				$("#designerApplyForm #sendCode").attr('disabled',"disabled").css('background-color', '#9c9c9c');
				var timer=setInterval(function(){
					time=time-1;
					$("#designerApplyForm #sendCode").text(time+'s');
					if(time<=0){
						clearInterval(timer);
						$("#designerApplyForm #sendCode").text('重新发送');
						$("#designerApplyForm #sendCode").attr('disabled',null);
					}
				},1000);
			}
			
			$(".codeimg, #code-change").on("click", function() {
				$(".codeimg").attr("src", "/Home/Sns/captcha");
			})
		</script>
	</body>

</html>