package sorting.sorting_objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayPerson() {
        System.out.print("    Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(" , Age: " + age);
    }

    public String getLast() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
