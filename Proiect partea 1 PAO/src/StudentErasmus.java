import java.util.ArrayList;
import java.util.List;

public class StudentErasmus extends Student {
    private int anPlecare;
    private int anRevenire;
    private String tara;

    public StudentErasmus(String nume, int an, String cnp, String grupa, String nrtelefon, String email, int anPlecare, int anRevenire, String tara) {
        super(nume, an, cnp, grupa, nrtelefon, email);
        this.anPlecare = anPlecare;
        this.anRevenire = anRevenire;
        this.tara = tara;
    }

    public int getAnPlecare() {
        return anPlecare;
    }

    public void setAnPlecare(int anPlecare) {
        this.anPlecare = anPlecare;
    }

    public int getAnRevenire() {
        return anRevenire;
    }

    public void setAnRevenire(int anRevenire) {
        this.anRevenire = anRevenire;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    @Override
    public String toString() {
        return super.toString() +
                "StudentErasmus{" +
                "anPlecare=" + anPlecare +
                ", anRevenire=" + anRevenire +
                ", tara='" + tara + '\'' +
                '}';
    }

    public static void afiseazastudentiErasmus(List<StudentErasmus> studentiErasmus) {
        for (StudentErasmus student : studentiErasmus) {
            System.out.println(student);
        }
    }
}
