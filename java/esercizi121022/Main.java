import java.lang.invoke.LambdaMetafactory;

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
        System.out.println(l1.getContatore());
        l1.click();
        System.out.println(l1.getStato());
        System.out.println(l1.getContatore());
        l1.click();
        l1.click();
        l1.click();
        l1.click();
        l1.click();
        l1.click();
        l1.click();
        l1.click();
        l1.click();
        l1.click();
    }
}
