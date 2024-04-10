public class Departament extends Profesor {
    private String departament;

    public Departament(String nume, String materie, String email, String nrtelefon, String departament) {
        super(nume, materie, email, nrtelefon);
        this.departament = departament;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "nume='" + getNume() + '\'' +
                ", materie='" + getMaterie() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", nrtelefon='" + getNrtelefon() + '\'' +
                ", departament='" + departament + '\'' +
                '}';
    }
}
