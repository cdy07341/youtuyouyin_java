//用户注册
var registe = {
	//手机号码验证
	checkPhone: function() {
		var phone = $("input[name='userphone']").val();
		if(!(/^1[34578]\d{9}$/.test(phone))) {
			dialog.tips("请输入正确的手机号码", "#userphone");
			return false;
		}
		if(!phone) {
			dialog.tips("请输入11位手机号码", "#userphone");
			return false;
		}
	},
	//密码验证
	checkPass: function() {
		var pass = $("input[name='password']").val();
		if(pass.length < 8) {
			dialog.tips("请输入长度大于8位的数字和字母密码", "#password");
			return false;
		} else if(pass.length >= 15) {
			dialog.tips("密码的最大长度为15位数字或字母", "#password");
		}
	},
	//重复密码验证
	checkRePass: function() {
		var pass = $("input[name='password']").val();
		var repass = $("input[name='re-password']").val();
		if(pass == "") {
			dialog.tips("请输入密码", "#re-password");
			return false;
		} else if(repass == "") {
			dialog.tips("请输入重复密码", "#re-password");
			return false;
		} else if(pass !== repass) {
			dialog.tips("两次密码不一致", "#re-password");
			return false;

		}
	},
	//邮箱验证
	checkEmail: function() {
		var email = $("input[type='email']").val();
		if(!(/^[0-9a-z][_.0-9a-z-]{0,31}@([0-9a-z][0-9a-z-]{0,30}[0-9a-z]\.){1,4}[a-z]{2,4}$/.test(email))) {
			dialog.tips("请输入正确的邮箱地址", "#useremail");
			return false;
		}
		if(email == "") {
			dialog.tips("邮箱不能为空", "#useremail");
			return false;
		}
	},
	//年龄验证
	checkYears: function() {
		var old = $("input[name='years']").val();
		if(old.length > 3 || old.length < 1) {
			dialog.tips("亲，年龄可不要填错了哦！", "#years");
			return false;
		}
		if(old == "") {
			dialog.tips("年龄不能为空", "#years");
			return false;
		}
	},
	//真实姓名验证
	checkName: function() {
		var name = $("input[name='true_name']").val();
		if(name == "") {
			dialog.tips("亲，用户名不能为空哦", "#true_name");
			return false;
		} else {
			if(!(/^([a-z\u4E00-\u9FA5])+$/i.test(name))) {
				dialog.tips("亲，用户名只能为汉子或字母哦！", "#true_name");
				return false;
			}
		}
	},
	//验证毕业学校
	checkGraduation: function() {
		var school = $("input[name='graduation']").val();
		if(school == "") {
			dialog.tips("填写教育经历会加分哦！", "#graduation");
			return false;
		}
	},
	//验证专业
	checkMajor: function() {
		var major = $("input[name='major']").val();
		if(major == "") {
			dialog.tips("填写教育经历会加分哦！", "#major");
			return false;
		}
	},
	//验证描述
	checkDescription: function() {
		var description = $("textarea[name='description']").val();
		if(description == "") {
			dialog.tips("详细的描述会让用户更加喜欢", "#self-description");
			return false;
		}
		if(description.length >= 200) {
			dialog.tips("字数已经达到上限", "#self-description");
			return false;
		}
	},
	//验证设计风格 只能选择3个
	checkDesignStyle: function() {
		var checkLen = $(".designer-style input:checked").length;
		if(checkLen !== 3) {
			dialog.tips("请选择三项设计风格", "#designerStyle");
			return false;
		}
		if(checkLen > 3) {
			dialog.tips("亲，只能选择三项设计风格", "#designerStyle");
			return false;
		}
	},
	//验证性别是否为空
	checkSex: function() {
		var sex = $("input[name='sex']:checked").val();
		if(sex == undefined) {
			dialog.tips("亲，请选择您的性别", ".sex-radio");
			return false;
		}
	},
	//是否同意
	checkAgreet: function() {
		if($("#agreet").is(":checked") == false) {
			dialog.tips("请同意！", "#agreetLink");
			return false;
		}
	},
	//验证订单用户名
	checkOrderName: function(obj, name) {
//		var preg = /[\u4E00-\u9FA5]+$/;
		if(name == "") {
			dialog.tips("请填写您的姓名！", "#" + obj);
			return false;
		}
//		if(preg.test(name) == false) {
//			dialog.tips("姓名只能为汉字哦！", "#" + obj);
//			return false;
//		}
	},
	//验证订单手机
	checkOrderPhone: function(obj, phone) {
		if(!phone) {
			dialog.tips("请输入11位手机号码", "#" + obj);
			return false;
		}
		if(!(/^1[34578]\d{9}$/.test(phone))) {
			dialog.tips("请输入正确的手机号码", "#" + obj);
			return false;
		}
	},
	clearForm: function() {
		$("form input").each(function(index) {
			$(this).val("");
		});
		$("form textarea").each(function(index) {
			$(this).val("");
		});
	}
}

