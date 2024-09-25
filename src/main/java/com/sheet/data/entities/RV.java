package com.sheet.data.entities;

public class RV {
    private int id;
    private String date;
    private String heure;
    private Medecin medecin;

   
    
    public RV(int id, String date, String heure, int medecinId) {
        this.id = id;
        this.date = date;
        this.heure = heure;
        this.medecin.setId(medecinId);
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getHeure() {
        return heure;
    }
    public void setHeure(String heure) {
        this.heure = heure;
    }
}
