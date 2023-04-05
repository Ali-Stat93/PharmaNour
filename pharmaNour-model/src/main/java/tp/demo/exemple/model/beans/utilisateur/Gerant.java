package tp.demo.exemple.model.beans.utilisateur;

public class Gerant extends Utilisateur {

    /********** Constructor ***********/
    /**
     *
     * @param id
     * @param nom
     * @param prenom
     */
    public Gerant(String id, String nom, String prenom) {
        super(id, nom, prenom, TypeUtilisateur.GERANT);
    }

    /**
     *
     * @param id
     */
    public Gerant(String id) {
        super(id, TypeUtilisateur.GERANT);
    }
}
