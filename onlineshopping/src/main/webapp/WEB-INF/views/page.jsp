<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online shopping - ${title}</title>

<script>
	window.menu = '${title}'
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<%@include file="./shared/navbar.jsp"%>

	<!-- Page Content -->
	<!-- Loading the home content -->
	<c:if test="${userClickHome==true }">
		<%@include file="home.jsp"%>
	</c:if>

	<!-- Load on click about -->
	<c:if test="${userClickAbout==true }">
		<%@include file="about.jsp"%>
	</c:if>

	<!-- Load on click contact -->
	<c:if test="${userClickContact==true }">
		<%@include file="contact.jsp"%>
	</c:if>

	<!-- Load on click contact -->
	<c:if
		test="${userClickAllProducts == true or userClickCategoryProducts == true }">
		<%@include file="listProducts.jsp"%>
	</c:if>


	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>

	<!-- JQuery -->
	<script src="${js}/jquery.js"></script>
	
	<!-- Bootstrap core JavaScript -->
	<script src="${js}/bootstrap.min.js"></script>

	<!-- DataTable Plugin -->
	<script src="${js}/jquery.dataTables.js"></script>
	
	<!-- Self coded JS -->
	<script src="${js}/myapp.js"></script>


</body>

</html>



