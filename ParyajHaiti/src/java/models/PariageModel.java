/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user
 */
public class PariageModel {
     
    // Les attributs
    
    private String id;
    private String id_compte;
    private String id_match;
    private String date;
    private String score;
    
    // Les constructeurs

    public PariageModel() {
    }

    public PariageModel(String id, String id_compte, String id_match, String date, String score) {
        this.id = id;
        this.id_compte = id_compte;
        this.id_match = id_match;
        this.date = date;
        this.score = score;
    }
    
    // Les getters

    public String getId() {
        return id;
    }

    public String getId_compte() {
        return id_compte;
    }

    public String getId_match() {
        return id_match;
    }

    public String getDate() {
        return date;
    }

    public String getScore() {
        return score;
    }
    
    // Les setters

    public void setId(String id) {
        this.id = id;
    }

    public void setId_compte(String id_compte) {
        this.id_compte = id_compte;
    }

    public void setId_match(String id_match) {
        this.id_match = id_match;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setScore(String score) {
        this.score = score;
    }
    
    
}
