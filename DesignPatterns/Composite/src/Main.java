public class Main {

    public static void main(String[] args) {
        Employee CEO = new Employee("Sırrı", "KÖMÜR", "CEO");
        Employee generalDirector = new Employee("Can", "KÖMÜR", "Genel Müdür");

        Employee HR = new Employee("Yeşim", "NUR", "İnsan Kaynakları");
        Employee IS = new Employee("Sergen", "YAŞAM", "Bilişim Sistemleri");

        Employee HREmployee = new Employee("Sevgi", "GÜVEN", "İnsan Kaynakları Çalışanı");
        Employee ISEmployee = new Employee("Hayati", "BURÇ", "Bilişim Sistemleri Çalışanı");


        CEO.addSubordinate(generalDirector);
        generalDirector.addSubordinate(HR);
        generalDirector.addSubordinate(IS);
        HR.addSubordinate(HREmployee);
        IS.addSubordinate(ISEmployee);

        System.out.println(CEO);
        for (IPerson headEmployee : CEO.getSubordinates()) {
            System.out.println("  " + headEmployee);

            for (IPerson employee : headEmployee.getSubordinates()) {
                System.out.println("    " + employee);

                for (IPerson subEmployee : employee.getSubordinates()) {
                    System.out.println("       " + subEmployee);
                }
            }
        }
    }
}
