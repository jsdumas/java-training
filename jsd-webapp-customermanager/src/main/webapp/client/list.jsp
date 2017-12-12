<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>LIST CLIENT</h1>
	
	<table>
	<tr>
<!-- 		<td>ID</td> -->
		<td>NOM</td>
		<td>DATE CONTRAT</td>
		<td>TOTAL FACTURE</td>
		<td>ACTIONS</td>
	</tr>
	
	
	
	<c:forEach items="${clients}" var="c">
	
	<tr>
<%-- 		<td>${c.id}</td> --%>
		<td>${c.nom}</td>
		<td><fmt:formatDate value="${c.dateContrat }" pattern="dd/MM/yyyy"/></td>
		<td>${c.totalFacture}</td>
		
		<td>
		
		<sec:authorize access="hasRole('ROLE_ADMIN')">
			<a href="delete.do?id=${c.id}">Supprimer</a>
		</sec:authorize>
			
			
		<a href="update.do?id=${c.id}">Modifier</a>
		
		</td>
	</tr>
	
	
	</c:forEach>
	
	</table>
	

</body>
</html>