import java.util.Arrays;
import java.util.Scanner;

public class Tabelline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int n = sc.nextInt();
        System.out.print("Enter your second number: ");
        int m = sc.nextInt();
        tabelline(n, m);

    }

    public static void tabelline(int n, int m) {
        int[] array1 = new int[m];
        for(int i=0; i<m; i++){
            array1[i] = i*n;
        }    
        System.out.println(Arrays.toString(array1));
    }
}
