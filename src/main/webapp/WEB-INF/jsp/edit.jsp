<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head><title>Référentiel des tarifs</title>
<style>
table {
    
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #A9D0F5;
    text-align: left;
    padding: 8px;
    
}

tr:nth-child(even) {
    background-color: #A9D0F5;
}

</style>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous"/>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
</head>
<body>
<br>
<br>
<br>
<br>

<div class="container">
<div layout:fragment="content">
    <div class=" spacer col-md-6">

        <div class="panel panel-default">
            <div class="panel-heading"> Modifier un tarif</div>
            <div class="panel-body"></div>

            <form action="/save" method="post">
                <div class="form-group">
                 	 <input type="hidden" name="id" value="${lists.id}">
                    <label class="control-label"> Nom de tarif :</label>
                    <small class="form-text text-muted">Ne doit contenir que des lettres et pas d'espaces</small>
                     <input type="text" name="nom" value="${lists.nom}" pattern="^[a-zA-Z]+$" required/>
                    
                </div>
                <div class="form-group">
                    <label class="control-label"> Plage horaire :</label>
                    <select name="plageHoraire" value="${lists.plageHoraire}">
					<OPTION>>00H-01H
					<OPTION>>01H-02H
					<OPTION>>02H-03H
					<OPTION>>03H-04H
					<OPTION>>04H-05H
					<OPTION>>06H-07H
					<OPTION>>07H-08H
					<OPTION>>08H-09H
					<OPTION>>09H-10H
					<OPTION>>10H-11H
					<OPTION>>11H-12H
					<OPTION>>13H-14H
					<OPTION>>14H-15H
					<OPTION>>15H-16H
					<OPTION>>16H-17H
					<OPTION>>17H-18H
					<OPTION>>18H-19H
					<OPTION>>19H-20H
					<OPTION>>20H-21H
					<OPTION>>21H-22H
					<OPTION>>22H-23H
					<OPTION>>23H-00H
					</select>
                    
                </div>
                <div class="form-group">
                    <label class="control-label"> Montant :</label>
                    <small class="form-text text-muted">Doit être du format 00.00</small>
                    <input type="text" name="montant" value="${lists.montant}" pattern="^[0-9][0-9][.][0-9][0-9]$" required/>
                    
                </div>
                <div>
                    <button type="submit" class="btn btn-primary">Modifier</button>
                </div>
            </form>
        </div>

    </div>
</div>
</div>
</body>
</html>
