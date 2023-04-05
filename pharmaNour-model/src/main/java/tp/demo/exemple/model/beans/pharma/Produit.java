package tp.demo.exemple.model.beans.pharma;

import java.time.LocalDate;

public class Produit {
    private String N_Lot;
    private String Nom_C;
    private int Qte;
    private float Ppa;
    private LocalDate Exp;
    private String Dosage;
    private String conditionnement;

    /********** Constructor ***********/
    /**
     *
     * @param n_Lot
     * @param nom_C
     * @param qte
     * @param ppa
     * @param exp
     * @param dosage
     * @param conditionnement
     */
    public Produit(String n_Lot, String nom_C, int qte, float ppa, LocalDate exp, String dosage, String conditionnement) {
        N_Lot = n_Lot;
        Nom_C = nom_C;
        Qte = qte;
        Ppa = ppa;
        Exp = exp;
        Dosage = dosage;
        this.conditionnement = conditionnement;
    }

    /**
     *
     * @param n_Lot
     */
    public Produit(String n_Lot) {
        N_Lot = n_Lot;
    }
    /********** Getters & Setters ***********/
    public String getN_Lot() {
        return N_Lot;
    }

    public String getNom_C() {
        return Nom_C;
    }

    public void setNom_C(String nom_C) {
        Nom_C = nom_C;
    }

    public int getQte() {
        return Qte;
    }

    public void setQte(int qte) {
        Qte = qte;
    }

    public float getPpa() {
        return Ppa;
    }

    public void setPpa(float ppa) {
        Ppa = ppa;
    }

    public LocalDate getExp() {
        return Exp;
    }

    public void setExp(LocalDate exp) {
        Exp = exp;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        Dosage = dosage;
    }

    public String getConditionnement() {
        return conditionnement;
    }

    public void setConditionnement(String conditionnement) {
        this.conditionnement = conditionnement;
    }
}
