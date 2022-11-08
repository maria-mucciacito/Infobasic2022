import java.util.List;

public class GestorePrenotazione{
    private List<Prenotazione> prenotazioniInterno;
    private List<Prenotazione> prenotazioniEsterno;
    private int numPostiInterno;
    private int numPostiEsterno;
    

    public GestorePrenotazione(int postiInterni, int postiEsterni, List<Prenotazione> prenotazioniInterno, List<Prenotazione> prenotazioniEsterno) {
        this.numPostiInterno = postiInterni;
        this.numPostiEsterno = postiEsterni;
        this.prenotazioniInterno = prenotazioniInterno;
        this.prenotazioniEsterno = prenotazioniEsterno;
    }

    public int getPostiInterno() {
        return numPostiInterno;
    }

    public void setPostiInterno(int postiInterni) {
        this.numPostiInterno = postiInterni;
    }

    public int getPostiEsterno() {
        return numPostiEsterno;
    }

    public void setPostiEsterno(int postiEsterni) {
        this.numPostiEsterno = postiEsterni;
    }

    public boolean prenota(){
        return flase;
    }

    public boolean inserisciPrenotazioneInterno(){
        return false;
    }

    public boolean inserisciPrenotazioneesterno(){
        return false;
    }

    public int postiOccupati(List<Prenotazione> prenotazioni){
        return 0;
    }

    public boolean terminaPrenotazione(Prenotazione p){
        return false;
    }

    public int getTotPostiOccupati(){
        
    }
}