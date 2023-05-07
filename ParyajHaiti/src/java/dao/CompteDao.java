/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dbutils.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.CompteModel;
import services.Iservices;

/**
 *
 * @author user
 */
public class CompteDao implements Iservices<CompteModel> {
// La connection 

    Connection con = null;
// Le prepared statement
    PreparedStatement ps = null;
// Le resultset pour une iteration
    ResultSet rs = null;

    @Override
    public int enregistrer(CompteModel obj) throws ClassNotFoundException, SQLException {
// La requete sql
        String sql = "INSERT INTO g_comptes VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
// Recuperation de la connection 
        con = DBconnection.connect();
// Passage du requete a prepareStatement
        ps = con.prepareStatement(sql);
// Passage des parametres
        ps.setString(1, null);
        ps.setString(2, obj.getNom());
        ps.setString(3, obj.getPrenom());
        ps.setString(4, obj.getSexe());
        ps.setString(5, obj.getAdresse());
        ps.setString(6, obj.getlDn());
        ps.setString(7, obj.getdDn());
        ps.setString(8, obj.getTel());
        ps.setString(9, obj.getNifOuCin());
        ps.setString(10, obj.getN_utilisateur());
        ps.setString(11, obj.getMotDePass());
        ps.setDouble(12, obj.getSolde());
        ps.setString(13, obj.getEtat());

        int n = ps.executeUpdate();
        DBconnection.close(rs, ps, con);
        return n;
    }

    @Override
    public int modifier(CompteModel obj) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(CompteModel obj) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int supprimer(String id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CompteModel rechercher(String id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<CompteModel> afficher() throws ClassNotFoundException, SQLException {
        ArrayList<CompteModel> liste = new ArrayList();
        CompteModel cm = null;
        // la requete 
        String sql = "SELECT * FROM g_comptes";
        // Recuperer la connection
        con = DBconnection.connect();
        //Passage de la requete dynamique
        ps = con.prepareStatement(sql);
        //executer la requete
        rs = ps.executeQuery();
        // iteration de la base
        while(rs.next()){
            cm = new CompteModel();
            cm.setId(rs.getString(1));
            cm.setNom(rs.getString(2));
            cm.setPrenom(rs.getString(3));
            cm.setSexe(rs.getString(4));
            cm.setAdresse(rs.getString(5));
            cm.setlDn(rs.getString(6));
            cm.setdDn(rs.getString(7));
            cm.setTel(rs.getString(8));
            cm.setNifOuCin(rs.getString(9));
            cm.setN_utilisateur(rs.getString(10));
            cm.setMotDePass(rs.getString(11));
            cm.setSolde(rs.getDouble(12));
            cm.setEtat(rs.getString(13));
            liste.add(cm);
        }
        DBconnection.close(rs, ps, con);
        return liste;
    }

}
