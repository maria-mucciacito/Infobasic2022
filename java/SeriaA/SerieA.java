import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SerieA implements Classifica{
    private int numSquadre;
    private List<Squadra> squadre;

    public SerieA(int numSquadre, List<Squadra> squadre) {
        this.numSquadre = numSquadre;
        this.squadre = squadre;
    }
    
    public List<Squadra> getSquadre() {
        return this.squadre;
    }

    public void setSquadre(List<Squadra> squadre) {
        this.squadre = squadre;
    }

    public int getNumSquadre() {
        return this.numSquadre;
    }

    public void setNumSquadre(int numSquadre) {
        this.numSquadre = numSquadre;
    }

    public void getClassifica(){

    }
;
    public Squadra getMigliorAttacco(){
        Squadra max = null;
        List<Integer> punteggiSquadre = new ArrayList<>();
        for(Squadra s : squadre){
            punteggiSquadre.add(s.getPunteggio());
        }
        //System.out.println(punteggiSquadre);
        int puntMax = Collections.max(punteggiSquadre);
        //System.out.println(Collections.max(punteggiSquadre));
        System.out.println(squadre.stream().filter(t -> t.getPunteggio()==puntMax));
        squadre.stream().filter(t -> t.getPunteggio()==puntMax);
        return max;
    }

    public Squadra getPeggiorDifesa(){
        return null;
    }
}

    
