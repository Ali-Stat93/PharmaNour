package tp.demo.exemple.model.beans.utilisateur;

public class Employe extends Utilisateur {
    /********** Constructor ***********/
    /**
     *
     * @param id
     * @param nom
     * @param prenom
     */
    public Employe(String id, String nom, String prenom) {
        super(id, nom, prenom, TypeUtilisateur.EMPLOYE);
    }

    /**
     *
     * @param id
     */
    public Employe(String id) {
        super(id, TypeUtilisateur.EMPLOYE);
    }
}
