import java.util.Scanner;
 
public class OperazioniAritmetiche {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        computeValues(a, b);
    }
 
    private static void computeValues(int a, int b) {
        System.out.println("La somma dei due numeri è pari a " + (a+b));
        System.out.println("La sottrazione dei due numeri è pari a " + (a-b));
        System.out.println("La moltiplicazione dei due numeri è pari a " + (a*b));
        System.out.println("La divisione dei due numeri è pari a " + (a/b));
    }
}