/*表单绑定事件*/
$("#userphone").focusout(function() {
	registe.checkPhone();
})
$("#password").focusout(function() {
	registe.checkPass();
})
$("#re-password").focusout(function() {
		registe.checkRePass();
	})
	/*普通用户注册*/
$(".registe-form #submit").click(function() {
		if(registe.checkPhone() == false) {
			return false;
		}
		if(registe.checkPass() == false) {
			return false;
		}
		if(registe.checkRePass() == false) {
			return false;
		}
		var phoneCode=$("input[name='code']").val();
		if(phoneCode==""){
			dialog.msg("请填写验证码");
			return false;
		}
		//提交数据
		var url = "/youtuyouyin/register/add";
		var data = $(".registe-form").serializeArray();
		$.ajax({
			type: "post",
			url: url,
			async: true,
			data: data,
			success: function(res) {
				if(res.code == 0) {
					dialog.error(res.msg);
				} else if(res.code = 1) {
					dialog.success(res.msg, res.data);
				}
			}
		});
	})
	/*用户登录*/
$("#accountLoginBtn").click(function() {
		if(registe.checkPhone() == false) {
			return false;
		}
		var url = "/youtuyouyin/login/dologin";
		var data = $("#LoginForm").serializeArray();
		$.ajax({
			type: "post",
			url: url,
			async: true,
			data: data,
			success: function(res) {
				if(res.code == 0) {
					dialog.error(res.msg);
				} else if(res.code == 1) {
					dialog.msg(res.msg, res.data);
				}
			}
		});
	})
	/*设计师申请表单*/
$("#true_name").focusout(function() {
	registe.checkName();
})
$("#years").focusout(function() {
	registe.checkYears();
})
$("#useremail").focusout(function() {
	registe.checkEmail();
})
$("#graduation").focusout(function() {
	registe.checkGraduation();
})
$("#major").focusout(function() {
	registe.checkMajor();
})
$("#self-description").focusout(function() {
		registe.checkDescription();
	})
	//提交申请
$("#designerApplyForm #submit").click(function() {
	if(registe.checkName() == false) {
		return false;
	}
	if(registe.checkPhone() == false) {
		return false;
	}
	var phoneCode=$("input[name='code']").val();
	if(phoneCode==""){
		dialog.msg("请填写验证码");
		return false;
	}
	if(registe.checkPass() == false) {
		return false;
	}
	if(registe.checkRePass() == false) {
		return false;
	}
	if(registe.checkSex() == false) {
		return false;
	}
	if(registe.checkYears() == false) {
		return false;
	}
	if(registe.checkEmail() == false) {
		return false;
	}
	if(registe.checkGraduation() == false) {
		return false;
	}
	if(registe.checkMajor() == false) {
		return false;
	}
	if(registe.checkDescription() == false) {
		return false;
	}
	if(registe.checkDesignStyle() == false) {
		return false;
	}
	if(registe.checkAgreet() == false) {
		return false;
	}

	var url = "/Home/DesignerApply/designerApply";
	var data = $("#designerApplyForm").serializeArray();
	$.ajax({
		type: "post",
		url: url,
		async: true,
		data: data,
		success: function(result) {
			var res = JSON.parse(result);
			if(res.status == 0) {
				dialog.error(res.message);
			} else if(res.status == 1) {
				dialog.msg(res.message, res.data);
			}
		}
	});
})
$("#userApplyForm #submit").click(function() {
		if(registe.checkName() == false) {
			return false;
		}
		if(registe.checkPhone() == false) {
			return false;
		}
		if(registe.checkSex() == false) {
			return false;
		}
		if(registe.checkYears() == false) {
			return false;
		}
		if(registe.checkEmail() == false) {
			return false;
		}
		if(registe.checkGraduation() == false) {
			return false;
		}
		if(registe.checkMajor() == false) {
			return false;
		}
		if(registe.checkDescription() == false) {
			return false;
		}
		if(registe.checkDesignStyle() == false) {
			return false;
		}
		if(registe.checkAgreet() == false) {
			return false;
		}

		var url = "/Home/DesignerApply/userToDesigner";
		var data = $("#userApplyForm").serializeArray();
		$.ajax({
			type: "post",
			url: url,
			async: true,
			data: data,
			success: function(result) {
				var res = JSON.parse(result);
				if(res.status == 0) {
					dialog.error(res.message);
				} else if(res.status == 1) {
					dialog.msg(res.message, res.data);
				}
			}
		});
	})
	//用户基本信息修改
