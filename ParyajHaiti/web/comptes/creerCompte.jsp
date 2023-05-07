<%-- 
    Document   : creerCompte
    Created on : May 2, 2023, 9:19:12 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../header.jsp" %>
        <h1>Inscription</h1>

        <form action="${pageContext.request.contextPath}/compteServlet" method="post">
            <!--<input type="text" placeholder="code" nam>-->
            <input type="text" placeholder="nom" name="nom">
            <input type="text" placeholder="Prenom" name="prenom">
            <input type="text" placeholder="Sexe" name="sexe">
            <input type="text" placeholder="adresse" name="adresse">
            <input type="text" placeholder="Lieu_Naissance" name="lDn">
            <input type="date" placeholder="Date_Naissance" name="dN">
            <input type="text" placeholder="Telephone" name="tel">
            <input type="text" placeholder="Nif/Cin" name="nifOuCin">
            <input type="text" placeholder="Nom_Utilisateur" name="utilisateur">
            <input type="text" placeholder="Mot de pass" name="password">
            <!--<input type="text" placeholder="confirm" name="passConfirm">-->
            <input type="text" placeholder="solde" name="solde">
            <input type="text" placeholder="etat" name="etat">
            <button type="submit">Creer compte</button>
        </form>
    </body>
</html>
