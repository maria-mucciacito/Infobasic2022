import java.util.ArrayList;
import java.util.Arrays;

/*Exercise 1.4.4
Progettare una classe `EmptyList` che espone un metodo statico `empty` che, preso in input una `ArrayList<String>`, la svuota.*/


public class EmptyList{
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>((Arrays.asList("Buenos Aires", "Córdoba", "La Plata")));
        System.out.println(strings);
        EmptyList.empty(strings); 
        System.out.println(strings);
    }

    public static ArrayList<String> empty(ArrayList<String> strings){
        strings.clear();
        return strings;
    }
}
