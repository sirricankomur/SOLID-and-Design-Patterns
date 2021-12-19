import java.util.ArrayList;

public class Mediator {
    private Teacher teacher;
    private ArrayList<Student> students;

    public void updateImage(String url) {
        for (var student : students) {
            student.receiveImage(url);
        }
    }

    public void sendQuestion(String question, Student student) {
        teacher.receiveQuestion(question, student);
    }

    public void sendAnswer(String answer, Student student) {
        student.receiveAnswer(answer);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
