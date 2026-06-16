import java.util.List;
public class Ex_29_RecordsExample {
    record Person(String name, int age) {}
    public static void main(String[] args) {
        Person p1 = new Person("Riya", 21);
        Person p2 = new Person("Karan", 25);
        Person p3 = new Person("Alex", 18);
        System.out.println("Person Records:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        List<Person> persons = List.of(p1, p2, p3);
        System.out.println("\nPersons Age > 20:");
        persons.stream().filter(person -> person.age() > 20).forEach(System.out::println);
    }
}