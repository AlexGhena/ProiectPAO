public class BursaPerformanta  extends Bursa{
    private String tip;
    private int durata; // durata in luni

    public BursaPerformanta(String tipBursa, double suma, String tip, int durata) {
        super(tipBursa, suma);
        this.tip = tip;
        this.durata = durata;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "BursaPerformanta{" +
                "tip='" + tip + '\'' +
                ", durata=" + durata +
                '}';
    }
}
