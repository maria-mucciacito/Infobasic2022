import java.util.Scanner;

public class DispariQuadrati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numer: ");
        int number = sc.nextInt();
        System.out.println(quadrato(number));
        sc.close();
    }

    public static int quadrato(int n) {
            int contatore = 0;
            int somma = 0;
            for(int i = 0; contatore!=n; i++){
                if((i%2)==1){
                    somma+=i;
                    contatore++;
                }
            }
            return somma;
        }
}
