import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Crearea unui student nou
        Student student1 = new Student("John Doe", 2, "1234567890123", "241", "0712345678", "john.doe@example.com");

        Student student2 = new Student("Student 2", 2, "1234567890123", "241", "0712345678", "john.doe@example.com");

        Student student3 = new Student("Student 3", 2, "1234567890123", "241", "0712345678", "john.doe@example.com");

        // Crearea unei noi grupe
        Grupa grupa241 = new Grupa(241);

        grupa241.adaugaStudent(student1);

        grupa241.adaugabursa(student1, "sociala", 3000);

        grupa241.afiseazaburse();

        grupa241.stergebursa(student1);
        grupa241.afiseazaburse();

        BursaPerformanta bursaPerformanta = new BursaPerformanta("sociala", 3000, "performanta", 6);
        student1.setBursa(bursaPerformanta);
        grupa241.adaugaStudent(student2);
        grupa241.adaugabursa(student2, "sociala", 3000);
        grupa241.afiseazaburse();

        StudentErasmus studentErasmus = new StudentErasmus("Student 3", 2, "1234567890123", "241", "0712345678", "student3@example.com", 2024, 2025, "Spania");
        List<StudentErasmus> studentiErasmus = new ArrayList<>();
        studentiErasmus.add(studentErasmus);

        StudentErasmus.afiseazastudentiErasmus(studentiErasmus);

        grupa241.adaugaCurs(new Curs("Matematica", "Luni", "10:00", grupa241));
        grupa241.adaugaCurs(new Curs("Informatica", "Miercuri", "14:00", grupa241));
        grupa241.adaugaCurs(new Curs("Fizica", "Vineri", "08:00", grupa241));

        List<Curs> cursuriGrupa241 = grupa241.getCursuri();
        System.out.println("Cursurile pentru grupa 241:");
        for (Curs curs : cursuriGrupa241) {
            System.out.println(curs);
        }
        Profesor profesor1 = new Profesor("Prof 1", "Matematica", "mail@example.com", "0712345678");
        Profesor profesor2 = new Profesor("Prof 2", "Informatica", "mail2@example.com","078765432");




    }
}
