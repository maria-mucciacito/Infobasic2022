public class StringaPalindroma {
     public static void main(String[] args) {
        System.out.println(isPalindrome("c"));
        System.out.println(isPalindrome("ciic"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(!isPalindrome("absca"));
        System.out.println(!isPalindrome("abbaa"));
        System.out.println(isPalindrome("zzzzz"));
        System.out.println(isPalindrome("zzczz"));
        System.out.println(isPalindrome("aabbaa"));
    }
 
    private static boolean isPalindrome(String s) {
        Boolean palindromo = false; 
        char[] myArray = new char[s.length()];
        for (int i = 0; i <= (s.length()-1); i++) {
            myArray[i] = s.charAt(i);
            
        }
        String reverse = "";
        for (int n = myArray.length-1; n >= 0; n--){
            reverse += myArray[n];
        }
        if(s.equals(reverse)){
            palindromo = true;
        }
        return palindromo;
 
    }
} 
