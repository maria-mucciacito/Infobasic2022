import java.util.ArrayList;
import java.util.Random;

public class Tombola {
    public static void main(String[] args) {
        estraiTombola();
    }

    public static void estraiTombola(){
        Random random = new Random();
        final int rowsMatrix = 3;
        final int colsMatrix = 5;
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer>  winners = new ArrayList<>();
        int ambo = 0;
        int terno = 0;
        int quaterna = 0;
        int cinquina = 0;
        for(int i=0; i<21; i++){
            winners.add(random.nextInt(100));
        }


        for(int i=0; i<rowsMatrix;i++){
            ArrayList<Integer> el = new ArrayList<>();
            matrix.add(el);
            for(int j=0;j<colsMatrix;j++){
                el.add(random.nextInt(100));


            }
        }
        System.out.println(matrix.toString());

        int contatore = 0;

        for(int i=0; i<matrix.size();i++){
            for(int j=0; j<matrix.get(i).size(); j++){
                if(winners.contains(matrix.get(i).get(j))){
                    contatore++;
                }
                switch(contatore){
                    case 2:
                        ambo++;
                        break;
                    case 3:
                        terno++;
                        break;
                    case 4:
                        quaterna++;
                        break;
                    case 5:
                        cinquina++;
                        break;
                }
                if(cinquina==rowsMatrix){
                    System.out.println("Hai vinto!");
                }
                
            }
        }
        System.out.println("Hai totalizzato ambo: "+ ambo + "\nterno: " + terno + "\nquaterno: " + quaterna);
    }


}
