<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <script type="text/javascript">
  function tosubmit(){
  var name=document.getElementById("name").value;
  var pwd=document.getElementById("pwd").value;
  if(name==""||pwd==""){
	  alter("用户名和密码不为空");
  }else{
	  firm.submit();
	  
  }
  }
  
  
  </script>
  <body>
  
  <!-- <form action="getActor"  name="firm" method="post">
  <input tyep="text" name="name">
  <input type="text"  name="pwd"> 
  <input type="submit"> 
  </form> -->
  <!-- 登陆分为管理员登陆，老师登陆，学生登陆 -->
  
  <form action="teacher/getTeacherOfStudents"  name="firm" method="post">
  <input tyep="text" name="tno">  
  <input type="submit"> 
  </form>
  </body>
</html>
