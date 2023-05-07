/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controleur;

import dao.CompteDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.CompteModel;

/**
 *
 * @author user
 */
public class compteServlet extends HttpServlet {

    static final String compte = "comptes/compte.jsp";
// static final String 

    CompteModel cm = new CompteModel();
    CompteDao cdao = new CompteDao();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet compteServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet compteServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        lister(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        enregistrer(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    protected void enregistrer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            cm.setNom(request.getParameter("nom"));
            cm.setPrenom(request.getParameter("prenom"));
            cm.setSexe(request.getParameter("sexe"));
            cm.setAdresse(request.getParameter("adresse"));
            cm.setlDn(request.getParameter("lDn"));
            cm.setdDn(request.getParameter("dN"));
            cm.setTel(request.getParameter("tel"));
            cm.setNifOuCin(request.getParameter("nifOuCin"));
            cm.setN_utilisateur(request.getParameter("utilisateur"));
            cm.setMotDePass(request.getParameter("password"));
            cm.setSolde(Double.parseDouble(request.getParameter("solde")));
            cm.setEtat(request.getParameter("etat"));
            cdao.enregistrer(cm);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(compteServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(compteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected void lister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            ArrayList<CompteModel> list = cdao.afficher();
            HttpSession session = request.getSession();
            session.setAttribute("data", list);
            response.sendRedirect(compte);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(compteServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(compteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
