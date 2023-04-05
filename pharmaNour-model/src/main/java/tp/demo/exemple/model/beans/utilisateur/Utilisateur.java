package tp.demo.exemple.model.beans.utilisateur;

public class Utilisateur {
    private String id;
    private String nom;
    private String prenom;
    private TypeUtilisateur typeUtilisateur;

    /********** Constructor ***********/
    /**
     *
     * @param id
     * @param nom
     * @param prenom
     * @param typeUtilisateur
     */
    public Utilisateur(String id, String nom, String prenom, TypeUtilisateur typeUtilisateur) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.typeUtilisateur = typeUtilisateur;
    }

    /**
     *
     * @param id
     * @param typeUtilisateur
     */

    public Utilisateur(String id, TypeUtilisateur typeUtilisateur) {
        this.id = id;
        this.typeUtilisateur = typeUtilisateur;
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

    public TypeUtilisateur getTypeUtilisateur() {
        return typeUtilisateur;
    }

    public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
        this.typeUtilisateur = typeUtilisateur;
    }
}
