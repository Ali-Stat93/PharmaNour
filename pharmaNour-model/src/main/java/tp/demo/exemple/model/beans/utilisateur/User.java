package tp.demo.exemple.model.beans.utilisateur;

public class User {
    private String id;
    private String nom;
    private String prenom;
    private TypeUser typeUser;

    /********** Constructor ***********/
    /**
     *
     * @param id
     * @param nom
     * @param prenom
     * @param typeUser
     */
    public User(String id, String nom, String prenom, TypeUser typeUser) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.typeUser = typeUser;
    }

    /**
     *
     * @param id
     * @param typeUser
     */

    public User(String id, TypeUser typeUser) {
        this.id = id;
        this.typeUser = typeUser;
    }

    /********** Getters & Setters ***********/
    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public TypeUser getTypeUtilisateur() {
        return typeUser;
    }

    public void setTypeUtilisateur(TypeUser typeUser) {
        this.typeUser = typeUser;
    }
}
