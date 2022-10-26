import java.util.List;

public class DistributoreDiBevande {
    private int numProdotti;
    private List<Prodotto> prodotti;
    private double credito = 0.0;

    //COSTRUTTORE
    public DistributoreDiBevande(int numProdotti){
        this.numProdotti = numProdotti;
    }

    //SETTER E GETTER
    public int getNumProdotti() {
        return numProdotti;
    }

    public void setNumProdotti(int numProdotti) {
        this.numProdotti = numProdotti;
    }
    
    public List<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setOperations(List<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    //METODI
    public void caricaProdotto(Prodotto p){
        prodotti.add(p);
    }

    public void inserisciImporto(double importo){
        this.credito += importo;
        System.out.println("Il tuo credito adesso è di " + this.credito);
    }

    public void scegliProdotto(String codiceProdotto){
        prodotti.forEach((p) -> { 
            String result; 
            if(p.getCodeUnivoco()==codiceProdotto){
                if(credito>=p.getPrezzo()){
                    System.out.println("Ecco a te il prodotto" + codiceProdotto );
                    this.credito -= p.getPrezzo();
                    result = p.toString();

                } else {
                    result = "Credito non sufficiente";
                }
            }else {
                result = "Prodotto non disponibile";
            }
        
        });
        //return result;
        
        
    }

    public double saldoAttuale(){
        return credito;
    }

    public double getResto(){
        double resto = this.credito;
        System.out.println("Ecco a te il resto di " + this.credito);
        this.credito = 0;
        return resto;
    }
}
