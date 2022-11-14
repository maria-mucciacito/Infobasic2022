import java.util.ArrayList;
import java.util.List;

public class Negozio{
    private List<Prodotto> listaProdotti = new ArrayList<>();
    static public int quantitaMax = 10;
    private int quantitaAttuale;


    public Negozio(List<Prodotto> listaProdotti) throws Exception {
        this.quantitaAttuale = listaProdotti.size(); 
        if(quantitaAttuale>quantitaMax){
            throw new Exception("La quantità dei prodotti è maggiore rispetto a quella inesribile!");
        } else{
            this.listaProdotti = listaProdotti;
        }
    }
    
    public Negozio(){this.quantitaAttuale = 0;}

    public List<Prodotto> getListaProdotti() {
        return this.listaProdotti;
    }

    public void setListaProdotti(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public void aggiungiProdotto(Prodotto p){
        if(this.quantitaAttuale>=100){
            System.out.println("Lo scaffale può contenere al massimo 10 prodotti! Esso è già al completo");
            return;
        }else{
            this.listaProdotti.add(p);
            System.out.println("Il prodotto è stato aggiunto allo scaffale");
        }
    }

    public boolean rimuoviProdottoById(Prodotto p){
        boolean flag = false;
        for (Prodotto prodotto : listaProdotti) {
            if(prodotto.getId()==p.getId()){
                this.listaProdotti.remove(p);
                flag = true;
            }
        }
        return flag;
    }

    public int ottieniQuantitaResidua(Prodotto p){
        int count = 0;
        for (Prodotto prodotto : listaProdotti) {
            if(p.getCodeProdotto().equals(prodotto.getCodeProdotto())){
                count += 1;
            }
        }
        return count;
    }

    public double acquistaProdotti(List<Prodotto> listaP){
        double totPgamento = 0.00;
        for (Prodotto prodotto : listaP) {
            if(this.listaProdotti.contains(prodotto)){
                totPgamento += prodotto.getPrezzo();
                rimuoviProdottoById(prodotto);
            }
        }
        return totPgamento;
    }

}