<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">



<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<%@taglib uri="http://tiles.apache.org/tags-tiles-extras"
		prefix="tilesx"%>

	<tilesx:useAttribute name="current" />
	

	<div class="container">

		

		<nav class="navbar navbar-default" roler="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">JBlog</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="${current == 'index' ? 'active' : ''}" ><a
						href='<spring:url value="/"/>'>Home</a></li>
					<li class="${current == 'users' ? 'active' : ''}" ><a
						href="<spring:url value="/users.html"/>">Users</a></li>
				</ul>

			</div>
		</div>
		</nav>

	</div>
	<tiles:insertAttribute name="body" />

	<br>
	<br>
	<center>
		<tiles:insertAttribute name="footer" />
	</center>



</body>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap-theme.min.css"></script>
</html>