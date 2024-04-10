public class Student {
    private String nume;
    private Bursa bursa;

    public Bursa getBursa() {
        return bursa;
    }

    public void setBursa(Bursa bursa) {
        this.bursa = bursa;
    }

    public Student(String nume, int an, String cnp, String grupa, String nrtelefon, String email) {
        this.nume = nume;
        this.an = an;
        this.cnp = cnp;
        this.grupa = grupa;
        this.nrtelefon = nrtelefon;
        this.email = email;
    }

    private int an;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public String getNrtelefon() {
        return nrtelefon;
    }

    public void setNrtelefon(String nrtelefon) {
        this.nrtelefon = nrtelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String cnp;
    private String grupa;
    private String nrtelefon;
    private String email;

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", an=" + an +
                ", cnp='" + cnp + '\'' +
                ", grupa='" + grupa + '\'' +
                ", nrtelefon='" + nrtelefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}