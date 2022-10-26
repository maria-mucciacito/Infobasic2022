public class Main{
    public static void main(String[] args) {

        //ESERCIZIO GESTORE VEICOLI
        /*Automobile automobile = new Automobile("cf123rm", 4, 4);
        Autocarro autoCarro = new Autocarro("ca133sm", 4, 2);

        //ESERCIZIO FORME GEOMETRICHE
        Quadrato quadrato = new Quadrato(5,5);
        Rettangolo rettangolo = new Rettangolo(5,6);

        //OUTPUT
        System.out.println(quadrato);
        System.out.println(rettangolo);
        System.out.println(quadrato.getArea());
        System.out.println(rettangolo.getPerimeter());
        System.out.println(automobile);
        System.out.println(autoCarro);*/

        //ESERCIZIO DISTRIBUTORE DI BEVANDE 
        Caffe caffe = new Caffe("caffe", 0.5);
        Cappuccino cappuccino = new Cappuccino("cappuccino", 1);
        DistributoreDiBevande distributoreDiBevande = new DistributoreDiBevande(10);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.getResto() == 0);
        distributoreDiBevande.inserisciImporto(0.4);
        //System.out.println(distributoreDiBevande.scegliProdotto("caffe") == null);
        distributoreDiBevande.inserisciImporto(0.2);
        //System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);
        //System.out.println(distributoreDiBevande.getResto()-0.10 < 1E-6);
        //System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        //System.out.println(distributoreDiBevande.scegliProdotto("caffe") == null);
        distributoreDiBevande.inserisciImporto(2.0);
        //System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);
        //System.out.println(distributoreDiBevande.scegliProdotto("cappuccino") != null);
        //System.out.println(distributoreDiBevande.scegliProdotto("caffe") != null);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        //System.out.println(distributoreDiBevande.getResto()-0.10 < 1E-6);
    }
}