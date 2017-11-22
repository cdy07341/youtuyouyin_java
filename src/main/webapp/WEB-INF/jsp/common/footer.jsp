<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--footer-->
<footer>
	<div class="wrap">
		<div class="footer-content clearfix">
			<!--<div class="android foot-item">-->
				<!--<p>Android版App下载</p>-->
				<!--<img src="/youtuyouyin/static/img/common/app_andriod.png" alt="" />-->
			<!--</div>-->
			<!--<div class="ios foot-item">-->
				<!--<p>IOS版App下载</p>-->
				<!--<img src="/youtuyouyin/static/img/common/app_ios.jpg" alt="" />-->
			<!--</div>-->
			<div class="weixin foot-item" style="margin-right: 500px">
				<p>微信服务号</p>
				<img src="/youtuyouyin/static/img/common/app_weixin.jpg" alt="" />
			</div>
			<div class="contant">
				<div class="clearfix">
					<i class="iconfont icon-kefu"></i>
					<div class="contant-detail">
						<p>021-3166-1676</p>
						<p>周一至周六 9：00-20：00</p>
					</div>
				</div>
				<div class="clearfix">
					<i class="iconfont icon-QQ"></i>
					<div class="contant-detail">
						<p>2894508896</p>
						<p>周一至周六 9：00-20：00</p>
					</div>
				</div>
				<div class="clearfix">
					<i class="iconfont icon-weibo"></i>
					<div class="contant-detail">
						<a href="http://weibo.com/5586086184/profile?topnav=1&wvr=6" target="_blank" style="line-height: 50px;font-size: 22px;color: #FFFFFF;height: 50px;">官方微博</a>
					</div>
				</div>
			</div>
		</div>
		<!--底部版权-->
		<div class="footer-bottom">
			<ul>
				<li>
					<a href="{:U('/Home/Introduction/about')}">关于我们</a>
				</li>
				<li>
					<a href="{:U('/Home/Introduction/pay')}">支付说明</a>
				</li>
				<li>
					<a href="{:U('/Home/Introduction/distribution')}">配送说明</a>
				</li>
				<li>
					<a href="{:U('/Home/Introduction/invoice')}">发票说明</a>
				</li>
				<li>
					<a href="{:U('/Home/Introduction/exchanged')}">退换货说明</a>
				</li>
				<li>
					<a href="{:U('/Home/Introduction/print')}">印刷须知</a>
				</li>
				<li>
					<a href="{:U('/Home/Introduction/servers')}">服务条款</a>
				</li>
				<li>
					<a href="{:U('/Home/Introduction/cooperation')}">供应商招募</a>
				</li>
			</ul>
			<p class="statement">免责声明：本网站部分内容由用户自行上传，如权利人发现存在误传其作品情形，请及时与本站联系。</p>
			<p class="allright">Copyright©御今文化发展（上海）有限公司 沪ICP备15016673号</p>
		</div>
	</div>
</footer>
<!--qq客服-->
<div class="kefu-qq">
	<a href="http://wpa.qq.com/msgrd?v=3&uin=2894508896&site=qq&menu=yes" class="kefu-qq-wrap" target="_blank">
		<img src="/youtuyouyin/static/img/common/qqkefu.png" alt=""/>
	</a>
</div>
<div class="come-top">
</div>
<!--定制需求弹框 公共部分-->
<include file="Athers/popBox" />
