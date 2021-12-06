import java.util.ArrayList;
import java.util.List;

public class Employee implements IPerson {
    private String firstName;
    private String lastName;
    private String position;

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }
    private List<IPerson> subordinates = new ArrayList<IPerson>();

    @Override
    public void addSubordinate(IPerson person) {
        subordinates.add(person);
    }

    @Override
    public void removeSubordinate(IPerson person) {
        subordinates.remove(person);
    }

    @Override
    public IPerson getSubordinate(int index) {
        return subordinates.get(index);
    }

    @Override
    public List<IPerson> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return (firstName + " " + lastName + " " + position);
    }
}
