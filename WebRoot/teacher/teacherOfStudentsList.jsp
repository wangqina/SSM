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
    
    <title>My JSP 'courseList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript">

function GoDelete(cno) {
	if(confirm("真的要删除吗?")) {
		Form1.action = "delectCource?cno="+cno;
		Form1.submit();
	}
}

function GoEdit(cno){
	Form1.action = "findByCno?cno="+cno;
	Form1.submit();
	
}
</script>
  </head>
  
  <body>
 <!-- 显示当前学生所有成绩-->
<table>
   <form id="Form1" name="Form1"  method="post">
    <c:forEach var="sc" items="${listSc}">
    	 <TR>          
	   <TD>&nbsp;${sc.sno}</TD>
	   <TD>&nbsp;${sc.student.sname}</TD>	   
	   <TD>&nbsp;${sc.course.course}</TD>
	   <TD>&nbsp;${sc.grade}</TD>
       <TD>&nbsp;
       <input type="button" value="修改" onclick="GoEdit('')">
      
       <input type="button"  onclick="GoDelete('')" value="删除">          
       </TD>
      </TR>
	 </c:forEach>
   <a href="course/courseEdit.jsp"> 插入</a>
   </table>
   </form>
  </body>
</html>