$("#editBaseInfo #submit").click(function() {
	if(registe.checkName() == false) {
		return false;
	}
	if(registe.checkEmail() == false) {
		return false;
	}

	//点击后按钮失效3s防止多次点击失效
	$(this).attr("disabled", "disabled")
	var url = "/Home/UserInfo/editBaseInfo";
	var data = $("#editBaseInfo").serializeArray();
	$.ajax({
		type: "post",
		url: url,
		async: true,
		data: data,
		success: function(result) {
			var res = JSON.parse(result);
			if(res.status == 0) {
				$("#editBaseInfo #submit").attr('disabled',null);
				dialog.error(res.message);
			} else if(res.status == 1) {
				dialog.msg(res.message);
				setTimeout(function(){
					history.go(0);
				},1000);
			}
		}
	});
})
$("#editDesignerForm #submit").click(function() {
		if(registe.checkDescription() == false) {
			return false;
		}
		if(registe.checkDesignStyle() == false) {
			return false;
		}

		//点击后按钮失效3s防止多次点击失效
		$(this).attr("disabled", "disabled");
		var url = "/Home/UserInfo/editDesignerInfo";
		var data = $("#editDesignerForm").serializeArray();
		$.ajax({
			type: "post",
			url: url,
			async: true,
			data: data,
			success: function(result) {
				var res = JSON.parse(result);
				if(res.status == 0) {
					$("#editDesignerForm #submit").attr("disabled", null);
					dialog.error(res.message);
				} else if(res.status == 1) {
					dialog.msg(res.message);
					//清楚表单数据防止重复提交
					setTimeout(function(){
						history.go(0);
					},1000);
				}
			}
		});
	})
	//修改密码
$("#edit-password #submit").click(function() {
		if($("#oldpass").val() == "" || ($("#oldpass").val()).length < 8) {
			dialog.tips("请填写原密码", "#oldpass");
			return false;
		}
		if(registe.checkPass() == false) {
			return false;
		}
		if(registe.checkRePass() == false) {
			return false;
		}

		//点击后按钮失效点击失效
		$(this).attr("disabled", "disabled")
		var url = "/Home/UserInfo/editPassword";
		var data = $("#edit-password").serializeArray();
		$.ajax({
			type: "post",
			url: url,
			async: true,
			data: data,
			success: function(result) {
				var res = JSON.parse(result);
				if(res.status == 0) {
					$("#edit-password #submit").attr('disabled',null);
					dialog.error(res.message);
				} else if(res.status == 1) {
					dialog.msg(res.message);
					//清楚表单数据防止重复提交
					registe.clearForm();
				}
			}
		});
	})
//用户创建订单
$("#from_name").focusout(function() {
	registe.checkOrderName("from_name", $("#from_name").val());
})
$("#to-name").focusout(function() {
	registe.checkOrderName("to-name", $("#to-name").val());
})
$("#from_phone").focusout(function() {
	registe.checkOrderPhone("from_phone", $("#from_phone").val());
})
$("#to_phone").focusout(function() {
	registe.checkOrderPhone("to_phone", $("#to_phone").val());
})
$("#all_pay").focusout(function() {
		if(($("#all_pay").val()) == "") {
			dialog.tips("请填写设计全款金额", "#all_pay");
			return false;
		}
	})
	//订单提交
