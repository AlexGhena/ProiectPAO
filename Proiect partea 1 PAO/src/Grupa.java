import java.util.ArrayList;
import java.util.List;

public class Grupa {
    private int numarGrupa;
    private List<Student> studenti;
    private List<Bursa> burse;
    private List<Curs> cursuri;

    // Constructor
    public Grupa(int numarGrupa) {
        this.numarGrupa = numarGrupa;
        this.studenti = new ArrayList<>();
        this.burse = new ArrayList<>();
        this.cursuri = new ArrayList<>();
    }
    public void adaugaStudent(Student student) {
        studenti.add(student);
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public int getNumarGrupa() {
        return numarGrupa;
    }

    public void setNumarGrupa(int numarGrupa) {
        this.numarGrupa = numarGrupa;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    @Override
    public String toString() {
        return "Grupa{" +
                "numarGrupa='" + numarGrupa + '\'' +
                ", studenti=" + studenti +
                '}';
    }
    public void adaugabursa(Student student, String tipBursa, double suma) {
        Bursa bursa = new Bursa(tipBursa, suma);
        burse.add(bursa);
        student.setBursa(bursa);
    }
    public void stergebursa(Student student) {
        for (Student s : studenti) {
            if (s.equals(student) && s.getBursa() != null) {
                s.setBursa(null);
                break;
            }
        }
    }



    public void afiseazaburse() {
        for (Student student : studenti) {
            if (student.getBursa() != null) {
                System.out.println(student.getNume() + " " + student.getBursa());
            }
        }
    }
    public List<Curs> getCursuri() {
        return cursuri;
    }
    public void adaugaCurs(Curs curs) {
        cursuri.add(curs);
    }

}
