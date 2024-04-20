<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/echarts.min.js"></script>
<script src="js/echarts-wordcloud.js"></script>
<script src="js/china.js"></script>
<link rel="stylesheet" href="css/style.css">
<title>2022年餐厅菜品销售数据</title>
</head>
<body>
<nav>
	<div class="menu-btn">
		<div class="line line--1"></div>
		<div class="line line--2"></div>
		<div class="line line--3"></div>
	</div>

	<div class="nav-links">
		<a href="#" class="link" onclick="">首页</a>
		<a href="javascript:city();" class="link">各等级评分人数占比</a>
		<a href="javascript:salary();" class="link">菜品销量top10</a>
		<a href="javascript:kill();" class="link">菜品评价词云图</a>
	</div>
</nav>
<div class="inform" id="dataView">
	2022年餐厅菜品销售数据
</div>
<script src="js/index.js"></script>
<script src="js/echarts-view.js" type="text/javascript"></script>
</body>
</html>