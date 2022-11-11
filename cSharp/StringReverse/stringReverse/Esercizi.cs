using System;
using System.Collections.Generic;
using System.Linq;

public class Esercizi{

    public static void MulOddNumbers(){
        int[] numbers = new int[] {55, 65, 43, 97, 5, 10, 78};
        int[] numbersCopy = new int[numbers.Length];

        for(int i=0; i<numbers.Length; i++){
            if((numbers[i]%2)==0){
                numbersCopy[i] = numbers[i];
                Console.WriteLine(numbersCopy[i] + " ");
            } else{
                numbersCopy[i] = numbers[i]*2;
                Console.WriteLine(numbersCopy[i] + " ");
            }
        }
    }

    public static void Tombola(){
        var random = new Random();
        const int bMatrix = 5;
        const int hMatrix = 3;
        List<List<int>> matrix = new List<List<int>>();
        int ambo = 0;
        int terno = 0;
        int quaterna = 0;
        int cinquina = 0;

        List<int> myArr = new List<int>();

        //creo numeri vincenti
        List<int> extractedNumbers = new List<int>();
        for (int i = 0; i < 21; i++)
        {
            extractedNumbers.Add(random.Next(100));
            //extractedNumbers.Add(1);

        } 

        //rows
        for (int i = 0; i < hMatrix; i++)
        {
            List<int> el = new List<int>();
            matrix.Add(el);
            //columns :D
            for (int j = 0; j < bMatrix; j++)
            {
                el.Add(random.Next(100));
            }
        }

        for (int i = 0; i < matrix.Count; i++)
        {
            int contatore = 0;
            for (int j = 0; j < matrix.ElementAt(i).Count; j++)
            {
                if (extractedNumbers.Contains(matrix.ElementAt(i).ElementAt(j)))
                {
                    contatore++;
                }


                switch (contatore)
                {
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
                    default:
                        break;
                }
                if (cinquina == hMatrix)
                {
                    Console.WriteLine("CONGRATULAZIONI!!! HAI VINTO");
                }
            }

        }
        Console.WriteLine("hai totalizzato ambo:" + ambo + "\nterno: " + terno + "\nquaterno " + quaterna + "\ncinquina " + cinquina);

    }
}