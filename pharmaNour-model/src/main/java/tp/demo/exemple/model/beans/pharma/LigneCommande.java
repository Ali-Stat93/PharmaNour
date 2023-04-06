package tp.demo.exemple.model.beans.pharma;

public class LigneCommande {
    private String ID_LC;
    private Product product;
    private Commande commande;
    private int qte;
    /********** Constructor ***********/
    /**
     *
     * @param product
     * @param commande
     * @param qte
     */
    public LigneCommande(Product product, Commande commande, int qte) {
        this.ID_LC = commande.getID_Commande()+"/"+product.getN_Lot();
        this.product = product;
        this.commande = commande;
        this.qte = qte;
    }

    /********** Getters & Setters ***********/
    public String getID_LC() {
        return ID_LC;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
}
