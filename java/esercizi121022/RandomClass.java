import java.util.Scanner;
import java.lang.Math;
 
public class RandomClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of face: ");
		int numeroFacce = sc.nextInt();
        System.out.println(lanciaDado(numeroFacce));
        sc.close();
    }
 
    private static int lanciaDado(int numeroFacce)
    {
        int random = (int)(Math.random()*(numeroFacce+1));
        return random;
    }
}