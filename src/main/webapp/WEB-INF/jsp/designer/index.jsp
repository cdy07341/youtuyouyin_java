<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>平面设计师-平面设计公司 -优图优印</title>
		<%@include file="../common/meta.jsp" %>
		<link rel="stylesheet" type="text/css" href="/youtuyouyin/static/css/designer.css" />
		<link rel="stylesheet" type="text/css" href="/youtuyouyin/static/js/swiper/css/swiper.min.css" />
	</head>

	<body>
		<%@include file="../common/header.jsp" %>
		<!--设计师列表-->
		<section class="designers">
			<!--主体-->
			<div class="wrap clearfix">
				<!--面包屑导航-->
				<div class="crumbs">
					<span>我的位置：</span>
					<span><a href="{:U('/Home/Index/index')}">优图优印</a></span> ＞
					<span><a href="{:U('/Home/Designer/index')}">找设计师</a></span>
					<span></span>
				</div>
				<!--主体左栏-->
				<div class="column_left">
					<!--筛选-->
					<div class="filter-box">
						<div class="filter-list">
							<div class="filter-line">
								<span class="title">所在城市</span>
								<div class="select-list" data-select="city">
									<a href="{:U('/Home/Designer/index')}" class="onSelect">全部</a>
									<!-- <volist name="hotCity" id="cityItem">
										<a href={:U( 'Home/Designer/index',array('city'=>$cityItem['id'],'desigType'=>$onSelect['desigType'],'range'=>$onSelect['range'],'special'=>$onSelect['special']))} 
											class=<if condition="$onSelect['city'] eq $cityItem['id']">onSelect</if>>{$cityItem.city}</a>
									</volist> -->
									<c:forEach items="${cityList }" var="cityListVal">
										<a href="">${cityListVal.city}</a>
									</c:forEach>
								</div>
							</div>
							<div class="filter-line">
								<span class="title">擅长类型</span>
								<div class="select-list" data-select="desigType">
									<a href="{:U('/Home/Designer/index')}" class="onSelect">全部</a>
