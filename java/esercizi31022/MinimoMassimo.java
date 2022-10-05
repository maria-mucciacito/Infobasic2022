import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;


public class MinimoMassimo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine();
        int[] values = parseNumbers(a);
        computeMinAndMax(values);
    }
 
    static int[] parseNumbers(String s) {
        
        String[] arrayStringhe = s.split(",");
        int[] arrayInteri = new int[arrayStringhe.length];
        for(int i=0; i<arrayStringhe.length;i++){
            arrayInteri[i] = Integer.parseInt(arrayStringhe[i]);
        }
        return arrayInteri;

    }
 
    static void computeMinAndMax(int[] values) {
        Arrays.sort(values);
        System.out.println("Il minimo è: " + values[0]);
        System.out.println("Il massimo è: " + values[values.length-1]);

    }
}