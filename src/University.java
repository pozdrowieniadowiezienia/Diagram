import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, String surname){
        students.add(new Student(name, surname));
    }

    public Student getStudent(String name, String surname){
        for (Student student : students) {
            if(student.getName().equalsIgnoreCase(name) && student.getSurname().equalsIgnoreCase(surname)){
                return student;
            }
        }
        return null;
    }

    public boolean removeStudent(String name, String surname){
        for (Student student : students) {
            if(student.getName().equalsIgnoreCase(name) && student.getSurname().equalsIgnoreCase(surname)){
                return students.remove(student);
            }
        }
        return false;
    }

}
