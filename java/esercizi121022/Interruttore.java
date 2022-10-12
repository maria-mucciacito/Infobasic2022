public class Interruttore {
    private int contatore=0;
    private Lampadina lampadina;
    
    public Interruttore(Lampadina lampadina){
        this.lampadina = lampadina;
    }

    public void click(){
        contatore++;
        if(lampadina.statoCorrente==true){
            if(contatore>=10){
                lampadina.stato = lampadina.situazioni[2];
                System.out.println("L'interruttore adesso è " + lampadina.stato);
            } else {
                if((lampadina.stato).equals(lampadina.situazioni[0])){
                    lampadina.stato = lampadina.situazioni[1];
                    System.out.println("Adesso la lampadina è " + lampadina.stato);
                } else {
                    lampadina.stato = lampadina.situazioni[0];
                    System.out.println("Adesso la lampadina è " + lampadina.stato);
                }
            }
        } else {
            if(contatore>=10){
                lampadina.stato = lampadina.situazioni[2];
                System.out.println("L'interruttore adesso è " + lampadina.stato);
            } else {
                lampadina.stato = lampadina.situazioni[0];
            }
        }
        
    }
}
