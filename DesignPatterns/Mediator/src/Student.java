public class Student extends CourseMember {
    private String name;

    public Student(Mediator mediator) {
        super(mediator);
    }

    public void receiveImage(String url) {
        System.out.println(name + " öğrencisine " + url + " resmi ulaştı.");
    }

    public void receiveAnswer(String answer) {
        System.out.println(name + " öğrencisine \"" + answer + "\" yanıtı ulaştı.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
