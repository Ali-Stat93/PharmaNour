package tp.demo.exemple.model.beans.pharma;

public class Pharmacy {
    private int ID_Pharmacy;
    private String NamePharmacy;
    private String tel;
    private String adress;

    /********** Constructor ***********/
    /**
     *
     * @param ID_Pharmacy
     * @param namePharmacy
     * @param tel
     * @param adress
     */
    public Pharmacy(int ID_Pharmacy, String namePharmacy, String tel, String adress) {
        this.ID_Pharmacy = ID_Pharmacy;
        NamePharmacy = namePharmacy;
        this.tel = tel;
        this.adress = adress;
    }
    /********** Getters & Setters ***********/
    public int getID_Pharmacy() {
        return ID_Pharmacy;
    }

    public String getNamePharmacy() {
        return NamePharmacy;
    }

    public void setNamePharmacy(String namePharmacy) {
        NamePharmacy = namePharmacy;
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
}
