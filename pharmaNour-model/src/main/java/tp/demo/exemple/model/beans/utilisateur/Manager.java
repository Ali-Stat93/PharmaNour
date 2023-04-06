package tp.demo.exemple.model.beans.utilisateur;

public class Manager extends User {

    /********** Constructor ***********/
    /**
     *
     * @param id
     * @param nom
     * @param prenom
     */
    public Manager(String id, String nom, String prenom) {
        super(id, nom, prenom, TypeUser.GERANT);
    }

    /**
     *
     * @param id
     */
    public Manager(String id) {
        super(id, TypeUser.GERANT);
    }
}
