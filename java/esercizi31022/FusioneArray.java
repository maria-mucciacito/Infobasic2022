import java.util.Scanner;


public class FusioneArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of your first array: ");
        int len1 = sc.nextInt();
        int[] myArrayInteri1 = new int[len1];

        for(int i=0; i<myArrayInteri1.length; i++){
            System.out.print("Enter your element: ");
            int element = sc.nextInt();
            myArrayInteri1[i] = element;
        }

        System.out.print("Enter length of your second array: ");
        int len2 = sc.nextInt();
        int[] myArrayInteri2 = new int[len2];

        for(int i=0; i<myArrayInteri2.length; i++){
            System.out.print("Enter your element: ");
            int element = sc.nextInt();
            myArrayInteri2[i] = element;
        }

        int[] myArray3 = new int[len1+len2];
        for(int i=0;i<myArrayInteri1.length; i++){
                myArray3[i] = myArrayInteri1[i];
        }
        for(int j=myArrayInteri1.length; j!=myArray3.length; j++ ){
            myArray3[j] = myArrayInteri2[j];
        }
        

    }
}
