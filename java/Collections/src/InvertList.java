import java.util.ArrayList;
/*Exercise 1.4.5
Progettare una classe `InvertList` con un campo di tipo `ArrayList<String>`.\
Nel costruttore della classe viene passata la lista da salvare nel campo.\
La classe espone un metodo `invert` che ritorna la lista invertita\
Ad esempio, data in input la lista `[ “Ciao”, ”come”, ”stai”, ”oggi” ]` il metodo ritorna `[ “oggi”, “stai”, “come”, “Ciao” ]`.*/
import java.util.Arrays;


public class InvertList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>((Arrays.asList("Ciao", "come", "stai", "oggi")));
        InvertList c = new InvertList(strings);
        c.invert();
        System.out.print(strings);
    }

    private ArrayList<String> myArrayList;

    public InvertList(ArrayList<String> myArrayList) {
        this.myArrayList = myArrayList;
    }
  
    public ArrayList<String> getMyArrayList() {
        return this.myArrayList;
    }

    public void setMyArrayList(ArrayList<String> myArrayList) {
        this.myArrayList = myArrayList;
    }

    public ArrayList<String> invert(){
        String[] strings = new String[this.myArrayList.size()];
        int index = 0;
        for(int i=this.myArrayList.size()-1; i>=0;i--){
            strings[index] = this.myArrayList.get(i);
            index++;
        }
        for(int j=0;j<strings.length;j++){
            this.myArrayList.set(j, strings[j]);
        }
        return myArrayList;
    }
    
}
