<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
    <title>Bootstrap 101 Template</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
    <script src="./js/jquery.min.js"/></script>
    <script src="./bootstrap/js/bootstrap.min.js"></script>
    <style>
		#clo2{
			background-color:grey;
			box-shadow:inset 1px -1px 1px #444, inset -1px 1px 1px #444;
		}
		#clo1{
			background-color: #dedef8;
            box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444;
		}
		#clo3{
			background-color: #dedef8;box-shadow:inset 1px -1px 1px #444, inset -1px 1px 1px #444;
		}
		#clo4{
            background-color: #dedef8;box-shadow: 
            inset 1px -1px 1px #444, inset -1px 1px 1px #444;
		}
	 </style>
  </head>
  <body>
    <h1>Hello, world!</h1>
        <div class="container">
        	<div class="row" >
                <div class="col-xs-6 col-sm-3" id="clo1">
                    <p>qweqwe</p>
                </div>
                <div class="col-xs-6 col-sm-3" id="clo2">
                    <p>32123</p>
                    <p>23sas</p>
                </div>
            	<div class="clearfix visible-xs"></div>
            	<div class="col-xs-6 col-sm-3" id="clo3">蔷薇蔷薇蔷薇</div>
            	<div class="col-xs-6 col-sm-3" id="clo4" >
                <p>沙发上房顶上</p>
           		</div>
        </div>
    </div>
  </body>
</html>