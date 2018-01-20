package com.example.yougourta.projmob.Classes;

import java.io.Serializable;

/**
 * Created by Yougourta on 3/23/17.
 */

public class Disponibilite implements Serializable{
    private String jourDispo;
    private String heureDebutDispo;
    private String heureFinDispo;

    public Disponibilite(String jourDispo, String heureDebutDispo, String heureFinDispo) {
        this.jourDispo = jourDispo;
        this.heureDebutDispo = heureDebutDispo;
        this.heureFinDispo = heureFinDispo;
    }

    public String getJourDispo() {
        return jourDispo;
    }

    public void setJourDispo(String jourDispo) {
        this.jourDispo = jourDispo;
    }

    public String getHeureDebutDispo() {
        return heureDebutDispo;
    }

    public void setHeureDebutDispo(String heureDebutDispo) {
        this.heureDebutDispo = heureDebutDispo;
    }

    public String getHeureFinDispo() {
        return heureFinDispo;
    }

    public void setHeureFinDispo(String heureFinDispo) {
        this.heureFinDispo = heureFinDispo;
    }
}
