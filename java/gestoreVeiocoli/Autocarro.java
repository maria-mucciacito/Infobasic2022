public class Autocarro extends Veicolo{
    private int capacitàMaxCarico;

    public Autocarro(String targa,int numPosti,int capacitàMax){
        super(targa, numPosti);
        this.capacitàMaxCarico = capacitàMax;
    }
    
    // toString
    @Override
    public String toString() {
        return "Autocarro {" +
                "targa: " + super.getTarga() +
                ", numero posti: " + super.getNumPosti() +
                ", capacità massima carico: " + getCapacitàMaxCarico() +
                '}';
    }

    //GETTER E SETTER
    public int getCapacitàMaxCarico() {
        return capacitàMaxCarico;
    }

    public void setTarga(int capacitàMax) {
        this.capacitàMaxCarico = capacitàMax;
    }
}
