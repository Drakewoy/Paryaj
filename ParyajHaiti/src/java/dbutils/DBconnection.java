/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DBconnection {

    static Connection con = null;

    //etablir la connection a la base
    public static Connection connect() throws ClassNotFoundException, SQLException {
        //charge le pilote de la base de donnee
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/paryaj_spotif";
        con = DriverManager.getConnection(url, "root", "");
        return con;
    }

    //fermeture 
    public static void close(ResultSet rs, PreparedStatement st, Connection con) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (st != null) {
            st.close();
        }
        if (con != null) {
            con.close();
        }
    }
}
