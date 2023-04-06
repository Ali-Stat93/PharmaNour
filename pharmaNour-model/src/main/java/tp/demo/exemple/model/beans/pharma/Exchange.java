package tp.demo.exemple.model.beans.pharma;

import tp.demo.exemple.model.beans.utilisateur.Manager;

import java.time.LocalDate;

public class Exchange {
    private String Id_Echange;
    private Pharmacy pharmacy;
    private Manager manager;
    private LocalDate dateExchange;
    private ExchangeType type;


    /********** Constructor ***********/
    /**
     *
     * @param id_Echange
     */
    public Exchange(String id_Echange) {
        Id_Echange = id_Echange;
    }

    /**
     *
     * @param id_Echange
     * @param pharmacy
     * @param manager
     * @param dateExchange
     * @param type
     */
    public Exchange(String id_Echange, Pharmacy pharmacy, Manager manager, LocalDate dateExchange, ExchangeType type) {
        Id_Echange = id_Echange;
        this.pharmacy = pharmacy;
        this.manager = manager;
        this.dateExchange = dateExchange;
        this.type = type;
    }
    /********** Getters & Setters ***********/
    public String getId_Echange() {
        return Id_Echange;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public LocalDate getDateExchange() {
        return dateExchange;
    }

    public void setDateExchange(LocalDate dateExchange) {
        this.dateExchange = dateExchange;
    }

    public ExchangeType getType() {
        return type;
    }

    public void setType(ExchangeType type) {
        this.type = type;
    }
}
