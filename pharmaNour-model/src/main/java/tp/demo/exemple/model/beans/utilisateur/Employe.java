package tp.demo.exemple.model.beans.utilisateur;

public class Employe extends User {
    /********** Constructor ***********/
    /**
     *
     * @param id
     * @param nom
     * @param prenom
     */
    public Employe(String id, String nom, String prenom) {
        super(id, nom, prenom, TypeUser.EMPLOYE);
    }

    /**
     *
     * @param id
     */
    public Employe(String id) {
        super(id, TypeUser.EMPLOYE);
    }
}
