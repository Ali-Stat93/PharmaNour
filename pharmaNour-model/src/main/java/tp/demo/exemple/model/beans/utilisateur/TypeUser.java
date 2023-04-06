package tp.demo.exemple.model.beans.utilisateur;

public enum TypeUser {
    GERANT(1,"Gérant"),
    EMPLOYE(2,"Employé");

    private int id;
    private String nom;

    TypeUser(int id, String nom) {
        this.id=id;
        this.nom=nom;
    }
}
