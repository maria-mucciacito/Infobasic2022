public class FormaGeometrica {
    private int lato1;
    private int lato2;
    private String forma;


    public FormaGeometrica(int lato1,int lato2){
        this.lato1 = lato1;
        this.lato2 = lato2;
        if(lato1==lato2){
            this.forma = "Quadrato";
        } else {
            this.forma = "Rettangolo";
        }

    }
    
    // toString
    @Override
    public String toString() {
        return "Forma Geometrica {" +
                "forma: " + getForma() +
                ", lato1: " + getLato1() +
                ", lato2: " + getLato2() +
                '}';
    }

    public int getLato1() {
        return lato1;
    }

    public void setLato1(int lato1) {
        this.lato1 = lato1;
    }
        
    public int getLato2() {
        return lato2;
    }

    public void setLato2(int lato2) {
        this.lato2 = lato2;
    }

    public String getForma() {
        return forma;
    }  

    public double getArea(){
        double area = lato1*lato2;
        return area;
    }

    public double getPerimeter(){
        double perimeter = (lato1+lato2)*2;
        return perimeter;
    }
}
