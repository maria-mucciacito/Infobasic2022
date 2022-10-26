public class Veicolo {
    private String targa;
    private int numPosti;

    public Veicolo(String targa, int numPosti){
        this.targa = targa;
        this.numPosti = numPosti;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getNumPosti() {
        return numPosti;
    }

    public void setNumPosti(int numPosti) {
        this.numPosti = numPosti;
    }
}
