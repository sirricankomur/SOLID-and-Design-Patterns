public class Teacher extends CourseMember {
    private String name;

    public Teacher(Mediator mediator) {
        super(mediator);
    }

    public void receiveQuestion(String question, Student student) {
        System.out.println("Öğretmen " + name + ", " + student.getName() + " isimli öğrenicinin \"" + question + "\" sorusunu aldı.");
    }

    public void sendNewImageUrl(String url) {
        System.out.println("Öğretmen " + name + ", " + url + " isimli yeni resim yükledi!");
        Mediator.updateImage(url);
    }

    public void answerQuestion(String answer, Student student) {
        System.out.println("Öğretmen " + name + ", " + student.getName() + " isimli öğrenicinin sorusuna cevabı: " + answer + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
