<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript">
$(function(){
	$("input[type='button']").click(function(){
		var name = $(":input[name='name']").val();
		var password = $(":input[name='password']").val();
 	     $.post("login",{"name":name,"password":password},function(data){
	    	 $("div").html(data.name+data.password);
	     },"json") 
	})
})

</script>
</head>
<body>
    <form method="post" action="login">
        姓名  <input type="text" name="name"/><br>
        密码   <input type="text" name="password"/><br>
        <input type="button" value="登录"/>
    </form>
    <div></div>
</body>
</html>