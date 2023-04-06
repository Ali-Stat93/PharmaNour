package tp.demo.exemple.model.beans.pharma;

public class LigneSale {
    private String ID_LS;
    private Product product;
    private Sale sale;
    private int qte;
    /********** Constructor ***********/
    /**
     *
     * @param product
     * @param sale
     * @param qte
     */
    public LigneSale(Product product, Sale sale, int qte) {
        this.ID_LS = sale.getID_Sale()+"/"+product.getN_Lot();
        this.product = product;
        this.sale = sale;
        this.qte = qte;
    }
    /********** Getters & Setters ***********/
    public String getID_LS() {
        return ID_LS;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
}
