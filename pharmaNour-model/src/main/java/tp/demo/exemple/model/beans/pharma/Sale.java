package tp.demo.exemple.model.beans.pharma;

import tp.demo.exemple.model.beans.utilisateur.User;

import java.time.LocalDate;

public class Sale {
    private String ID_Sale;
    private LocalDate DateSale;
    private User user;
    private boolean isOnLine;
    /********** Constructor ***********/
    /**
     *
     * @param ID_Sale
     */
    public Sale(String ID_Sale) {
        this.ID_Sale = ID_Sale;
        isOnLine=false;
    }
    /**
     *
     * @param ID_Sale
     * @param dateSale
     */
    public Sale(String ID_Sale, LocalDate dateSale) {
        this(ID_Sale);
        DateSale = dateSale;

    }

    /**
     *
     * @param ID_Sale
     * @param dateSale
     * @param user
     */
    public Sale(String ID_Sale, LocalDate dateSale, User user) {
        this(ID_Sale,dateSale);
        this.user=user;
    }

    /**
     *
     * @param ID_Sale
     * @param dateSale
     * @param user
     * @param isOnLine
     */
    public Sale(String ID_Sale, LocalDate dateSale, User user, boolean isOnLine) {
        this.ID_Sale = ID_Sale;
        DateSale = dateSale;
        this.user = user;
        this.isOnLine = isOnLine;
    }

    /********** Getters & Setters ***********/
    public String getId_V() {
        return ID_Sale;
    }

    public LocalDate getDateSale() {
        return DateSale;
    }

    public void setDateSale(LocalDate dateSale) {
        DateSale = dateSale;
    }

    public String getID_Sale() {
        return ID_Sale;
    }

    public void setID_Sale(String ID_Sale) {
        this.ID_Sale = ID_Sale;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
