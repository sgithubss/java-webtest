<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../common/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	/* 
	ajax 可以用json格式提交数据但是默认服务器还是用k:value接收 不是接收json格式
	有的特别时候我们需要强调 服务器必须用json格式接收
	*/
	/* $(function(){
		$.ajax({
			url:"aa12.action",
			data:{id:1,name:"小黑",pwd:"123456"},
			type:"post",
			contentType:"application/json;charset=UTF-8",// 告诉服务器必须用json格式接收
			dataType:"json",
			success:function(){
				alert("aa");
			}
		});
	}); */
</script>
</head>
<body>
	<form action="aa4.action" method="post">
		<input type="submit" value="post提价" />
	</form>
	<form action="aa6.action" method="post">
		日期:<input type="text" name="riqi" value="" /><br/>
		<input type="submit" value="自定义类型参数" />
	</form>
	<form action="aa7.action" method="post">
		姓名：<input type="text" name="names" value="" /><br/>
		姓名：<input type="text" name="names" value="" /><br/>
		
		<input type="submit" value="数组类型型" />
	</form>
	<form action="aa8.action" method="post">
		id：<input type="text" name="ids[0]" value="" /><br/>
		id：<input type="text" name="ids[1]" value="" /><br/>
	 	姓名：<input type="text" name="list[0].name" value="" /><br/>
		姓名：<input type="text" name="list[1].name" value="" /><br/>
		 
		<input type="submit" value="数组类型型" />
	</form>
	<form action="aa13.action" method="post" enctype="multipart/form-data">
		美女:<input type="file" name="img" />
		<input type="submit" value="上传" />
	</form>
</body>
</html>