<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head><title>SpringBoot</title>
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


<div class="container">
<table class="table">
  <tr>
    <th>ID</th>
    <td>${lists.id}</td>
  </tr>
  <tr>
      <th>Nom de tarif</th>
      <td>${lists.nom}</td>
    </tr>
    <tr>
        <th>Plage horaire</th>
        <td>${lists.plageHoraire}</td>
      </tr>
       <tr>
        <th>Montant</th>
        <td>${lists.montant}</td>
      </tr>
  </table>
  <a href="/">Retour</a>
  </div>
</body>
</html>
