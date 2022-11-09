import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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

    public void risultatoPartita( Squadra squadraCasa,Squadra squadraFuoriCSquadra,int golCasa,int golFuoriCasa){

        if(squadraCasa.equals(squadraFuoriCSquadra)){
            return;
        }
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
        List<Squadra> filterList = squadre.stream().filter(t -> t.getPunteggio()==puntMax).collect(Collectors.toList());
        max = filterList.get(0);
        return max;
    }

    public Squadra getPeggiorDifesa(){
        return null;
    }
}

    
