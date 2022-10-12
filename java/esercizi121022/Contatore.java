public class Contatore{
    private int contatore;

    public Contatore(){
        contatore = 0;  //il this in questo caso è superfluo
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
        contatore ++;  //il this non serve
    }
    


}