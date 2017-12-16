<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--header-top 开始-->
<div class="header-top">
	<div class="wrap">
		<div class="header-top-left fl">
			<a onclick="AddFavorite('优图优印官网','www.youtuyouyin.com')"><i class="iconfont icon-shoucang"></i>收藏优图优印</a>
			<a class="header-code-wrap rel" href="javascript:;"><i class="iconfont icon-weixin"></i>
				优图优印微信公众号
				<span class="qrcode_weixin abs tec">
			   	    <i class="sx"></i>
			   	    <img src="/youtuyouyin/static/img/common/qrcode.png"/>
				</span>
			</a>
		</div>
		<div class="header-top-right fr">
			<a href="{:U('/Home/Index/index')}"><i class="iconfont icon-shouyeshouye"></i>优图优印首页</a>
			<span>您好，<a href="/youtuyouyin/login/index" class="please-login">请登录</a></span>
			<a href="/youtuyouyin/register/index">客户注册</a>
			<a class="header-top-need dib">申请定制服务</a>
		</div>
	</div>
</div>
<!--header-top结束-->
<!--header-logo开始-->
<div class="header-logo">
	<div class="wrap clearfix">
		<div class="logo fl">
			<a href="{:U('/Home/Index/index')}"><img src="/youtuyouyin/static/img/common/logo.png" /></a>
		</div>
		<div class="search fl">
			<div class="search-box">
				<div class="search-input fl">
					<input type="text" name="search" id="search" value="" autocomplete="off" placeholder="请输入你需要的服务或设计师" />
				</div>
				<div class="search-btn fr tec">
					<a class="searchKeyWord"><i class="iconfont icon-sousuo"></i>搜索</a>
				</div>
			</div>
			<form action="/Home/Search/index" method="get" hidden="hidden" class="searchForm" assept-charset="utf-8">
				<input type="text" name="keyword" id="keyword"/>
				<input type="submit"/>
			</form>
				
		</div>
		<div class="line fl"></div>
		<div class="demand fl tec">
			<a><i class="iconfont icon-fabu"></i>发布需求</a>
		</div>
	</div>
</div>
<!--header-logi结束-->
<!--nav 开始-->
<nav>
	<div class="wrap">
		<ul class="clearfix">
			<?php $nav=array("index","designer","print","design","article");?>
			<li class="nav-item {$nav.0|navActive}">
				<a href="/youtuyouyin/">首页</a>
			</li>
			<li class="nav-item {$nav.1|navActive}">
				<a href="/youtuyouyin/designer/index">找设计师</a>
			</li>
			<li class="nav-item {$nav.2|navActive}">
				<a href="/youtuyouyin/print/index">找印刷</a>
			</li>
			<li class="nav-item {$nav.3|navActive}">
				<a href="/youtuyouyin/design/index">作品案例</a>
			</li>
			<li class="nav-item {$nav.4|navActive}">
				<a href="/youtuyouyin/article/articleList">行业资讯</a>
			</li>
		</ul>
	</div>
</nav>
<!--nav结束-->
<!-------------------公共头部文件----------------------->