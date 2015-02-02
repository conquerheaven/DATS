<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="org.model.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<jsp:include page="head.jsp"></jsp:include>
  <head>
  <script src= "bootstrap/js/bootstrap.js"> </script>
  <script src= "bootstrap/js/bootstrap.min.js"> </script>
  <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
  <script type="text/javascript" src="bootstrap/js/bootstrap-collapse.js"></script>
  <script type="text/javascript" src="bootstrap/js/bootstrap-transition.js"></script>
  </head>
  
  <body>
  <script type="text/javascript">
  	document.getElementById("discuss").setAttribute("class", "active");
  </script>
<div class="container">
	<div class="row">
		<div class="span12">
			<div class="row">
				<div class="span12">
				<div class="accordion" id="accordion-907523">
				<%
				int top = Integer.parseInt(request.getAttribute("top").toString());
				int total = 0;
				ArrayList<Discuss> Dls = (ArrayList<Discuss>) request.getAttribute("Dls");
				ArrayList<Reply> Rls  = (ArrayList<Reply>) request.getAttribute("Rls");
				int problemId = 0;
				if(request.getAttribute("problemId") != null){
					problemId = Integer.parseInt(request.getAttribute("problemId").toString());
				}
				request.setAttribute("problemId", problemId);
				session.setAttribute("problemId", problemId);
				Iterator<Discuss> Dit = Dls.iterator();
				while(Dit.hasNext()){
					Discuss discuss = Dit.next();
					int ID = discuss.getId();
					if((problemId == 0 || discuss.getProblemId().equals(problemId)) && total < 10 && discuss.getId()<=top){
						total++;
						top = discuss.getId();
						%>
						<div class="accordion-group" style="border:1px solid">
							<div class="accordion-heading">
								<a class="accordion-toggle collapsed" data-toggle="collapse" data-target="#accordion-element-<%=ID%>"><%=discuss.getTitle()%></a><%=" 【"+discuss.getDisTime()+"】 【"+discuss.getAcmer()+"】  FOR problemID "+discuss.getProblemId() %>
							</div>
							<div class="accordion-body collapse" id="accordion-element-<%=ID%>">
							<div class="accordion-inner">
								<%=discuss.getContent() %>
							</div>
								<%
								Iterator<Reply> Rit = Rls.iterator();
								while(Rit.hasNext()){
									Reply reply = Rit.next();
									if(reply.getReplyTo().equals(ID)){
										%>
										<div class="panel-inner" style="border:1px solid">
											<%=reply.getAcmer() %>:<%=reply.getContent() %>
										<div style="text-align:right">
												<%="【"+reply.getReplyTime()+"】" %>
										</div>
										</div>
										<%
									}
								}
								session.setAttribute("ID", ID);
								%>
								<hr>
							<s:form theme="simple" action="Reply" method="post">
							<s:hidden name="reply.replyTo" value="%{#session.ID}"></s:hidden>
							<s:hidden name="reply.acmer" value="%{#session.ACMer}"></s:hidden>
							<s:textarea rows="3" name="reply.content" placeholder="Reply"></s:textarea><br>
							<s:submit cssClass="btn btn-primary" value="Reply"></s:submit>
							</s:form>
							 
							</div>
						</div>
						<%
					}
				}
				//out.print(session.getAttribute("ACMer"));
				%>
				
				<div class="pagination pagination-centered">
				<ul>
					<li>
						<a href="Content">首页</a>
					</li>
					<li>
						<a href="Content?top=<%=top+20 %>">上一页</a>
					</li>
					<li>
						<a href="Content?top=<%=top %>">下一页</a>
					</li>
					<li>
						<a href="Content?top=10">末页</a>
					</li>
				</ul>
			</div>
				
				
				<hr>
				<s:form cssClass="form-horizontal" action="Discuss" method="post">
				<s:hidden name="discuss.acmer" value="%{#session.ACMer}"></s:hidden>
				<s:hidden name="discuss.problemId" value="%{#session.problemId}"></s:hidden>
				<s:textfield name="discuss.title" placeholder="Title"></s:textfield>
				<s:textarea rows="3" name="discuss.content" placeholder="Content"></s:textarea><br>
				<s:submit cssClass="btn btn-primary"></s:submit>
				</s:form>
				<!--
				<form class="form-horizontal" action="Discuss" method="post">
					<input type="hidden" name="discuss.acmer" value="<%=session.getAttribute("ACMer") %>">
					<input type="hidden" name="discuss.problemId" value="<%=problemId %>">
					<input type="text" name="discuss.title" placeholder="Title"/><br /><br />
					<textarea rows="3" name="discuss.content" placeholder="Content"></textarea><br /><br /> 
					<button class="btn btn-primary" type="submit">Submit</button>
				</form> -->
				
				<%
				if(session.getAttribute("ACMer") == null){
					%>
					<s:form cssClass="form-horizontal" action="Login" method="post" theme="simple">
					<s:textfield cssClass="input-small" name="userinfo.username" placeholder="ACMer"></s:textfield>
					<s:password cssClass="input-small" name="userinfo.password" placeholder="Password"></s:password>
					<s:submit cssClass="btn btn-success" value="Login"></s:submit>
					</s:form>
					<%
				}
				%>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
  </body>
<jsp:include page="foot.jsp"></jsp:include>
</html>
