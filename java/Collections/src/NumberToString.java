import java.util.Map;

/*Exercise 1.4.6
Progettare una classe`NumberToString`, con un campo `HashMap<Integer, String>`.\
Nel costruttore della classe (che non prende parametri in input), la mappa viene inizializzata e vengono inseriti i valori come segue:
- per i numeri da 1 a 10, viene associato ad a ogni intero la sua rappresentazione a stringa (in inglese).\
La mappa risultante sarà: `{1: “one”, 2: “two”, 3: “three”, 4: “four” ... , 10: “ten”}`*/



public class NumberToString {
    private Map<Integer,String> myHashMap;

    public NumberToString() {
        this.myHashMap.put(1, "zero");
        this.myHashMap.put(2, "one");
        this.myHashMap.put(3, "two");
        this.myHashMap.put(4, "three");
        this.myHashMap.put(5, "four");
        this.myHashMap.put(6, "five");
        this.myHashMap.put(7, "sex");
        this.myHashMap.put(8, "seven");
        this.myHashMap.put(9, "eight");
        this.myHashMap.put(10, "nine");

        
    }


    public Map<Integer,String> getMyHashMap() {
        return this.myHashMap;
    }

    public void setMyHashMap(Map<Integer,String> myHashMap) {
        this.myHashMap = myHashMap;
    }

}
