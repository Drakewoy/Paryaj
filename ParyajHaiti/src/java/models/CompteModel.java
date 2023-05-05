/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author user
 */
public class CompteModel {
    // Les attributs de compte
    private String id;
    private String nom;
    private String prenom;
    private String sexe;
    private String adresse;
    private String lDn;
    private String dDn;
    private String tel;
    private String nifOuCin;
    private String n_utilisateur;
    private String motDePass;
    private Double solde;
    private String etat;
    // Les constructeurs
    public CompteModel(){}

    public CompteModel(String id, String nom, String prenom, String sexe, String adresse, String lDn, String dDn, String tel, String nifOuCin, String n_utilisateur, String motDePass, Double solde, String etat) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.adresse = adresse;
        this.lDn = lDn;
        this.dDn = dDn;
        this.tel = tel;
        this.nifOuCin = nifOuCin;   
        this.n_utilisateur = n_utilisateur;
        this.motDePass = motDePass;
        this.solde = solde;
        this.etat = etat;
    }
    
    // Les getters 

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getlDn() {
        return lDn;
    }

    public String getdDn() {
        return dDn;
    }

    public String getTel() {
        return tel;
    }

    public String getNifOuCin() {
        return nifOuCin;
    }

    public String getN_utilisateur() {
        return n_utilisateur;
    }

    public String getMotDePass() {
        return motDePass;
    }

    public Double getSolde() {
        return solde;
    }

    public String getEtat() {
        return etat;
    }
    
    //les setters

    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setlDn(String lDn) {
        this.lDn = lDn;
    }

    public void setdDn(String dDn) {
        this.dDn = dDn;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setNifOuCin(String nifOuSin) {
        this.nifOuCin = nifOuSin;
    }

    public void setN_utilisateur(String n_utilisateur) {
        this.n_utilisateur = n_utilisateur;
    }

    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    
}
