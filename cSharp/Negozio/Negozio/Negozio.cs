/*public class Negozio{
    private List<Prodotto> listaProdotti = new List<Prodotto>();
    static public int quantitaMax = 10;
    private int quantitaAttuale;

    public Negozio(List<Prodotto> listaProdotti){
        this.quantitaAttuale = listaProdotti.Count; 
        if(quantitaAttuale>quantitaMax){
            throw new Exception("La quantità dei prodotti è maggiore rispetto a quella inesribile!");
        } else{
            this.listaProdotti = listaProdotti;
        }
    }
    public List<Prodotto> ListaProdotti{
        get{ return listaProdotti;}
        set{ listaProdotti=value;}
    }
    public int QuantitaMax{
        get{ return quantitaMax;}
        set{ quantitaMax=value;}
    }
    public int QuantitaAttuale{
        get{ return quantitaAttuale;}
        set{ quantitaAttuale=value;}
    }
    public void AggiungiProdotto(Prodotto p){
        if(this.quantitaAttuale>=10){
            Console.WriteLine("Lo scaffale può contenere al massimo 10 prodotti! Esso è già al completo");
            return;
        }else{
            this.listaProdotti.Add(p);
            this.quantitaAttuale+=1;
            Console.WriteLine("Il prodotto è stato aggiunto allo scaffale");
        }
    }
    public bool RimuoviProdottoById(Prodotto p){
        bool flag = false;
        for(int i=0;i<this.listaProdotti.Count;i++){
            if(listaProdotti[i].Id == p.Id){
                this.listaProdotti.Remove(p);
                flag = true;
            }
        }
        return flag;
        //System.out.println("esito");
    }
    public int OttieniQuantitaResidua(string codeProdotto){
        int count = 0;
        foreach(var prodotto in listaProdotti){
           if(prodotto.CodeProdotto.Equals(codeProdotto)){
                count += 1;
            } 
        }
        return count;
    }
    public bool AcquistaProdotti(List<Prodotto> listaP){
        //double totPgamento = 0.00;
        bool flag = false;
        foreach(var prodotto in listaP){
            if(this.listaProdotti.Contains(prodotto)){
                //totPgamento += prodotto.Prezzo;
                //Console.WriteLine(totPgamento);
                RimuoviProdottoById(prodotto);
            } else {
                Console.Write("Il prodotto"+ prodotto.ToString() + " non è presente nel negozio");
                return flag;
            }
        }
        return flag;
    }
}*/