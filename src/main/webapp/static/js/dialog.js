var dialog = {
	// 错误弹出层
	error: function(message) {
		layer.open({
			content: message,
			icon: 2,
			title: '错误提示',
		});
	},

	//成功弹出层
	success: function(message, url) {
		layer.open({
			content: message,
			icon: 1,
			yes: function() {
				location.href = url;
			},
		});
	},

	// 确认弹出层
	confirm: function(message, url) {
		layer.open({
			content: message,
			icon: 3,
			btn: ['是', '否'],
			yes: function() {
				location.href = url;
			},
		});
	},

	//无需跳转到指定页面的确认弹出层
	toconfirm: function(message) {
		layer.open({
			content: message,
			icon: 3,
			btn: ['确定'],
		});
	},
	//表单提示tip
	tips: function(message, obj) {
		layer.tips(message, obj, {
			tips: [2, "#4085c0"]
		});
	},
	//自定义弹出页面
	page: function(html) {
		layer.open({
			type: 1,
			title: false,
			closeBtn: 1,
			shadeClose: true,
			area: '100% 100%',
  			skin: 'layui-layer-nobg', //没有背景色
			content: html
		});
	},
	msg: function(message, url) {
		//提示层
		if(url == "" || url == undefined) {
			layer.msg(message);
		}else{
			layer.msg(message);
			setTimeout(function() {
				location.href = url;
			}, 1000);
		}
	},
	popBox:function(title,obj){
		//页面层
		layer.open({
		  type: 1,
		  title: title,
		  skin: 'layui-layer-rim', //加上边框
		  area: ['380px', 'auto'], //宽高
		  content: $('#'+obj)
		});
	}
}