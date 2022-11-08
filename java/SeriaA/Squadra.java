import java.util.List;

public class Squadra {
    private String id;
    private String nome;
    private List<String> rosaGiocatori;
    private int punteggio;
    private int golFatti;
    private int golSubiti;

    public Squadra(String id, String nome, List<String> rosaGiocatori) {
        this.id = id;
        this.nome = nome;
        this.rosaGiocatori = rosaGiocatori;
        this.punteggio = 0;
        this.golFatti = 0;
        this.golSubiti = 0;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", rosaGiocatori='" + getRosaGiocatori() + "'" +
            ", punteggio='" + getPunteggio() + "'" +
            ", golFatti='" + getGolFatti() + "'" +
            ", golSubiti='" + getGolSubiti() + "'" +
            "}";
    }
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getRosaGiocatori() {
        return this.rosaGiocatori;
    }

    public void setRosaGiocatori(List<String> rosaGiocatori) {
        this.rosaGiocatori = rosaGiocatori;
    }

    public int getPunteggio() {
        return this.punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public int getGolFatti() {
        return this.golFatti;
    }

    public void setGolFatti(int golFatti) {
        this.golFatti = golFatti;
    }

    public int getGolSubiti() {
        return this.golSubiti;
    }

    public void setGolSubiti(int golSubiti) {
        this.golSubiti = golSubiti;
    }
    
}
