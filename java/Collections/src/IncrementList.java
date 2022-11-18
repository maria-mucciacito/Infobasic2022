import java.util.ArrayList;
import java.util.Scanner; 
/*Exercise 1.4.2
Progettare una classe `IncrementList` con un campo di tipo `ArrayList<Integer>`.\
Nel costruttore della classe viene passata la lista da salvare nel campo.\
La classe espone un metodo `increment` che, preso in input un intero, incrementa tutti i valori della lista di quell’intero.\
Ad esempio, data la lista iniziale `[1, 4, 6]`, dopo la chiamata al metodo `increment` con valore 5, la lista sarà `[6, 9, 11]`.*/


public class IncrementList {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(4);
        myArrayList.add(6);
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        IncrementList incrementList = new IncrementList(myArrayList);
        incrementList.increment(n);
        System.out.print(incrementList.getMyArrayList()); 
    }

    private ArrayList<Integer> myArrayList;

    public IncrementList(ArrayList<Integer> myArrayList) {
        this.myArrayList = myArrayList;
    }

    public ArrayList<Integer> getMyArrayList() {
        return this.myArrayList;
    }

    public void setMyArrayList(ArrayList<Integer> myArrayList) {
        this.myArrayList = myArrayList;
    }

    public void increment(int n){
        int i = 0;
        for (Integer myNumber : this.myArrayList){
            myNumber += n;
            this.myArrayList.set(i, myNumber); 
            i++;
        }
    }


}
