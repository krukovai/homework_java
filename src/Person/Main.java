package Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Пётр", "Петрович", "Петров", 28);
        person1.printPerson();
        System.out.println("Год рождения: " + person1.getBirthYear());
    }
}
