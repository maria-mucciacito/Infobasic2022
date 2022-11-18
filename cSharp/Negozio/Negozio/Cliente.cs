public class Cliente{
    private int id;
    private int eta;
    public Cliente(int id, int eta) {
        this.id = id;
        this.eta = eta;
    }
    public int Id{
        get{ return id;}
    }
    public int Eta{
        get{ return eta;}
        set{ eta=value;}
    }
}