<!-- 									<volist name="hotDesignType" id="typeItem">
										<a href={:U( 'Home/Designer/index',array('city'=>$onSelect['city'],'desigType'=>$typeItem["id"],'range'=>$onSelect['range'],'special'=>$onSelect['special']))} 
											class=<if condition="$onSelect['desigType'] eq $typeItem['id']">onSelect</if>>{$typeItem.name}</a>
									</volist> -->
									<c:forEach items="${designTypeSelect }" var="designTypeSelectVal">
										<a href="">${designTypeSelectVal.name }</a>							
									</c:forEach>
								</div>
							</div>
							<div class="filter-line">
								<span class="title">设计价格</span>
								<div class="select-list" data-select="range">
									<a href="" class="onSelect">全部</a>
									<!-- <volist name="priceRange" id="rangeItem">
										<a href={:U( 'Home/Designer/index',array('city'=>$onSelect['city'],'desigType'=>$onSelect['desigType'],'range'=>$rangeItem["id"],'special'=>$onSelect['special']))} 
											class=<if condition="$onSelect['range'] eq $rangeItem['id']">onSelect</if>>{$rangeItem.value}</a>
									</volist> -->
									<c:forEach items="${priceSelect }" var="priceSelectVal">
										<a href="">${priceSelectVal.value }</a>
									</c:forEach>
								</div>
							</div>
							<div class="filter-line">
								<span class="title">特殊技能</span>
								<div class="select-list" data-select="range">
									<a href="" class="onSelect">全部</a>
									<!-- <volist name="special" id="specialItem">
										<a href={:U( 'Home/Designer/index',array('city'=>$onSelect['city'],'desigType'=>$onSelect['desigType'],'range'=>$onSelect["range"],'special'=>$specialItem['id']))} 
											class=<if condition="$onSelect['special'] eq $specialItem['id']">onSelect</if>>{$specialItem.name}</a>
									</volist> -->
									<c:forEach items="${specialSkill }" var="specialSkillVal">
										<a href="">${specialSkillVal.name }</a>
									</c:forEach>
								</div>
							</div>
						</div>
					</div>
					<!--专栏推荐设计师-->
					<div class="designer-recommend-wrap">
						<div class="designer-recommend-inner">
							<div class="designer-recommend-title">
								<span>推荐设计师</span>
								<a href="">我也要出现在这里</a>
							</div>
							<div id="designer-recommend" class="swiper-container">
								<div class="swiper-wrapper designer-recommend-list">
									<?php for ($i=0; $i < count($recommend);) {?>
										<div class="swiper-slide">
											<?php 
                                            for ($j = 0; $j < 3; $j++) { 
											     if (!empty($recommend[$i + $j])) {
											?>
											<a href="<?php echo U( 'Home/Designer/detail',array( 'id'=>$recommend[$i + $j]['id']))?>">
												<img src="<?php echo !empty($recommend[$i + $j]['avatar']) ? $recommend[$i + $j]['avatar'] : 'http://www.youtuyouyin.com/Public/images/defaultAvatar.jpg'; ?>" alt="优图优印签约设计师<?php echo $recommend[$i + $j]['true_name']; ?>" />
												<p><?php echo $recommend[$i + $j]['true_name']; ?></p>
											</a>
											<?php }} ?>
										</div>
									<?php $i += 3;} ?>
								</div>
								<div class="swiper-button-prev"></div>
								<div class="swiper-button-next"></div>
							</div>
						</div>
					</div>
					<!--排序-->
					<div class="order-box">
						<ul class="order-list">
							<li class="order-item">
								<a href={:U( 'Home/Designer/index',array( 'city'=>$onSelect['city'],'desigType'=>$onSelect['desigType'],'range'=>$onSelect['range']))}>默认排序</a>
							</li>
							<li class="order-item">
								<a href={:U( 'Home/Designer/index',array( 'city'=>$onSelect['city'],'desigType'=>$onSelect['desigType'],'range'=>$onSelect['range'],'orderBy'=>"app"))}>预约数<i class="iconfont icon-jiantou"></i></a>
							</li>
						</ul>
					</div>
					<div class="designer-recommend">
						<!--设计师身份卡片-->
						<volist name="list" id="desiognerItem">
							<div class="designer-list">
								<!--设计师信息-->
								<div class="designer-detail-box clearfix">
									<!--设计师头像-->
									<div class="designer-headphone fl">
										<a href={:U( 'Home/Designer/detail',array( 'id'=>$desiognerItem['id']))}><img src="<if condition="$desiognerItem.avatar eq '' ">http://www.youtuyouyin.com/Public/images/defaultAvatar.jpg<else />{$desiognerItem.avatar}</if>" alt="优图优印签约设计师{$desiognerItem.true_name}" /></a>
									</div>
									<!--设计师信息-->
									<div class="designer-detail fl clearfix">
										<!--文字信息-->
										<div class="designer-detail-left fl">
											<div class="deigner-name clearfix">
												<a href={:U( 'Home/Designer/detail',array( 'id'=>$desiognerItem['id']))}>{$desiognerItem.true_name}</a>
												<!--设计师身份标签-->
												<!--<span id="tuijian" class="designer-tag"></span>
												<span id="shiming" class="designer-tag"></span>-->
											</div>
											<p class="p-line"><span class="line-title designer-position">所在城市<em>{$desiognerItem.city}-{$desiognerItem.district}</em></span><span class="line-title designer-num">作品数量<em><?php $count=D("DesignInfo")->designCount($desiognerItem["id"]);echo $count ;?></em></span></p>
											<p class="p-line"><span class="line-title">擅长类型<em><?php echo $style=D("DesignTypeSelect")->getNameById($desiognerItem['serve1']);?>&nbsp;&nbsp;&nbsp;&nbsp;<?php echo $style=D("DesignTypeSelect")->getNameById($desiognerItem['serve2']);?>&nbsp;&nbsp;&nbsp;&nbsp;<?php echo $style=D("DesignTypeSelect")->getNameById($desiognerItem['serve3']);?></em></span></p>
											<p class="p-line"><span class="line-title">对应价格<em><?php echo $price=D("PriceSelect")->getValueById($desiognerItem['price1']) ;?>&nbsp;&nbsp;<?php echo $price=D("PriceSelect")->getValueById($desiognerItem['price2']) ;?>&nbsp;&nbsp;<?php echo $price=D("PriceSelect")->getValueById($desiognerItem['price3']) ;?></em></span></p>
											<div class="designer-data">
												<div class="num-box fl">
													<span>预约数</span>
													<span class="hight-light-text">{$desiognerItem.appointment}</span>
												</div>
												<!--<span class="cutting_line"></span>-->
												<!--<div class="num-box fl">
													<span>签单数</span>
													<span class="hight-light-text">0</span>
												</div>-->
												<!--<span class="cutting_line"></span>
												<div class="num-box fl">
													<span class="hight-color">评价</span>
													<a href="" target="_blank">
														<span class="hight-light-text hight-color">0</span>
													</a>
												</div>-->
											</div>
										</div>
										<!--联系设计师-->
										<div class="designer-detail-right">
											<ul>
												<!--预约短信-->
												<!--<li class="list-designer-entrust"><i class="iconfont icon-yuyue"></i>委托设计</li>-->
												<if condition="$_SESSION['userdata'][uid] neq $desiognerItem['uid']">
													<!--询价单-->
													<li class="list-designer-ask" data-id="{$desiognerItem.id}"><i class="iconfont icon-yibaojia"></i>询问报价</li>
													<!--及时通讯-->
													<li class="list-designer-phone friendItem" Id="{$desiognerItem.uid}" Name="{$desiognerItem.true_name}" Avatar="{$desiognerItem.avatar}" data-id="{$desiognerItem.id}"><i class="iconfont icon-sixin"></i>立即联系</li>
												</if>
											</ul>
										</div>
									</div>
									<if condition="$desiognerItem['recommend'] neq 0">
										<i class="iconfont icon-recommend-right" id="recommend-icon"></i>
									</if>
								</div>
								<if condition="$count neq 0">
									<!--设计作品图片列表-->
									<div class="designer-design-box">
										<ul>
											<?php $design=D('DesignInfo')->indexDesign($desiognerItem["id"]);?>
											<volist name="design" id="designItem">
												<?php $designPic=D('DesignInfoContent')->getDesignPicById($designItem["id"]);?>
												<volist name="designPic" id="designPicUrl">
													<li>
														<a href={:U( 'Home/Design/detail',array( 'id'=>$designItem["id"]))}><img src="{$designPicUrl.design_img_url|replacePicUrl}" alt="{$designPicUrl.design_img_title}" /></a>
													</li>
												</volist>
											</volist>
										</ul>
									</div>
								</if>
							</div>
						</volist>
					</div>
					<!--分页-->
					<div class="page">
						{$page}
					</div>
				</div>
				<!--主体右栏-->
				<div class="column_right">
					<!--委托设计快速申请表-->
					<form method="post" class="right-bar-form" id="addDemand">
						<div class="right-bar-title">
							<p>申请委托服务</p>
							<p>快速发布需求 ,无忧服务</p>
						</div>
						<div class="form-input">
							<input type="text" name="username" id="" value="" placeholder="您的称呼" maxlength="10"/>
						</div>
						<div class="form-input">
							<input type="text" name="userphone" id="user_phone" placeholder="您的手机号码" class="user-phone" maxlength="11"/>
						</div>
						<div class="form-input clearfix">
							<input type="text" name="code" id="verification-code" placeholder="验证码" maxlength="6" />
							<button type="button" id="send-code">获取验证码</button>
						</div>
						<div class="form-input">
							<button type="button" id="submit">立即提交</button>
						</div>
						<div class="right-bar-title">
							<p>* 优图优印将严格保护您的隐私</p>
						</div>
					</form>
					<!--doubt-->
					<div class="doubt">
						<p class="doubt-header" style="text-align: center;">优图优印<em></em>一站式服务</p>
						<p class="total-1">一对一专属设计师打造最佳定制</p>
						<p class="total-2">在线担保交易保障您的资金安全</p>
						<ul class="deal">
							<li class="deal-left">
								<i class="iconfont icon-kefu"></i>
							</li>
							<li class="deal-right">
								<p class="total">不懂设计？不懂印刷？</p>
								<p class="word">一对一客服服务，全程跟进解决设计、印刷服务</p>
							</li>
						</ul>
						<ul class="deal">
							<li class="deal-left">
								<i class="iconfont icon-baozhang"></i>
							</li>
							<li class="deal-right">
								<p class="total">担心设计不满意？</p>
								<p class="word">分阶段确认设计，每个阶段修改至您满意为止</p>
							</li>
						</ul>
						<ul class="deal">
							<li class="deal-left">
								<i class="iconfont icon-baozhang"></i>
							</li>
							<li class="deal-right">
								<p class="total">担心印刷质量不合格？</p>
								<p class="word">印刷全程，专业人员跟踪确认。确保质量100%</p>
							</li>
						</ul>
						<ul class="deal">
							<li class="deal-left">
								<i class="iconfont icon-jiaoyi"></i>
							</li>
							<li class="deal-right">
								<p class="total">不放心在线交易？</p>
								<p class="word">优图优印免费帮您保障资金安全，满意了才付设计费</p>
							</li>
						</ul>
					</div>
					<!--右侧banner1-->
					<!--上线替换-->
					<!--侧边广告-->
					<!--<div class="right-bar-banner">-->
						<!--<a href=""><img src="__PUBLIC__/images/right-bar-banner.png" /></a>-->
					<!--</div>-->
				</div>
			</div>
		</section>
		<%@include file="../common/footer.jsp" %>
		<%@include file="../common/commonScript.jsp" %>
		<script src="/youtuyouyin/static/js/swiper/js/swiper.min.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			var mySwiper = new Swiper('.swiper-container', {
				// autoplay: 2000,
				loop: true,
				prevButton: '.swiper-button-prev',
				nextButton: '.swiper-button-next',
			})
			fixedBar('addDemand', '230');
			var sessionData = "<?php echo $_SESSION['userdata'];?>";
			
			$(function(){
				//分页效果
				var url = location.href;
				var currentPage = url.match(/\d+/);
				if(!currentPage) {
					$(".page>div span:first-child").addClass('on')
				} else {
					$(".page>div>span").addClass('on')
				}
				//报价弹框
				$(".list-designer-ask").click(function() {
					dialog.popBox('填写报价内容', "quoation");
					var DesignerId = $(this).attr('data-id');
					$(".popForm #desigerId").attr('value',DesignerId);
				})
				//报价表单提交
				$("#quoation .popForm #submit").click(function() {
					if($("#quoation .popForm input[name='username']").val() == "") {
						dialog.msg("请填写您的称呼");
						return false;
					}
					if($("#quoation .popForm input[name='mark']").val() == "") {
						dialog.msg("请填写您的询价内容");
						return false;
					}
					var url = "/Home/Order/quoationOrder";
					var data = $("#quoation .popForm").serialize();
					$(this).attr('disabled', 'disabled');
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
							}
							setTimeout(function() {
								layer.closeAll()
							}, 1000)
						}
					});
				});
				//立即联系
				$(".list-designer-phone").click(function() {
					if (sessionData == null || '' == sessionData) {
						dialog.error('请先<a href="/Home/Login/index.html" style="color:#00d9b5">登录</a>');
						return false;
					}
					dialog.popBox('填写联系信息', "connect");
					var DesignerId = $(this).attr('data-id');
					$(".popForm #desigerId").attr('value',DesignerId);
				})
				//立即联系表单提交
				$("#connect .popForm #submit").click(function() {
					if($("#connect .popForm input[name='username']").val() == "") {
						dialog.msg("请填写您的称呼");
						return false;
					}
					if($("#connect .popForm input[name='mark']").val() == "") {
						dialog.msg("请填写需求");
						return false;
					}
					var url = "/Home/Order/addConnection";
					var data = $("#connect .popForm").serialize();
					$(this).attr('disabled', 'disabled');
					$.ajax({
						type: "post",
						url: url,
						async: true,
						data: data,
						success: function(res) {
							if(res.status == 0) {
								dialog.error(res.message);
							} else if(res.status == 1) {
								dialog.msg(res.message);
							}
							setTimeout(function() {
								layer.closeAll()
							}, 1000)
						}
					});
				});
				//快速发布
				$("#addDemand #submit").click(function() {
					var username = $("#addDemand input[name='username']").val();
					var userphone = $("#addDemand input[name='userphone']").val();
					var code=$("#addDemand input[name='verification-code']").val();
					if(username == "" || userphone == "") {
						dialog.msg("请填写完整信息");
						return false;
					}
					if(!(/^1[34578]\d{9}$/.test(userphone))) {
						dialog.msg("请输入正确的手机号码");
						return false;
					}
					if(code==""){
						dialog.msg("请填写验证码");
						return false;
					}
					//点击后按钮失效3s防止多次点击失效
					var data = $("#addDemand").serialize();
					var url = "/Home/Order/custodyOrder";
					$.ajax({
						type: "post",
						url: url,
						async: true,
						data: data,
						success: function(res) {
							var res = JSON.parse(res);
							if(res.status == 0) {
								dialog.msg(res.message);
							} else if(res.status == 1) {
								dialog.msg(res.message);
								$("form input").each(function(index) {
									$(this).val("");
								});
							}
						}
					});
				})
				//获取验证码
				$('#addDemand #send-code').click(function() {
					var phone = $('#addDemand input[name="userphone"]').val();
					if(!phone || !(/^1[34578]\d{9}$/.test(phone))) {
						dialog.msg("手机号码不正确");
						return false;
					}
					$.ajax({
						type: "post",
						url: "/Home/Sns/phoneCodePort",
						async: true,
						data: {
							'phone': phone
						},
						success: function(res) {
							var res = JSON.parse(res);
							if(res.status == 0) {
								dialog.msg(res.message);
							} else if(res.status = 1) {
								dialog.msg(res.message);
								sendPhoneCode();
							}
						}
					});
				})
				
				function sendPhoneCode(){
					$("#addDemand #send-code").text('120s');
					var time=120;
					$("#addDemand #send-code").attr('disabled',"disabled");
					var timer=setInterval(function(){
						time=time-1;
						$("#addDemand #send-code").text(time+'s');
						if(time<=0){
							clearInterval(timer);
							$("#addDemand #send-code").text('重新发送');
							$("#addDemand #send-code").attr('disabled',null);
						}
					},1000);
				}
			})	
		</script>
	</body>

</html>