<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Exam</title>
<link rel="stylesheet" type="text/css" href="assets/css/style.css" />
<link rel="stylesheet" type="text/css" href="assets/css/login.css" />
</head>
<body>
<div id="container">
	<jsp:include page="include/header.jsp" />
	<div id="content">
		<div id="main" class="left">
			<div class="pad20">
				<img src="assets/image/lady_exam.jpg" width=650px height=320px />
			</div>
			
		</div>
		<div id="sidebar" class="right">
			<div class="grid__container">
				<h2>Login</h2>
					<%
					String login_msg=(String)request.getAttribute("error");  
					if(login_msg!=null)
					out.println("<font color=red size=4px>"+login_msg+"</font>");
					%>
			      <form action="/OnlineExam/login" method="post" class="form form--login">
			
			        <div class="form__field">
			          <label class="fontawesome-user" for="login__username"><span class="hidden">Username</span></label>
			          <input id="login__username" name="login" type="text" class="form__input" placeholder="Username" required>
			        </div>
			
			        <div class="form__field">
			          <label class="fontawesome-lock" for="login__password"><span class="hidden">Password</span></label>
			          <input id="login__password" name="password" type="password" class="form__input" placeholder="Password" required>
			        </div>
			
			        <div class="form__field">
			          <input type="submit" value="Sign In">
			        </div>
			
			      </form>
			
			      <p class="text--center">Not a member? <a href="signup.jsp">Sign up now</a> <span class="fontawesome-arrow-right"></span></p>
		
		    </div>
		</div>
		<div class="clear">&nbsp;</div>
	</div>
	<jsp:include page="include/footer.jsp" />
</div>
</body>
</html>