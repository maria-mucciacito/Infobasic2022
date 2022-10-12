public class Quadrato {

   public static void main(String[] args) {
      Quadrato q = new Quadrato(6);
      System.out.println(q.getPerimetro());
      q.print();
   }


   private int lenLato;

   public Quadrato(int lenLato){
      this.lenLato = lenLato;
   }

   public int getLenLato(){
      return lenLato;
   }

   public void setLenLato(int lenLato){
      this.lenLato = lenLato;
   }

   public int getPerimetro(){
      return lenLato*4;
   }

   public void print(){
      for(int i=0;i<lenLato;i++){
         for(int j=0;j<lenLato;j++){
            System.out.print("*");
         }
         System.out.println("\n");
         
      }
   }
}
