<%-- 
    Document   : compte
    Created on : May 2, 2023, 8:38:07 PM
    Author     : user
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="models.CompteModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../layouts/header.jsp" %>
        <h1>Information du compte</h1>

        <ul>
               <li>Liste----</li>
            <% ArrayList<CompteModel> liste = (ArrayList<CompteModel>) session.getAttribute("data");
            if(liste != null){
            if(!liste.isEmpty()){
                for(CompteModel cm: liste){   
            %>
         
            <li><%=cm.getId()%></li>
            <li><%=cm.getNom()%></li>
            <li><%=cm.getPrenom()%></li>
            <li><%=cm.getSexe()%></li>
            <li><%=cm.getAdresse()%></li>
            <li><%=cm.getlDn()%></li>
            <li><%=cm.getdDn()%></li>
            <li><%=cm.getTel()%></li>
            <li><%=cm.getNifOuCin()%></li>
            <li><%=cm.getN_utilisateur()%></li>
            <li><%=cm.getMotDePass()%></li>
            <li><%=cm.getSolde()%></li>
            <li><%=cm.getEtat()%></li>
            <%}}}%>
        </ul>


    </body>
</html>
