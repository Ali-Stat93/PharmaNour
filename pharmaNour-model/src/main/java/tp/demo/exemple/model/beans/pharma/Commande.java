package tp.demo.exemple.model.beans.pharma;

import java.time.LocalDate;

public class Commande {
    private String Id_bon;
    private LocalDate Date_bon;
    /********** Constructor ***********/
    /**
     *
     * @param id_bon
     * @param date_bon
     */
    public Commande(String id_bon, LocalDate date_bon) {
        Id_bon = id_bon;
        Date_bon = date_bon;
    }

    /**
     *
     * @param id_bon
     */
    public Commande(String id_bon) {
        Id_bon = id_bon;
    }
    /********** Getters & Setters ***********/
    public String getId_bon() {
        return Id_bon;
    }

    public LocalDate getDate_bon() {
        return Date_bon;
    }

    public void setDate_bon(LocalDate date_bon) {
        Date_bon = date_bon;
    }
}
