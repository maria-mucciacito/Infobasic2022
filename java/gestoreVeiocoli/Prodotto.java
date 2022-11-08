
public class Prodotto {
    private String codeUnivoco;
    private double prezzo;

    // COSTRUTTORE
    public Prodotto(String code, double prezzo) {
        this.codeUnivoco = code;
        this.prezzo = prezzo;
    }

    // toString
    @Override
    public String toString() {
        return "Prodotto {" +
                "codice: " + getCodeUnivoco() +
                ", prezzo: " + getPrezzo() +
                '}';
    }

    // SETTER E GETTER
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getCodeUnivoco() {
        return codeUnivoco;
    }

    public void setCodeUnivoco(String code) {
        this.codeUnivoco = code;
    }

}
