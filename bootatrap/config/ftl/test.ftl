<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 	<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
    <script src="./js/jquery.min.js"/></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>
    
    <link rel="stylesheet" href="./css/header.css">
    <link rel="stylesheet" href="./css/footer.css">
    
<title>My WebSite</title>
</head>
<body>
   <#setting number_format="currency"/>
   <#assign answer=42/>
   ${answer}
   ${answer?string}
   ${answer?string.number}
   ${answer?string.percent}
   
   <#assign foo=true/>
   ${foo?string("yes","no")}
   
   <#list ["����1","����2","����3","����4"]+["����5","����6","����7"] as x>
   	${x_index},${x}
   </#list>	

	<#assign map={"a":10,"b":20}+{"c",30}/>
	${map.a + map.b + map.c}
	
	<#assign case="aBcsdF"/>
	${case?cap_first}
	
	<#assign htmlStr="aBc&sdF"/>
	${htmlStr?html}
	
	${htmlStr1???string("yes","no")}
	${htmlStr1!"aa"}
	${htmlStr1???string("yes","no")}
	
	<#assign age=21/>
	<#if (age>60)>�ϳ���
		<#elseif (age>40)>������
		<#elseif (age>20)>������
		<#else>����
	</#if>
	
	<#assign age=23> 
	<#if (age>60)>������ 
		<#elseif (age>40)>������ 
		<#elseif (age>20)>������ 
		<#else> ������ 
	</#if> 	
	
	${timer("yyyy-MM-dd H:mm:ss","1111223345566")}
	<#assign getSysDate = package utils.freemarker.LongToDate?new()>
		${getSysDate("yyyy-MM-dd H:mm","11112233455")}
	
</body>
</html>