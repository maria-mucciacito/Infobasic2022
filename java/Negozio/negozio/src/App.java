import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Prodotto bicchiere1 = new Prodotto(1, "bicchiere", 1, TipoProdotto.NON_ALIMENTARE, "A1");
        Prodotto bicchiere2 = new Prodotto(2, "bicchiere", 1, TipoProdotto.NON_ALIMENTARE, "A1");
        Prodotto bicchiere3 = new Prodotto(3, "bicchiere", 1, TipoProdotto.NON_ALIMENTARE, "A1");
        Prodotto bicchiere4 = new Prodotto(4, "bicchiere", 1, TipoProdotto.NON_ALIMENTARE, "A1");
        Prodotto piatto1 = new Prodotto(5, "piatto", 4, TipoProdotto.NON_ALIMENTARE, "A2");
        Prodotto piatto4 = new Prodotto(8, "piatto", 4, TipoProdotto.NON_ALIMENTARE, "A2");
        Prodotto piatto2 = new Prodotto(6, "piatto", 4, TipoProdotto.NON_ALIMENTARE, "A2");
        Prodotto piatto3 = new Prodotto(7, "piatto", 4, TipoProdotto.NON_ALIMENTARE, "A2");
        List<Prodotto> listProdotti = new ArrayList<>();
        listProdotti.add(piatto3);
        listProdotti.add(piatto2);
        listProdotti.add(piatto4);
        listProdotti.add(piatto1);
        listProdotti.add(bicchiere1);
        listProdotti.add(bicchiere2);
        listProdotti.add(bicchiere3);
        listProdotti.add(bicchiere4);
        Negozio negozio = new Negozio(listProdotti);
        System.out.println(negozio.getQuantitaAttuale());
        Prodotto piatto6 = new Prodotto(96, "piatto", 4, TipoProdotto.NON_ALIMENTARE, "A2");
        Prodotto piatto8 = new Prodotto(23, "piatto", 4, TipoProdotto.NON_ALIMENTARE, "A2");
        Prodotto bicchiere6 = new Prodotto(10, "bicchiere", 1, TipoProdotto.NON_ALIMENTARE, "A1");
        negozio.aggiungiProdotto(piatto8);
        negozio.aggiungiProdotto(piatto6);
        System.out.println(negozio.getQuantitaAttuale());
        negozio.aggiungiProdotto(bicchiere6);
        System.out.println(negozio.getListaProdotti());
        System.out.println(negozio.rimuoviProdottoById(piatto8));
        System.out.println(negozio.getListaProdotti());
        System.out.println(negozio.ottieniQuantitaResidua(bicchiere1));
        List<Prodotto> listProdottiDaAcquistare = new ArrayList<>();
        listProdottiDaAcquistare.add(bicchiere1);
        listProdottiDaAcquistare.add(bicchiere2);
        negozio.acquistaProdotti(listProdottiDaAcquistare);
        System.out.println(negozio.getListaProdotti());
    }
}
