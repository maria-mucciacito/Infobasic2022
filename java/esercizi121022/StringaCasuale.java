import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class StringaCasuale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of your array: ");
        int len = sc.nextInt();
        String[] arrayStrings = new String[len];



        for(int i=0; i<arrayStrings.length; i++){
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter your string: ");
            String element = sc1.nextLine();
            arrayStrings[i] = element;
        }
        System.out.println(estraiString(arrayStrings));
        sc.close();
    }

    public static String estraiString(String[] arrayStrings){
        Random rand = new Random();
        int casuale = rand.nextInt(arrayStrings.length);
        return arrayStrings[casuale];
    }
}
