package tp.demo.exemple.model.beans.pharma;

import tp.demo.exemple.model.beans.utilisateur.Manager;

import java.time.LocalDate;

public class Commande {
    private String ID_Commande;
    private LocalDate Date_bon;
    private Manager manager;
    /********** Constructor ***********/
    /**
     *  @param IDCommande
     * @param date_bon
     * @param manager
     */
    public Commande(String IDCommande, LocalDate date_bon, Manager manager) {
        ID_Commande = IDCommande;
        Date_bon = date_bon;
        this.manager = manager;
    }

    /**
     *
     * @param IDCommande
     */
    public Commande(String IDCommande) {
        ID_Commande = IDCommande;
    }
    /********** Getters & Setters ***********/
    public String getID_Commande() {
        return ID_Commande;
    }

    public LocalDate getDate_bon() {
        return Date_bon;
    }

    public void setDate_bon(LocalDate date_bon) {
        Date_bon = date_bon;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
