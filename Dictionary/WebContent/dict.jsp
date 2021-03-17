<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dictionary</title>
    <script src = "dict.js" ></script>
    <link rel="stylesheet" href="dict.css">
    <script src = "http_ajax.googleapis.com_ajax_libs_jquery_1.7.2_jquery.js" ></script>
</head>
<body>
<div id="body">
 	<h1>Dictionary</h1>
 	<div id="form">
    <input type="text" name="searchWord" id="searchWord">
    <input type="button" value="LookUp" id="Search"/>
    </div>
    <div id="result" >
     
    </div>
	 <footer>
            
            <div id="footer">
               
           <a href="http://validator.w3.org/check/referer">
            <img src="http://mumstudents.org/cs472/2014-09/images/w3c-html.png" alt="html validator">
        </a>
        <a href="http://jigsaw.w3.org/css-validator/check/referer">
            <img src="http://mumstudents.org/cs472/2013-09/images/w3c-css.png" alt="Valid CSS!"></a>
        <a href="http://webster.cs.washington.edu/jslint?referer">
            <img src="http://mumstudents.org/jshint/jshint-small.png" alt="JavaScript Lint">
        </a>
    
            </div>
        </footer>
</div>
</body>
</html>