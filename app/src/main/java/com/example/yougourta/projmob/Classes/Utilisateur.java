package com.example.yougourta.projmob.Classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Nadji AZRI on 21/03/2017.
 */

public class Utilisateur implements Serializable{
    private String idUser;
    private String mdpUser;
    private String telUser;
    private String emailUser;
    private String adrUser;
    private int imageUser;
    private boolean connecté;
    private ArrayList<RendezVous> rendezVous;

    public Utilisateur(String idUser, String mdpUser, String telUser, String emailUser, String adrUser, int imageUser, boolean connecté, ArrayList<RendezVous> rendezVous) {
        this.idUser = idUser;
        this.mdpUser = mdpUser;
        this.telUser = telUser;
        this.emailUser = emailUser;
        this.adrUser = adrUser;
        this.imageUser = imageUser;
        this.connecté = connecté;
        this.rendezVous = rendezVous;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getMdpUser() {
        return mdpUser;
    }

    public void setMdpUser(String mdpUser) {
        this.mdpUser = mdpUser;
    }

    public String getTelUser() {
        return telUser;
    }

    public void setTelUser(String telUser) {
        this.telUser = telUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getAdrUser() {
        return adrUser;
    }

    public void setAdrUser(String adrUser) {
        this.adrUser = adrUser;
    }

    public boolean isConnecté() {
        return connecté;
    }

    public void setConnecté(boolean connecté) {
        this.connecté = connecté;
    }

    public int getImageUser() {
        return imageUser;
    }

    public void setImageUser(int imageUser) {
        this.imageUser = imageUser;
    }

    public ArrayList<RendezVous> getRendezVous() {
        return rendezVous;
    }

    public void setRendezVous(ArrayList<RendezVous> rendezVous) {
        this.rendezVous = rendezVous;
    }
}
