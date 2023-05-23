import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.addStudent("Andrzej", "Tatowski");
        Student student = university.getStudent("Andrzej", "Tatowski");
        student.learn(LocalDate.now(), LocalDate.now());
        student.party(LocalDate.now(), LocalDate.now());
        System.out.printf("%s %s jest %s studentem", student.getName(), student.getSurname(),  (student.isGoodStudent() ? "dobrym" : "złym"));
        System.out.println();
        Starost starost = new Starost("ok", "okk");
        starost.setGroupName("ok");
        starost.postponeColloquium(LocalDate.now());
    }
}