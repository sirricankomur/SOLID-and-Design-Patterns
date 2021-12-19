import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Teacher teacherSirri = new Teacher(mediator);
        teacherSirri.setName("Sırrı");

        mediator.setTeacher(teacherSirri);

        Student studentVeli = new Student(mediator);
        studentVeli.setName("Veli");


        Student studentFatma = new Student(mediator);
        studentFatma.setName("Fatma");

        ArrayList<Student> students = new ArrayList<>();
        students.add(studentVeli);
        students.add(studentFatma);

        mediator.setStudents(students);

        teacherSirri.sendNewImageUrl("Tasarım Desenleri.jpg");
        teacherSirri.receiveQuestion("Hangi tasarım deseni?", studentFatma);

    }
}
