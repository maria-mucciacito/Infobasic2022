public class Automobile extends Veicolo{
    private int numPorte;

    public Automobile(String targa,int numPosti,int numPorte){
        super(targa, numPosti);
        this.numPorte = numPorte;
    }

    // toString
    @Override
    public String toString() {
        return "Automobile {" +
                "targa: " + super.getTarga() +
                ", numero posti: " + super.getNumPosti() +
                ", numero porte: " + getNumPorte() +
                '}';
    }

    //GETTER E SETTER
    public int getNumPorte() {
        return numPorte;
    }

    public void setTarga(int numPorte) {
        this.numPorte = numPorte;
    }
}
