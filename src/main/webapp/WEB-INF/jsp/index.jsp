<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html   xmlns:th="http://www.thymeleaf.org"
		xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
        layout:decorator="layout">

<head><title>TheOriginals</title>
<link rel="stylesheet" type="text/css"
          href="src/main/resources/static/css/bootstrap.min.css"
          th:href="@{css/bootstrap.min.css}"/>
    

    <link rel="stylesheet" type="text/css"
          href="src/main/resources/static/css/style"
          th:href="@{css/style.css}"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous"/>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
</head>
<body>

<br>
<hr/>

<div layout:fragment="content">
    <div class=" spacer col-md-6">

        <div class="panel panel-default">
            <div class="panel-heading"> Welcome to TheOriginals CSC</div>
            <div class="panel-body"></div>

    </div>
</div>
</div>

<br><br>
</body>
</html>