<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html>
<jsp:include page="head.jsp"></jsp:include>
  <head>
    <base href="<%=basePath%>">
    <title>Hide your header on scroll - Headroom.js</title>
    <meta name="viewport" content="width=device-width">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-responsive.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-responsive.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="style.css" type="text/css" />
  </head>
  
  <body>
  <script type="text/javascript">
  	document.getElementById("knowledge").setAttribute("class", "active");
  </script>
  	<div class="container">
	<div class="row">
		<div class="span12" style="text-align:center">
			 <button class="btn btn-block btn-inverse disabled" type="button">基本算法</button>
			<a href="Search?knowledge=基本算法-分治"><button class="btn-info" type="button">分治</button></a>
			<a href="Search?knowledge=基本算法-模拟"><button class="btn-info" type="button">模拟</button></a><br><br>
			<button class="btn btn-block btn-inverse disabled" type="button">数论</button>
			<a href="Search?knowledge=数论-欧几里得扩展"><button class="btn-primary" type="button">欧几里得扩展</button></a>
			<a href="Search?knowledge=数论-高斯素数"><button class="btn-primary" type="button">高斯素数</button></a>
			<a href="Search?knowledge=数论-矩阵快速幂"><button class="btn-primary" type="button">矩阵快速幂</button></a>
			<a href="Search?knowledge=数论-杨辉三角形"><button class="btn-primary" type="button">杨辉三角形</button></a>
			<a href="Search?knowledge=数论-质数、整数分解"><button class="btn-primary" type="button">质数、整数分解</button></a>
			<a href="Search?knowledge=数论-约瑟夫环"><button class="btn-primary" type="button">约瑟夫环</button></a>
			<a href="Search?knowledge=数论-矩阵"><button class="btn-primary" type="button">矩阵</button></a>
			<br><br>
			<button class="btn btn-block btn-inverse disabled" type="button">图论</button>
			<a href="Search?knowledge=图论-差分约束"><button class="btn-success" type="button">差分约束</button></a>
			<a href="Search?knowledge=图论-差分约束"><button class="btn-success" type="button">第K短路</button></a>
			<a href="Search?knowledge=图论-差分约束"><button class="btn-success" type="button">图的割边与割点</button></a>
			<br><br>
			<button class="btn btn-block btn-inverse disabled" type="button">组合数学</button>
			<a href="Search?knowledge=组合数学-容斥原理"><button class="btn-warning" type="button">容斥原理</button></a>
			<a href="Search?knowledge=组合数学-polya"><button class="btn-warning" type="button">polya</button></a>
			<a href="Search?knowledge=组合数学-抽屉原理"><button class="btn-warning" type="button">抽屉原理</button></a>
			<a href="Search?knowledge=组合数学-MoBius反演"><button class="btn-warning" type="button">MoBius反演</button></a>
			<a href="Search?knowledge=组合数学-母函数"><button class="btn-warning" type="button">母函数</button></a>
			<br><br>
			<button class="btn btn-block btn-inverse disabled" type="button">字符串处理</button>
			<a href="Search?knowledge=字符串处理-kmp"><button class="btn-inverse" type="button">kmp</button></a>
			<a href="Search?knowledge=字符串处理-AC自动机"><button class="btn-inverse" type="button">AC自动机</button></a>
			<a href="Search?knowledge=字符串处理-后缀数组"><button class="btn-inverse" type="button">后缀数组</button></a>
			<br><br>
			<button class="btn btn-block btn-inverse disabled" type="button">动态规划</button>
			<a href="Search?knowledge=DP-树形DP"><button class="btn-danger" type="button">树形DP</button></a>
			<a href="Search?knowledge=DP-树形DP"><button class="btn-danger" type="button">区间DP</button></a>
			<a href="Search?knowledge=DP-树形DP"><button class="btn-danger" type="button">状态压缩DP</button></a>
			<br><br>
		</div>
	</div>
</div>
  </body>
  <jsp:include page="foot.jsp"></jsp:include>
</html>
