public class Curs {
    private String denumire;
    private String zi;
    private String ora;
    private Grupa grupa;

    public Curs(String denumire, String zi, String ora, Grupa grupa) {
        this.denumire = denumire;
        this.zi = zi;
        this.ora = ora;
        this.grupa = grupa;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getZi() {
        return zi;
    }

    public void setZi(String zi) {
        this.zi = zi;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    @Override
    public String toString() {
        return "Curs{" +
                "denumire='" + denumire + '\'' +
                ", zi='" + zi + '\'' +
                ", ora='" + ora + '\'' +
                ", grupa=" + grupa +
                '}';
    }
}
