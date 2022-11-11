// See https://aka.ms/new-console-template for more information
using System;
using System.Collections;
using System.Collections.Generic;

namespace BucketSort {
  class BucketSort {
    static void Main(string[] args) {
        float[] array = {(float)29, (float)25, (float)3, (float)49, (float)9, (float)37, (float)21, (float)43};
        int k = array.Length;
        bucketSort(array, k);

        Console.WriteLine("La lista ordianta è la seguente: ");
        foreach (float i in array) {
            Console.WriteLine(i + " ");
        } 
    }

    static void bucketSort(float[] array, int k){
        int M = 1 + (int)(array.Max());
        if(k <= 0){
            return;
        }
        List<float>[] buckets = new List<float>[k];

        //Creazione dei contenitori vuoti
        for(int i=0; i<k; i++){
            buckets[i] = new List<float>();
        }

        //Aggiunta elementi nei contenitori
        for(int i=0; i<k; i++){
            int indiceBucket = (int) array[i]*k/M;
            buckets[indiceBucket].Add(array[i]);
        }

        //Ordinamento elementi di ogni contenitore
        for(int i=0; i<k; i++){
            buckets[i].Sort();        }

        //Output array iniziale ordinato
        int indice = 0;
        for(int i=0; i<k; i++ ){
            for(int j=0; j<buckets[i].Count; j++){
                array[indice++] = buckets[i][j];
            }
        }
    }
  }
}
