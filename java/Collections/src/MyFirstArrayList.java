import java.util.ArrayList;
import java.util.List;

// Exercise 1.4.1
//Progettare una classe `MyFirstArrayList`, che, nel metodo `main`, crea una nuova `ArrayList` di interi e ci inserisce i numeri da 1 a 10.


public class MyFirstArrayList {
    public static void main(String[] args) {
        List<Integer> myFirstArrayList = new ArrayList<>();
        for(int i=0; i<=10; i++){
            myFirstArrayList.add(i);
        }
        System.out.print(myFirstArrayList);
        
    }
}
