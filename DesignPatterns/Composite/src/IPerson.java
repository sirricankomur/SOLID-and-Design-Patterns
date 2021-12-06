import java.util.List;

public interface IPerson {
     void addSubordinate(IPerson person);

    void removeSubordinate(IPerson person);

    IPerson getSubordinate(int index);

    List<IPerson> getSubordinates();
}
