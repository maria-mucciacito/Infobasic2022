public class PrenotazioneGruppo extends Prenotazione{
    private int numPosti;

    public PrenotazioneGruppo(String code,int numPosti){
        super(code);
        this.numPosti = numPosti;
    }

    public int getNumPosti() {
        return numPosti;
    }

    public void setCodeUnivoco(int numPosti) {
        this.numPosti = numPosti;
    }

}
