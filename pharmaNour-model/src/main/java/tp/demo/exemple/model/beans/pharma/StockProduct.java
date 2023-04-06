package tp.demo.exemple.model.beans.pharma;

import tp.demo.exemple.model.beans.utilisateur.User;

import java.time.LocalDate;

public class StockProduct {
    private String ID_Stock;
    private int Qte;
    private LocalDate DateAddStock;
    private User user;
    private Product product;
    /********** Constructor ***********/
    /**
     *
     * @param ID_Stock
     * @param qte
     * @param dateAddStock
     */
    public StockProduct(String ID_Stock, int qte, LocalDate dateAddStock) {
        this.ID_Stock = ID_Stock;
        Qte = qte;
        DateAddStock = dateAddStock;
    }

    /**
     *
     * @param ID_Stock
     * @param qte
     * @param dateAddStock
     * @param user
     * @param product
     */
    public StockProduct(String ID_Stock, int qte, LocalDate dateAddStock, User user, Product product) {
        this.ID_Stock = ID_Stock;
        Qte = qte;
        DateAddStock = dateAddStock;
        this.user = user;
        this.product = product;
    }

    /********** Getters & Setters ***********/
    public String getID_Stock() {
        return ID_Stock;
    }

    public int getQte() {
        return Qte;
    }

    public void setQte(int qte) {
        Qte = qte;
    }

    public LocalDate getDateAddStock() {
        return DateAddStock;
    }

    public void setDateAddStock(LocalDate dateAddStock) {
        DateAddStock = dateAddStock;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
