public class Profesor {
    private String nume;
    private String materie;
    private String email;
    private String nrtelefon;

    public Profesor(String nume, String materie, String email, String nrtelefon) {
        this.nume = nume;
        this.materie = materie;
        this.email = email;
        this.nrtelefon = nrtelefon;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNrtelefon() {
        return nrtelefon;
    }

    public void setNrtelefon(String nrtelefon) {
        this.nrtelefon = nrtelefon;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nume='" + nume + '\'' +
                ", materie='" + materie + '\'' +
                ", email='" + email + '\'' +
                ", nrtelefon='" + nrtelefon + '\'' +
                '}';
    }
}
