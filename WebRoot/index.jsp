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
  	document.getElementById("home").setAttribute("class", "active");
  </script>
  <%
  if(session.getAttribute("ACMer") == null){
  %><jsp:include page="login.jsp"></jsp:include>
  <%
  }else{
  %>
<div class="container">
	<div class="row">
		<div class="span12">
			<ul class="thumbnails">
				<li class="span4">
					<div class="thumbnail">
						<img alt="300x200" src="bootstrap/img/acm2.JPG" />
						<div class="caption">
							<h3>
								金奖获得者
							</h3>
							<p>
								左起依次为白迪、秦梦军、朱国进老师、吴嘉烨和汪睿。
							</p>
						</div>
					</div>
				</li>
				<li class="span4">
					<div class="thumbnail">
						<img alt="300x200" src="bootstrap/img/acm1.JPG" />
						<div class="caption">
							<h3>
								获奖者合照
							</h3>
							<p>
								2014年6月10中午，晴空万里，在镜月湖旁举行东华大学2014年度ACM校内选拔赛颁奖仪式，总共有37位同学获奖，为东华大学计算机学院ACM事业有增添了新的希望！
							</p>
						</div>
					</div>
				</li>
				<li class="span4">
					<div class="thumbnail">
						<img alt="300x200" src="bootstrap/img/acm3.JPG" />
						<div class="caption">
							<h3>
								银奖获得者
							</h3>
							<p>
								左起依次为赵忆佳、张恒、朱国进老师、孙凯岐、吴瑜珠、李丽丽。
							</p>
						</div>
					</div>
				</li>
			</ul>
		</div>
	</div>
</div>
  <%
  }
   %>
  	
  </body>
  <jsp:include page="foot.jsp"></jsp:include>
</html>
