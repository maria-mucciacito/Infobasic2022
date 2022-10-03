public class NumeroPrimo {
   public static void main(String[] args) {
        int number = 0;
        System.out.println(isPrime(number));
        number = 1;
        System.out.println(isPrime(number));
        number = 2;
        System.out.println(isPrime(number));
        number = 17;
        System.out.println(isPrime(number));
        number = 631;
        System.out.println(isPrime(number));
        number = 634;
        System.out.println(!isPrime(number));
        number = 999;
        System.out.println(!isPrime(number));
        number = 997;
        System.out.println(isPrime(number));
    }
 
    private static boolean isPrime(int number) {
        boolean risultato = true;
        for (int i = number-1; i>=2; i--){
            if(number%i == 0){
                risultato = false;

            } else {
                risultato = true;
            }
        }
        return risultato;
    }
  
}
