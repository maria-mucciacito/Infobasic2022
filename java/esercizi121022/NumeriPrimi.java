import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

public class NumeriPrimi {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your number: "); 
       int n = sc.nextInt();
       System.out.print(Arrays.toString(check(n)));

    }

    public static int[] check(int n){
        int[] arrayPrimi = new int[n];
        boolean risultato = true;
        int contatore = -1;
        for(int j = n; j>0; j--){
            for(int i=j-1; i>=2; i--){
                if(j%i == 0){
                    risultato = false;
                } else {
                    risultato = true;
                }
                
            }

            if(risultato == true){
                contatore ++;
                arrayPrimi[contatore] = j;
            }

        }
        return arrayPrimi;
    }
}
