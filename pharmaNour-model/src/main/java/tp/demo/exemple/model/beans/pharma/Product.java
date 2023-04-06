package tp.demo.exemple.model.beans.pharma;

import java.time.LocalDate;

public class Product {
    private String N_Lot;
    private String commercialName;
    private float Uprice;
    private float Pprice;
    private LocalDate DateExp;
    private String Dosage;
    private String conditionnement;

    /********** Constructor ***********/
    /**
     *  @param n_Lot
     * @param commercialName
     * @param uprice
     * @param pprice
     * @param dateExp
     * @param dosage
     * @param conditionnement
     */
    public Product(String n_Lot, String commercialName, float uprice, float pprice, LocalDate dateExp, String dosage, String conditionnement) {
        N_Lot = n_Lot;
        this.commercialName = commercialName;
        Pprice = pprice;
        Uprice = uprice;
        DateExp = dateExp;
        Dosage = dosage;
        this.conditionnement = conditionnement;
    }

    /**
     *
     * @param n_Lot
     */
    public Product(String n_Lot) {
        N_Lot = n_Lot;
    }
    /********** Getters & Setters ***********/
    public String getN_Lot() {
        return N_Lot;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    public float getPprice() {
        return Pprice;
    }

    public void setPprice(float pprice) {
        Pprice = pprice;
    }

    public float getUprice() {
        return Uprice;
    }

    public void setUprice(float uprice) {
        Uprice = uprice;
    }

    public LocalDate getDateExp() {
        return DateExp;
    }

    public void setDateExp(LocalDate dateExp) {
        DateExp = dateExp;
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
