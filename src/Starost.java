import java.time.LocalDate;

public class Starost extends Student {


    private String groupName;

    public Starost(String name, String surname) {
        super(name, surname);
    }

    public void postponeColloquium(LocalDate date){
        System.out.println("Nowa data kolokwium: " + date);
    }

    public void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
}
