public class Prodotto {
    private int id;
    private String nome;
    private double prezzo;
    private TipoProdotto tipoProdotto;
    private String codeProdotto;


    public Prodotto(int id, String nome, double prezzo, TipoProdotto tipoProdotto, String codeProdotto) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.tipoProdotto = tipoProdotto;
        this.codeProdotto = codeProdotto;
    }


    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public TipoProdotto getTipoProdotto() {
        return this.tipoProdotto;
    }

    public void setTipoProdotto(TipoProdotto tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    public String getCodeProdotto() {
        return this.codeProdotto;
    }

    public void setCodeProdotto(String codeProdotto) {
        this.codeProdotto = codeProdotto;
    }

}
