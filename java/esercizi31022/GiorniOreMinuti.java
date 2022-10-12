import java.util.Scanner;

public class GiorniOreMinuti {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds number:  ");
        long seconds = sc.nextLong();
        transform(seconds);

        sc.close();
        
    }

    public static void transform(long seconds) {
        // MINS NOT REQUIRED

        long hours = (seconds/60)/60;
        System.out.println("The hours are -->" + hours);
        long days = (int)(hours/24);
        System.out.println("The days are -->" + days);

    }
}
