package tp.demo.exemple.model.beans.pharma;

import tp.demo.exemple.model.beans.utilisateur.User;

import java.time.LocalDate;

public class OnLineSale extends Sale{
    private Client client;
    private boolean isConfirmed;

    /********** Constructor ***********/
    /**
     *
     * @param ID_Sale
     * @param dateSale
     * @param user
     * @param isOnLine
     * @param client
     */
    public OnLineSale(String ID_Sale, LocalDate dateSale, User user, boolean isOnLine,Client client) {
        super(ID_Sale, dateSale, user, true);
        this.client=client;
        this.isConfirmed=false;
    }
    /********** Getters & Setters ***********/

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }
}
