<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>DHU ACM Trainning System</title>
    <meta name="viewport" content="width=device-width">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-responsive.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-responsive.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  </head>
  
  <body style="background: #eeeeee url(bootstrap/img/bg.jpg) top left repeat;font-family:Times New Roman,Times, Georgia;">
  <div class="container">
	<div class="row">
		<div class="span12">
			<img alt="" src="bootstrap/img/1.jpg" class="img-rounded" style="width:100%;height:200px"/>
			<div class="navbar">
				<div class="navbar-inner">
					<div class="container-fluid">
						<a class="btn btn-navbar" data-target=".navbar-responsive-collapse" data-toggle="collapse"></a> <a class="brand">DHU ACM</a>
						<div class="nav-collapse collapse navbar-responsive-collapse">
							<ul class="nav">
								<li id="home">
									<a href="home.jsp">Home</a>
								</li>
								<li id="knowledge">
									<a href="knowledge.jsp">Knowledge point</a>
								</li>
								<li id="solution">
									<a href="getSolution">Solution</a>
								</li>
								<li id="submit">
									<a href="submit.jsp">Quick Submit</a>
								</li>
								<li id="discuss">
									<a href="Content">Discuss</a>
								</li>
							</ul>
							<ul class="nav pull-right">
								<%
								if(session.getAttribute("ACMer") != null){
								%>
									<li><a><%=session.getAttribute("ACMer") %></a></li>
									<li class="divider-vertical"><a href="logout">Logout</a></li>
								<%
								}
								else{
								 %>
								 	<li><a href="home.jsp">Login</a></li>
									<li class="divider-vertical"><a href="regist.jsp">Regist</a></li>
								<%
								}
								 %>
								
							</ul>
						</div>
						
					</div>
				</div>
				
			</div>
		</div>
	</div>
</div>
  </body>
</html>
