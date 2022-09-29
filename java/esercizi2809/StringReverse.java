import java.util.Scanner;
 
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        stringReverse(a);
    }
 
    static void stringReverse(String s) {
        char[] myArray = new char[s.length()];
        for (int i = 0; i <= (s.length()-1); i++) {
            myArray[i] = s.charAt(i);
            
        }
        String reverse = "";
        for (int n = myArray.length-1; n >= 0; n--){
            reverse += myArray[n];
        }
        System.out.println(reverse);
    }
}