<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/include/Header.jsp">
<c:param name="title" value="Add User"></c:param>
</c:import>
<html>
<head>
<style type="text/css">
.formopt{
text-align: center;
text-family: Times New Roman;
}
</style>
</head>
<body>
<br/>
<br/>
<br/>
<div class="formopt">
    <form action="<%=request.getContextPath()%>/OperationsController" method=post>
     Enter Name : <input type="text" name="username" id="un" required="required"/>
     <br/>
     <br/>
     Enter emailid : <input type="email" name="email" id="eid" required="required"/>
     <br/>
     <br/>
     <input type="hidden" name="addform" value="addentry"/>
     <input type="submit" value="Enter"/>
    </form>
</div>
<br/>
<br/>
<br/>
<br/>
</body>
</html>
<c:import url="/include/Footer.jsp"></c:import>
