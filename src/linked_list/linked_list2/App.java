package linked_list.linked_list2;

public class App {
    public static void main(String[] args) {
        // Is good to use linked list because we can use
        // generic types : custom objects, string, int so on

        List<Integer> linkedList = new LinkedList<>();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);

        linkedList.remove(40);

        System.out.println(linkedList.size());

        linkedList.traverseList();

        List<Person> personList = new LinkedList<>();

        Person p = new Person("Mitica", 62);

        personList.insert(p);

        personList.insert(new Person("Giuca", 22));
        personList.insert(new Person("Suka", 10));
        personList.insert(new Person("Liulica", 13));
        personList.insert(new Person("Futica", 99));

        personList.remove(p);

        System.out.println(personList.size());

        personList.traverseList();



    }
}
