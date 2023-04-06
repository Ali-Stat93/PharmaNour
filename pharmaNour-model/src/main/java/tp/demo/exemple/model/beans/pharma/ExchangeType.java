package tp.demo.exemple.model.beans.pharma;

public enum ExchangeType {
    RECEIVE(1,"Recevoir"),
    SEND(1,"Envoyer");

    private int CodeET;
    private String nameET;

    ExchangeType(int codeET, String nameET) {
        CodeET = codeET;
        this.nameET = nameET;
    }
}
