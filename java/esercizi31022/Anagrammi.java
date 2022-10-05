import java.util.Scanner;
import java.util.Arrays;

public class Anagrammi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b =sc.nextLine();
        anagrams(a, b);
    }
 
    static void anagrams(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        a = a.replaceAll("\\s+", "");
        b = b.replaceAll("\\s+", "");
        String[] arrayA = a.split("");
        String[] arrayB = b.split("");
        boolean result = true;
        if(arrayA.length==arrayB.length){
            Arrays.sort(arrayA);
            Arrays.sort(arrayB);
            for(int i=0; i<arrayA.length;i++){
                if(!arrayA[i].equals(arrayB[i])){
                    result = false;
                }
            }
        }
        if(result==true){
            System.out.println("anagrammi");
        } else {
            System.out.println("non anagrammi");
        }
        
    }
}
