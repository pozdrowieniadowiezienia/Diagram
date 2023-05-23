import java.time.LocalDate;

public class Student {

    private String name;
    private String surname;
    private LocalDate birthdate;
    private int sciencePoints;
    private int lifePoints;

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void learn(LocalDate from, LocalDate to){
        System.out.println("Uczyles sie od " + from + " do " + to);
    }

    public void party(LocalDate from, LocalDate to){
        System.out.println("Imprezowales od " + from + " do " + to);
    }

    public boolean isGoodStudent(){
        return lifePoints > 100 && sciencePoints < 30;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getSciencePoints() {
        return sciencePoints;
    }

    public void setSciencePoints(int sciencePoints) {
        this.sciencePoints = sciencePoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}
