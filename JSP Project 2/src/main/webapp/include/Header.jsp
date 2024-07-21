<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${param.title}</title>
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a:active {
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
<div>
  <nav class="topnav" id="nav_top">
  <a class="active" href="${pageContext.request.contextPath}/home?page=home">Home</a>
  <a href="${pageContext.request.contextPath}/home?page=add user">Add User</a>
  <a href="${pageContext.request.contextPath}/home?page=show user">Show Users</a>
  <a href="${pageContext.request.contextPath}/home?page=update user">Update User</a>
  <a href="${pageContext.request.contextPath}/home?page=delete user">Delete User</a>
  </nav>
</div>
</body>
</html>