$("#location").distpicker();
//搜索=
$(".searchKeyWord").click(function(){
	var keyword=$('input[name="search"]').val();
	if(!keyword){
		return false;
	}
	$('.searchForm input[name="keyword"]').val(keyword);
	$('.searchForm').trigger('submit');
})
//轮播
function swiper(time) {
	var mySwiper = new Swiper('.swiper-container', {
		autoplay: time,
		loop: true,
		slidesPerView: 'auto', //'auto'
		prevButton: '.swiper-button-prev',
		nextButton: '.swiper-button-next',
		pagination: '.swiper-pagination',
		lazyLoading : true,
        paginationClickable :true,
		lazyLoadingInPrevNext : true,
	})
}

//滚动固定
function fixedBar(obj, position) {
	$(document).scroll(function() {
		var top = $(this).scrollTop();
		var width = $("#" + obj).css('width');
		if(top > position) {
			$("#" + obj).css({
				'position': 'fixed',
				'top': '0',
				'width': width
			})
		} else {
			$("#" + obj).css({
				'position': 'relative'
			})
		}
	})
}

//列表布局
function marginRight(obj, n) {
	var len = $("." + obj).length;
	var row = parseInt(len / n);
	for(var i = 1; i <= row; i++) {
		$("." + obj).eq(i * n - 1).css('margin-right', '0');
	}
}

//弹框类，定制服务
$(".header-top-need").click(function() {
	dialog.popBox('定制专属服务',"popBox");
})
$(".demand").click(function() {
	dialog.popBox('定制专属服务',"popBox");
})
//表单提交
$("#slefCommandForm #submit").click(function() {
	var username = $("#slefCommandForm input[name='username']").val();
	var userphone = $("#slefCommandForm input[name='userphone']").val();
	if(username == "" || userphone == "") {
		dialog.msg("请填写完整信息");
		return false;
	}
	//点击后按钮失效3s防止多次点击失效
	$(this).attr("disabled", "disabled");
	var data = $("#slefCommandForm").serialize();
	var url = "/Home/Order/custodyOrder";
	$.ajax({
		type: "post",
		url: url,
		async: true,
		data: data,
		success: function(res) {
			var res = JSON.parse(res);
			if(res.status == 0) {
				dialog.error(res.message);
			} else if(res.status == 1) {
				dialog.msg(res.message);
				$("#slefCommandForm input").each(function(index) {
					$(this).val("");
				});
			}
			$("#slefCommandForm #submit").attr('disabled',null);
		}
	});
})
//验证码
$('#slefCommandForm #sendCode').click(function() {
	var phone = $('#slefCommandForm input[name="userphone"]').val();
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

$(".codeimg, #code-change").on("click", function() {
	$(".codeimg").attr("src", "/Home/Sns/captcha");
})

function sendPhoneCode(){
	$("#slefCommandForm #sendCode").text('120s');
	var time=120;
	$("#slefCommandForm #sendCode").attr('disabled',"disabled").css('background-color', '#9c9c9c');
	var timer=setInterval(function(){
		time=time-1;
		$("#slefCommandForm #sendCode").text(time+'s');
		if(time<=0){
			clearInterval(timer);
			$("#slefCommandForm #sendCode").text('重新发送');
			$("#slefCommandForm #sendCode").attr('disabled',null);
		}
	},1000);
}
//收藏本站
function AddFavorite(title, url) {
  try {
      window.external.addFavorite(url, title);
  }
catch (e) {
     try {
       window.sidebar.addPanel(title, url, "");
    }
     catch (e) {
         alert("抱歉，您所使用的浏览器无法完成此操作。\n\n加入收藏失败，请使用Ctrl+D进行添加");
     }
  }
}

if (typeof(isQiyuShow) == 'undefined' || true == isQiyuShow) {
//	$.getScript('https://qiyukf.com/script/6ca5d79256c929e026ad58553e28795b.js',function () {
//		var w=window.innerWidth;
//		if (w>1280){
//			var  right=((w-1200)/2)-90;
//			$('#YSF-BTN-HOLDER').css('right',right+'px');
//		}else{
//			$('#YSF-BTN-HOLDER').css('right',0);
//		}
//		var h=window.innerHeight;
//		var top = h * 0.4 + 67;
//		$('#YSF-BTN-HOLDER').css('top', top + 'px');
//	})
}
if (typeof(isQQShow) == "undefined" || true == isQQShow) {
	setQQkefu();
}

function setQQkefu() {
	var h=window.innerHeight;
	var top=h*0.4;
	var top2=h*0.4+67+67;
	var w=window.innerWidth;
	$('.kefu-qq').css('top',top+'px');
    $('.come-top').css('top',top2+'px');
    if (w>1280){
    	var  right=((w-1200)/2)-90;
        $('.kefu-qq').css('right',right+'px');
        $('.come-top').css('right',right+'px');
        $('#YSF-BTN-HOLDER').css('right',right+'px');
	}else{
        $('.kefu-qq').css('right',0);
        $('.come-top').css('right',0);
        $('#YSF-BTN-HOLDER').css('right',0);
	}
}
$(window).resize(function () {
    setQQkefu();
})
/*回到顶部*/
$('.come-top').click(function () {
	$(document).scrollTop(0);
})
/*供应商上线后删除*/
$('.supplier').click(function () {
	layer.msg("系统即将上线，如有需要请直接联系客服");
})
/*跟单服务上线后删除*/
$('.order_track').click(function () {
    layer.msg("系统即将上线，如有需要请直接联系客服");
})
//图形验证码

