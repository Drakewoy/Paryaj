/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user
 */
public class PaiementModel {
    
    // Les attributs
    private String id;
    private String id_pariage;
    private String date;
    
    // Les constructeurs

    public PaiementModel() {
    }

    public PaiementModel(String id, String id_pariage, String date) {
        this.id = id;
        this.id_pariage = id_pariage;
        this.date = date;
    }
    
    // Les getters

    public String getId() {
        return id;
    }

    public String getId_pariage() {
        return id_pariage;
    }

    public String getDate() {
        return date;
    }
    
    // Les setters

    public void setId(String id) {
        this.id = id;
    }

    public void setId_pariage(String id_pariage) {
        this.id_pariage = id_pariage;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
