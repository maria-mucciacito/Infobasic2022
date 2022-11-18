import java.util.ArrayList;

/*Exercise 1.4.3
Progettare una classe `SubstituteElement` con un campo di tipo `ArrayList<Integer>`.\
Nel costruttore della classe viene passata la lista da salvare nel campo.\
La classe espone un metodo `substitute` che, dati in input due interi, sostituisce tutte le occorrenze del primo intero passato in input con il secondo e restituisce il numero di elementi sostituiti.\
Ad esempio, data la lista iniziale `[4, 7, 4, 26]`, dopo la chiamata al metodo `substitute` con valori 4 e 0, la lista sarà `[0, 7, 0, 26]` ed il valore di ritorno `2`.*/


public class SubstituteElement {

    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(4);
        myArrayList.add(7);
        myArrayList.add(4);
        myArrayList.add(26);
        SubstituteElement myClass = new SubstituteElement(myArrayList);
        System.out.print(myClass.substitute(4, 0));
        System.out.print(myArrayList);;

    }


    private ArrayList<Integer> myArrayList;

    public SubstituteElement(ArrayList<Integer> myArrayList) {
        this.myArrayList = myArrayList;
    }

    public ArrayList<Integer> getMyArrayList() {
        return this.myArrayList;
    }

    public void setMyArrayList(ArrayList<Integer> myArrayList) {
        this.myArrayList = myArrayList;
    }

    public int substitute(int n, int m){
        int count = 0; 
        for(int i=0;i<this.myArrayList.size();i++){
            if(this.myArrayList.get(i)==n){
                this.myArrayList.set(i, m);
                count++;
            }
        }
        return count;
    }
}
