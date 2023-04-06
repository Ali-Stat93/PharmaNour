package tp.demo.exemple.model.beans.pharma;

import tp.demo.exemple.model.beans.utilisateur.User;

public class Client {
    private String CIN;
    private String firstName;
    private String lastName;
    private String tel;
    private String adress;
    private User addByUser;
    /********** Constructor ***********/
    /**
     *
     * @param CIN
     * @param firstName
     * @param lastName
     */
    public Client(String CIN, String firstName, String lastName) {
        this.CIN = CIN;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *
     * @param CIN
     * @param firstName
     * @param lastName
     * @param addByUser
     */
    public Client(String CIN, String firstName, String lastName, User addByUser) {
        this.CIN = CIN;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addByUser = addByUser;
    }

    /**
     *
     * @param CIN
     * @param firstName
     * @param lastName
     * @param tel
     * @param adress
     * @param addByUser
     */
    public Client(String CIN, String firstName, String lastName, String tel, String adress, User addByUser) {
        this.CIN = CIN;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tel = tel;
        this.adress = adress;
        this.addByUser = addByUser;
    }
    /********** Getters & Setters ***********/
    public String getCIN() {
        return CIN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public User getAddByUser() {
        return addByUser;
    }

    public void setAddByUser(User addByUser) {
        this.addByUser = addByUser;
    }
}
