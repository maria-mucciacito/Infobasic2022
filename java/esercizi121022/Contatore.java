public class Contatore{
    private int contatore;

    public Contatore(){
        this.contatore = 0;
    }

    public Contatore(int contatore){
        this.contatore = contatore;
    }

    public int getContatore(){
        return contatore;
    }

    public void reset(int contatore){
        this.contatore = contatore;
    }

    public void reset(){
        this.contatore = 0;
    }

    public void increment(){
        this.contatore += 1;
    }
    


}