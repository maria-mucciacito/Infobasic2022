import java.util.Arrays;
import java.util.Scanner;

public class MiniGoogle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of your array: ");
        int len = sc.nextInt();
        int[] myArrayInteri = new int[len];

        for(int i=0; i<myArrayInteri.length; i++){
            System.out.print("Enter your element: ");
            int element = sc.nextInt();
            myArrayInteri[i] = element;
        }

        System.out.println(Arrays.toString(myArrayInteri)); 
        System.out.print("Enter number to verificate: ");
        int number = sc.nextInt();
        minigoogle(number,myArrayInteri);
        sc.close();
        
    }

    public static void minigoogle(int number, int[] myArrayInteri) {
            /*for(int i=0; i < myArrayInteri.length; i++){
                if(myArrayInteri[i]==number){
                    System.out.println("The number is present in your array!");
                } else {
                    System.out.println("The number is not present in your array!");
                }
            }*/
            boolean numberFound = false;
            for(int i: myArrayInteri){
                if(number==i){
                    numberFound = true;
                    break;
                } 

            }
           
            if(numberFound==true){
                System.out.println("The number is present in your array!");
            } else {
                System.out.println("The number is present not in your array!");
            }
        }
}
