<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 	<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
    <script src="./js/jquery.min.js"/></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>
    
	<link rel="stylesheet" href="./css/header.css">
    <link rel="stylesheet" href="./css/footer.css">   
    <link rel="stylesheet" href="./css/main.css">
    
<title>My WebSite</title>
</head>
<body>
	  <#include "common/header.ftl">
      <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
          <li data-target="#carousel-example-generic" data-slide-to="1"></li>
          <li data-target="#carousel-example-generic" data-slide-to="2"></li>
          <li data-target="#carousel-example-generic" data-slide-to="3"></li>
        </ol>
        <div class="carousel-inner" role="listbox" align="center">
          
          <#list pics as pic>
          <#if pic == 1>
          	<div class="item active">
            	<img src="./images/1.jpg" alt="First slide" style="height: 200px;">
          	</div>
	          <#else>
	          <div class="item">
	            <img src="./images/${pic}.jpg" alt="${pic} slide" style="height: 200px;">
	          </div>
	         </#if>
          </#list>	
        </div>
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
    <#include "common/footer.ftl">
</body>
</html>