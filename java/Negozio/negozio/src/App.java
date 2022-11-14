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
        listProdotti.add(piatto3);
        listProdotti.add(piatto3);
        




        Negozio negozio = new Negozio();
    }
}
