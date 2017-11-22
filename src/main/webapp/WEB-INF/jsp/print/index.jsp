<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>印刷产品列表-平面设计公司 - 优图优印</title>
		<%@include file="../common/meta.jsp" %>
		<link rel="stylesheet" type="text/css" href="/youtuyouyin/static/css/production.css"/>
		<style type="text/css">
			.print-recommend-item img{
				width: 100%;
				height: 100%;
			}
		</style>
	</head>

	<body>
		<!--header-top 开始-->
		<%@include file="../common/header.jsp" %>
		<!-------------------公共头部文件----------------------->
		<!--产品列表-->
		<section class="print" id="print">
			<!--主体-->
			<div class="wrap clearfix">
				<!--面包屑导航-->
				<div class="crumbs">
					<span>我的位置：</span>
					<span><a href="">优图优印</a></span> ＞
					<span><a href="">找印刷</a></span>
					<span></span>
				</div>
				<!--筛选-->
				<div class="filter-box">
					<div class="filter-list">
						<div class="filter-line">
							<span class="title">印刷类型</span>
							<div class="select-list">
								<a href="{:U('/Home/Print/index')}" class=<if condition="$selected['type'] eq null">onSelect</if>>全部</a>
								<volist name="typeList" id="typeItem">
									<a href={:U('Home/print/index',array("type"=>$typeItem['id']))}  class=<if condition="$selected['type'] eq $typeItem['id']">onSelect</if>>{$typeItem.name}</a>
								</volist>
							</div>
						</div>
					</div>
				</div>
				<!--产品列表-->
				<div class="print-recommend">
					<div class="print-recommend-list clearfix">
						<!--产品卡片-->
						<volist name="list" id="printItem">
							<?php $printStyle=D("PrintTypeSelect")->getNameById($printItem['type']);?>
							<div class="print-recommend-item">
								<a href={:U('Home/Print/detail',array("printId"=>$printItem['id']))}><img class="lazy" data-original="{$printItem.coverimg|replacePrintPicUrl}" alt="{$printStyle}印刷产品图片" title="{$printStyle}"/></a>
								<div class="print-title">{$printItem.title}</div>
								<div class="print-detail">
									<span>印刷类型：<em>{$printStyle}</em></span>
								</div>
							</div>
						</volist>
					</div>
				</div>
				<!--分页-->
				<div class="page">
					{$page}
				</div>
			</div>
		</section>
		<!--footer-->
		<%@include file="../common/footer.jsp" %>
		<%@include file="../common/commonScript.jsp" %>
		<script src="/youtuyouyin/static/js/jquery.lazyload.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			$("img.lazy").lazyload();
			marginRight('print-recommend-item',4)
		</script>
	</body>

</html>