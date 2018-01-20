package com.example.yougourta.projmob.Classes;

import java.io.Serializable;

/**
 * Created by Yougourta on 3/23/17.
 */

public class RendezVous implements Serializable{
    private Logement logementRDV;
    private Utilisateur visiteurRDV;
    private String jourRDV;
    private String heureDebutRDV;

    public RendezVous(Logement logementRDV, Utilisateur visiteurRDV, String jourRDV, String heureDebutRDV) {
        this.logementRDV = logementRDV;
        this.visiteurRDV = visiteurRDV;
        this.jourRDV = jourRDV;
        this.heureDebutRDV = heureDebutRDV;
    }

    public Logement getLogementRDV() {
        return logementRDV;
    }

    public void setLogementRDV(Logement logementRDV) {
        this.logementRDV = logementRDV;
    }

    public Utilisateur getVisiteurRDV() {
        return visiteurRDV;
    }

    public void setVisiteurRDV(Utilisateur visiteurRDV) {
        this.visiteurRDV = visiteurRDV;
    }

    public String getJourRDV() {
        return jourRDV;
    }

    public void setJourRDV(String jourRDV) {
        this.jourRDV = jourRDV;
    }

    public String getHeureDebutRDV() {
        return heureDebutRDV;
    }

    public void setHeureDebutRDV(String heureDebutRDV) {
        this.heureDebutRDV = heureDebutRDV;
    }

}
