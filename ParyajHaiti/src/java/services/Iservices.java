/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author user
 */
public interface Iservices<T> {
    
   int enregistrer(T obj) throws ClassNotFoundException, SQLException;
   int modifier(T obj) throws ClassNotFoundException, SQLException;
   int update(T obj) throws ClassNotFoundException, SQLException;
   int supprimer(String id) throws ClassNotFoundException, SQLException;
   T rechercher(String id) throws ClassNotFoundException, SQLException;
   ArrayList<T> afficher() throws ClassNotFoundException, SQLException;
    
    
}
