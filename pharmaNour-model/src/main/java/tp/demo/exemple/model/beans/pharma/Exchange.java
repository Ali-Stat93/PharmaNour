package tp.demo.exemple.model.beans.pharma;

import java.util.ArrayList;
import java.util.List;

public class Exchange {
    private String Id_Echange;
    private String Id_ph;
    private String Nom_ph;
    private String type;
    private List<Product> products;


    /********** Constructor ***********/
    /**
     *
     * @param id_Echange
     */
    public Exchange(String id_Echange) {
        Id_Echange = id_Echange;
        products = new ArrayList<>();
    }

    /**
     *
     * @param id_Echange
     * @param id_ph
     * @param nom_ph
     * @param type
     */
    public Exchange(String id_Echange, String id_ph, String nom_ph, String type) {
        this(id_Echange);
        Id_ph = id_ph;
        Nom_ph = nom_ph;
        this.type = type;
    }
    /********** Getters & Setters ***********/
    public String getId_Echange() {
        return Id_Echange;
    }

    public String getId_ph() {
        return Id_ph;
    }

    public void setId_ph(String id_ph) {
        Id_ph = id_ph;
    }

    public String getNom_ph() {
        return Nom_ph;
    }

    public void setNom_ph(String nom_ph) {
        Nom_ph = nom_ph;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
