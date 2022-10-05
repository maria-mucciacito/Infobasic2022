import java.util.Arrays;

public class DispariAPari {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        dispariPerDue(array1);
    }

    public static void dispariPerDue(int[] array1) {
        int[] array2 = Arrays.copyOf(array1, array1.length);
        for(int i=0; i<array2.length; i++){
            if(array2[i]%2==1){
                array2[i] = array2[i]*2;
            }
        }
  
        System.out.println(Arrays.toString(array2)); 
    }
}
