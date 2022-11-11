import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<String> giocatori = new ArrayList<>();
        giocatori.add("paolo");
        giocatori.add("mario");
        Squadra roma = new Squadra("02", "roma", giocatori);
        Squadra juve = new Squadra("03", "juve", giocatori);
        roma.setPunteggio(5);
        juve.setPunteggio(7);
        List<Squadra> s = new ArrayList<>();
        s.add(roma);
        s.add(juve);
        SerieA serieA = new SerieA(20, s);
        System.out.print(serieA.getMigliorAttacco());  
        //Giocatore g1 = new Giocatore("1", "Paolo", "Dybala",roma);
    }
}