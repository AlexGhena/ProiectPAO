public class Bursa {
    private String tipBursa;
    private double suma;

    public Bursa(String tipBursa, double suma) {
        this.tipBursa = tipBursa;
        this.suma = suma;
    }


    public String getTipBursa() {
        return tipBursa;
    }

    public void setTipBursa(String tipBursa) {
        this.tipBursa = tipBursa;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "Bursa{" +
                "tipBursa='" + tipBursa + '\'' +
                ", suma=" + suma +
                '}';
    }


}
