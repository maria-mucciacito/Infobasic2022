import java.util.ArrayList;

public class DistributoreDiBevande {
    private int numProdotti;
    private ArrayList<Prodotto> prodotti;
    private double credito;

    //COSTRUTTORE
    public DistributoreDiBevande(int numProdotti){
        this.numProdotti = numProdotti;
        this.credito = 0.0;
        prodotti = new ArrayList<>();
    }

    //SETTER E GETTER
    public int getNumProdotti() {
        return numProdotti;
    }

    public void setNumProdotti(int numProdotti) {
        this.numProdotti = numProdotti;
    }
    
    public ArrayList<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setOperations(ArrayList<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    //METODI
    public boolean caricaProdotto(Prodotto p){
        if(prodotti.size()<numProdotti){
            prodotti.add(p);
        } else {
            return false;
        }
        return true;
    }

    public void inserisciImporto(double importo){
        this.credito += importo;
        System.out.println("Il tuo credito adesso è di " + this.credito);
    }

    public Prodotto scegliProdotto(String codiceProdotto){
        Prodotto result = null;
        for(Prodotto p: prodotti){
            if(p.getCodeUnivoco()==codiceProdotto){
                if(credito>=p.getPrezzo()){
                    System.out.println("Ecco a te il prodotto  " + codiceProdotto );
                    this.credito -= p.getPrezzo();
                    return p;

                } else {
                    System.out.print("Credito non sufficiente");
                }
            }
        }
        return result;
        
        
    }

    public double saldoAttuale(){
        return credito;
    }

    public double getResto(){
        double resto = this.credito;
        //System.out.println("Ecco a te il resto di " + this.credito);
        this.credito = 0;
        return resto;
    }
}
