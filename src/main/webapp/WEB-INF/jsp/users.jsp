<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file ="../layout/taglib.jsp" %>
<table class="table table-bordered table-hover table-striped">
	<thead>
		<th>user name</th>
	</thead>
	<tbody>
		<c:forEach items="${users}" var="user">
			<tr>
			
				<td>
					<a href='<spring:url value="/users/${user.id}.html"/>'>
					${user.name}
					</td>
			</tr>
		</c:forEach>

	</tbody>

</table>