$("#create-order-form #submit").click(function() {
	var orderTile = $("#order_title").val();
	var orderContent = $("#order_content").val();
	var orderPriod = $("#order_priod").val();

	//提交验证
	if(registe.checkOrderName("from_name", $("#from_name").val()) == false) {
		return false;
	}
	if(registe.checkOrderPhone("from_phone", $("#from_phone").val()) == false) {
		return false;
	}
	if(registe.checkOrderName("to_name", $("#to_name").val()) == false) {
		return false;
	}
	if(registe.checkOrderPhone("to_phone", $("#to_phone").val()) == false) {
		return false;
	}
	if(orderTile == "" || orderPriod == "" || orderContent == "") {
		dialog.tips("请输入完整订单信息！", "#order-info-content");
		return false;
	}
	if(($("#all_pay").val()) == "") {
		dialog.tips("请填写设计全款金额", "#all_pay");
		return false;
	}
	if(($("select[name='pay_type']").val()) == "1") {
		var p = $("#all_pay").val();
		var p1 = $("#first_pay").val();
		var p2 = $("#end_pay").val();
		if(p1 == "" || p2 == "") {
			dialog.msg("请填写分期付款信息");
			return false;
		}
		if(parseInt(p1) + parseInt(p2) !== parseInt(p)) {
			dialog.msg("订单金额填写错误，请核查");
			return false;
		}
	}
	if(registe.checkAgreet() == false) {
		dialog.tips("请同意！", ".agreetLink");
		return false;
	}
	//点击后按钮失效3s防止多次点击失效
	$(this).attr("disabled", "disabled")
	setTimeout(function() {
		$("#create-order-form #submit").removeAttr("disabled");
	}, 3000);

	var url = "/Home/Order/createOrder";
	var data = $("#create-order-form").serializeArray();
	//修改订单请求
	if($(this).hasClass("edit")) {
		var url = "/Home/Order/editOrder";
		$.ajax({
			type: "post",
			url: url,
			async: true,
			data: data,
			success: function(result) {
				var res = JSON.parse(result);
				if(res.status == 0) {
					dialog.error(res.message);
				} else if(res.status == 1) {
					window.location.href='/Home/UserCenter/orderCenter.html'
					//清楚表单数据防止重复提交
					registe.clearForm();
				}
			}
		});
	} else {
	//创建订单请求
		var url = "/Home/Order/createOrder";
		$.ajax({
			type: "post",
			url: url,
			async: true,
			data: data,
			success: function(result) {
				var res = JSON.parse(result);
				if(res.status == 0) {
					dialog.error(res.message);
				} else if(res.status == 1) {
					window.location.href='/Home/UserCenter/orderCenter.html'
					//清楚表单数据防止重复提交
					registe.clearForm();
				}
			}
		});
	}

})
//添加作品
$("#add-design-form #submit").click(function(){
	var priod=$("input[name='design-priod']").val();
	var tit=$("input[name='design-title']").val();
	var cont=$("textarea[name='design-description']").val();
	if(!priod){
		dialog.msg("请填写作品设计周期");
		return false;
	}
	if(!tit){
		dialog.msg("请填写作品设计标题");
		return false;
	}
	if(!cont){
		dialog.msg("请填写作品设计内容和其他描述");
		return false;
	}
	if($(".design-pic-item img").length==0){
		dialog.msg("您还没有上传作品图片");
		return false;
	}
	$(this).off('click');
	var url = "/Home/Design/ajaxAddDesign";
	var data = $("#add-design-form").serializeArray();
	$.ajax({
		type: "post",
		url: url,
		async: true,
		data: data,
		success: function(result) {
			var res = JSON.parse(result);
			if(res.status == 0) {
				$("#add-design-form #submit").on('click')
				dialog.error(res.message);
			} else if(res.status == 1) {
				dialog.msg(res.message);
				//清楚表单数据防止重复提交
				setTimeout(function () {
					history.go(0);
                },1000);
			}
		}
	});
})
