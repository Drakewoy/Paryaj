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
import models.PaiementModel;
import services.Iservices;

/**
 *
 * @author user
 */
public class PaiementDao implements Iservices<PaiementModel> {

    /*
        Preparation de la connection, passage des requete et iteration de la base de donnee
     */
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public int enregistrer(PaiementModel obj) throws ClassNotFoundException, SQLException {
        // Passage de la requete
        String sql = "INSERT INTO paiements VALUES(?,?,?)";
        // Recuperation de la connection
        con = DBconnection.connect();
        // Passage de la requete dynamique
        ps = con.prepareStatement(sql);
        //Passage des parametres
        ps.setString(1, null);
        ps.setString(2, obj.getId_pariage());
        ps.setString(1, obj.getDate());
        
        int n = ps.executeUpdate();
        //close the connections
        DBconnection.close(rs, ps, con);
        return n;
    }

    @Override
    public int modifier(PaiementModel obj) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(PaiementModel obj) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int supprimer(String id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PaiementModel rechercher(String id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<PaiementModel> afficher() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
