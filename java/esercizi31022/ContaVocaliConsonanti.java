import java.util.Scanner;

public class ContaVocaliConsonanti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String frase = sc.nextLine();
        contatore(frase);
        sc.close();
    }

    public static void contatore(String frase) {
        int contatoreConsonanti = 0;
        int contatoreVocali = 0;
        frase = frase.toLowerCase();
        frase = frase.replaceAll("\\s+", "");
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)=='a' || frase.charAt(i)=='e' 
            || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u'){
                contatoreVocali++;
            } else{
                contatoreConsonanti++;
            }
        }
        System.out.println("Il numero di consonanti presenti è: " + contatoreConsonanti);
        System.out.println("Il numero di vocali presenti è: " + contatoreVocali);

    }
}
