<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 폰트 -->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">
<!-- Bootstrap -->
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css'/>"/>
<!-- Slick : carousel -->
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/slick.css'/>"/>
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/slick-theme.css'/>"/>
<!-- nouislider -->
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/nouislider.min.css'/>"/>
<!-- Font Awesome Icon -->
<link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css'/>"/>
<!-- Custom stlylesheet -->
<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/style.css'/>"/>
<!-- HEADER -->
<header>
	<!-- TOP HEADER -->
	<div id="top-header">
		<div class="container">
			<ul class="header-links pull-left">
				<li><a href="#"><i class="fa fa-phone"></i> +85-2-818-7950</a></li>
				<li><a href="#"><i class="fa fa-envelope-o"></i>kgn@goodee.co.kr</a></li>
				<li><a href="#"><i class="fa fa-map-marker"></i>95, Gasan digital 2-ro, Geumcheon-gu, Seoul, Republic of Korea</a></li>
			</ul>
			<ul class="header-links pull-right">
				<li><a href="/join"><i class="fa fa-user-o"></i>Sign Up</a></li>
				<li><a href="/login"><i class="fa fa-sign-in"></i>Login</a></li>
			</ul>
		</div>
	</div>
	<!-- /TOP HEADER -->
	<!-- MAIN HEADER -->
	<div id="header">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<div class="col-md-3"></div>
				<!-- SEARCH BAR -->
				<div class="col-md-6">
					<div class="header-search">
						<form>
							<select class="input-select">
								<option value="0">All Categories</option>
								<option value="1">Member</option>
								<option value="1">Book</option>
							</select>
							<input class="input" placeholder="Search here">
							<button class="search-btn">Search</button>
						</form>
					</div>
				</div>
				<!-- /SEARCH BAR -->
				<div class="col-md-3"></div>
			</div>
			<!-- row -->
		</div>
		<!-- container -->
	</div>
	<!-- /MAIN HEADER -->
</header>
<!-- /HEADER -->