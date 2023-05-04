/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user
 */
public class MatchModel {
    
    // Les attributs
    private String id;
    private String type;
    private String pays;
    private String dateMatch;
    private String heureMatch;
    private String equipeR;
    private String equipeV;
    private double cote;
    private double prixFiche ;
    private String ScoreFinal;
    private String etat;
    
    // Les constructeurs

    public MatchModel() {
    }

    public MatchModel(String id, String type, String pays, String dateMatch, String heureMatch, String equipeR, String equipeV, double cote, double prixFiche, String ScoreFinal, String etat) {
        this.id = id;
        this.type = type;
        this.pays = pays;
        this.dateMatch = dateMatch;
        this.heureMatch = heureMatch;
        this.equipeR = equipeR;
        this.equipeV = equipeV;
        this.cote = cote;
        this.prixFiche = prixFiche;
        this.ScoreFinal = ScoreFinal;
        this.etat = etat;
    }
    
    // Les getters

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getPays() {
        return pays;
    }

    public String getDateMatch() {
        return dateMatch;
    }

    public String getHeureMatch() {
        return heureMatch;
    }

    public String getEquipeR() {
        return equipeR;
    }

    public String getEquipeV() {
        return equipeV;
    }

    public double getCote() {
        return cote;
    }

    public double getPrixFiche() {
        return prixFiche;
    }

    public String getScoreFinal() {
        return ScoreFinal;
    }

    public String getEtat() {
        return etat;
    }
    
    // Les setters

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setDateMatch(String dateMatch) {
        this.dateMatch = dateMatch;
    }

    public void setHeureMatch(String heureMatch) {
        this.heureMatch = heureMatch;
    }

    public void setEquipeR(String equipeR) {
        this.equipeR = equipeR;
    }

    public void setEquipeV(String equipeV) {
        this.equipeV = equipeV;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    public void setPrixFiche(double prixFiche) {
        this.prixFiche = prixFiche;
    }

    public void setScoreFinal(String ScoreFinal) {
        this.ScoreFinal = ScoreFinal;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    
}
