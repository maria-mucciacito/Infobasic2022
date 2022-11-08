public class PrenotazioneSingola extends Prenotazione{
    private enum Preferenza{
        ESTERNO,
        INTERNO
    }

    public PrenotazioneSingola(String code, Preferenza preferenza){
        super(code);
    }

}
