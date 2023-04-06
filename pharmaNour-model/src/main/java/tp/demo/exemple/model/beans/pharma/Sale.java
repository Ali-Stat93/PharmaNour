package tp.demo.exemple.model.beans.pharma;

public class Sale {
    private String Id_V;
    private String Nom_C;
    private int Qte;
    private float Ppa;
    private float Total;
    /********** Constructor ***********/
    /**
     *
     * @param id_V
     * @param nom_C
     * @param qte
     * @param ppa
     * @param total
     */
    public Sale(String id_V, String nom_C, int qte, float ppa, float total) {
        Id_V = id_V;
        Nom_C = nom_C;
        Qte = qte;
        Ppa = ppa;
        Total = total;
    }

    /**
     *
     * @param id_V
     */
    public Sale(String id_V) {
        Id_V = id_V;
    }
    /********** Getters & Setters ***********/
    public String getId_V() {
        return Id_V;
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

    public float getTotal() {
        return Total;
    }

    public void setTotal(float total) {
        Total = total;
    }
}
