
public class Main {
    public static void main(String[] args) {
        //test classe Contatore
        Contatore contatore1 = new Contatore();
        System.out.println(contatore1.getContatore());   
        Contatore contatore2 = new Contatore(3);
        System.out.println(contatore2.getContatore());  
        contatore1.increment();
        contatore2.increment();
        System.out.println(contatore1.getContatore());  
        System.out.println(contatore2.getContatore()); 
        contatore1.reset(5);
        contatore2.reset();
        System.out.println(contatore1.getContatore());  
        System.out.println(contatore2.getContatore()); 

        //test classe Lampadina
        Lampadina l1 = new Lampadina();
        //System.out.println(l1.getContatore());
        //l1.click();
        System.out.println(l1.getStato());
        /*System.out.println(l1.getContatore());
        l1.click();
        l1.click();
        l1.click();
        l1.click();
        l1.click();
        l1.click();
        l1.click();
        l1.click();
        l1.click();
        l1.click();*/

        //test classe interruttore
        Interruttore i1 = new Interruttore(l1);
        Interruttore i2 = new Interruttore(l1);

        i1.click();
        System.out.println(l1.getStato());
        i2.click();
        System.out.println(l1.getStato());
        i2.click();
        i2.click();
        i2.click();
        i2.click();
        i2.click();
        i2.click();
        i2.click();
        i2.click();
        i1.click();
        i2.click();
        Lampadina l2 = new Lampadina();
        Interruttore i3 = new Interruttore(l2);
        i3.click();
        i3.click();
        Lampadina.setStatoCorrente(false);
        i2.click();
        i1.click();
        i3.click();
        System.out.println(l1.getStato());
        System.out.println(l2.getStato());

    }
}
