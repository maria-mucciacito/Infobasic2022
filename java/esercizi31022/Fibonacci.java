import java.util.Scanner;
 
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter index:");
        int index =sc.nextInt();
        fibonacci(index);
    }
 
    static void fibonacci(int index) {
        int[] arrayF = new int[index+1];
        arrayF[0] = 0;
        if(index!=0){
            arrayF[1] = 1;
            for(int i=2; i<=index; i++){
            arrayF[i] = arrayF[i-2]+ arrayF[i-1];
            } 
        }
        
        System.out.println(arrayF[index]);
    }
}