package com.example.yougourta.projmob.Classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Yougourta on 3/23/17.
 */

public class Logement implements Serializable{
    private String titreLogement;
    private String prixLogement;
    private String typeLogement;
    private String surfaceLogement;
    private String nb_chambreLogement;
    private String adrLogement;
    private String detailLogement;


    private double latitude;
    private double longetude;

    private ArrayList<Disponibilite> joursVisiteLogement;
    private ArrayList<Integer> images;

    private Utilisateur proprietaireLogement;
    private String noteLogement;
    private ArrayList<Commentaire> commentairesLogement;
    private String etatLogement;
    private String nbVuesLogement;

    public Logement(String titreLogement, String prixLogement, String typeLogement, String surfaceLogement, String nb_chambreLogement, String adrLogement, String detailLogement, double latitude, double longetude, ArrayList<Disponibilite> joursVisiteLogement, ArrayList<Integer> images, Utilisateur proprietaireLogement, String noteLogement, ArrayList<Commentaire> commentairesLogement, String etatLogement, String nbVuesLogement) {
        this.titreLogement = titreLogement;
        this.prixLogement = prixLogement;
        this.typeLogement = typeLogement;
        this.surfaceLogement = surfaceLogement;
        this.nb_chambreLogement = nb_chambreLogement;
        this.adrLogement = adrLogement;
        this.detailLogement = detailLogement;
        this.latitude = latitude;
        this.longetude = longetude;
        this.joursVisiteLogement = joursVisiteLogement;
        this.images = images;
        this.proprietaireLogement = proprietaireLogement;
        this.noteLogement = noteLogement;
        this.commentairesLogement = commentairesLogement;
        this.etatLogement = etatLogement;
        this.nbVuesLogement = nbVuesLogement;
    }

    public String getTitreLogement() {
        return titreLogement;
    }

    public void setTitreLogement(String titreLogement) {
        this.titreLogement = titreLogement;
    }

    public String getPrixLogement() {
        return prixLogement;
    }

    public void setPrixLogement(String prixLogement) {
        this.prixLogement = prixLogement;
    }

    public String getTypeLogement() {
        return typeLogement;
    }

    public void setTypeLogement(String typeLogement) {
        this.typeLogement = typeLogement;
    }

    public String getSurfaceLogement() {
        return surfaceLogement;
    }

    public void setSurfaceLogement(String surfaceLogement) {
        this.surfaceLogement = surfaceLogement;
    }

    public String getNb_chambreLogement() {
        return nb_chambreLogement;
    }

    public void setNb_chambreLogement(String nb_chambreLogement) {
        this.nb_chambreLogement = nb_chambreLogement;
    }

    public String getAdrLogement() {
        return adrLogement;
    }

    public void setAdrLogement(String adrLogement) {
        this.adrLogement = adrLogement;
    }

    public String getDetailLogement() {
        return detailLogement;
    }

    public void setDetailLogement(String detailLogement) {
        this.detailLogement = detailLogement;
    }

    public ArrayList<Disponibilite> getJoursVisiteLogement() {
        return joursVisiteLogement;
    }

    public void setJoursVisiteLogement(ArrayList<Disponibilite> joursVisiteLogement) {
        this.joursVisiteLogement = joursVisiteLogement;
    }

    public ArrayList<Integer> getImages() {
        return images;
    }

    public void setImages(ArrayList<Integer> images) {
        this.images = images;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongetude() {
        return longetude;
    }

    public void setLongetude(double longetude) {
        this.longetude = longetude;
    }

    public Utilisateur getProprietaireLogement() {
        return proprietaireLogement;
    }

    public void setProprietaireLogement(Utilisateur proprietaireLogement) {
        this.proprietaireLogement = proprietaireLogement;
    }

    public String getNoteLogement() {
        return noteLogement;
    }

    public void setNoteLogement(String noteLogement) {
        this.noteLogement = noteLogement;
    }

    public ArrayList<Commentaire> getCommentairesLogement() {
        return commentairesLogement;
    }

    public void setCommentairesLogement(ArrayList<Commentaire> commentairesLogement) {
        this.commentairesLogement = commentairesLogement;
    }

    public String getEtatLogement() {
        return etatLogement;
    }

    public void setEtatLogement(String etatLogement) {
        this.etatLogement = etatLogement;
    }

    public String getNbVuesLogement() {
        return nbVuesLogement;
    }

    public void setNbVuesLogement(String nbVuesLogement) {
        this.nbVuesLogement = nbVuesLogement;
    }
}
