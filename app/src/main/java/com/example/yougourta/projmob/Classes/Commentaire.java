package com.example.yougourta.projmob.Classes;

import java.io.Serializable;

/**
 * Created by Yougourta on 3/28/17.
 */

public class Commentaire implements Serializable{
    private Utilisateur utilisateur;
    private String contentu;

    public Commentaire(Utilisateur utilisateur, String contentu) {
        this.utilisateur = utilisateur;
        this.contentu = contentu;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getContentu() {
        return contentu;
    }

    public void setContentu(String contentu) {
        this.contentu = contentu;
    }
}
