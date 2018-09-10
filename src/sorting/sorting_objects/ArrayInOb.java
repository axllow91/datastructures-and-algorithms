package sorting.sorting_objects;

public class ArrayInOb {
    private Person[] persons;
    private int nElem;

    public ArrayInOb(int max) {
        persons = new Person[max];
        nElem = 0;
    }

    // insert object (with param f, l, age)
    public void insert(String first, String last, int age) {
        persons[nElem] = new Person(first, last, age);
        nElem++;
    }

    public void display() {
        for(int i = 0; i < nElem; i++) {
            // display Person object(firstname, lastname, age)
            persons[i].displayPerson();
        }
        System.out.println();
    }

    // sort persons array
    public void insertionSort() {
        int in, out;

        for(out = 1; out < nElem; out++) {
            Person temp = persons[out];
            in = out;
            // until smaller one found
//            while(in > 0 && persons[in - 1].getLast().compareTo(temp.getLast()) > 0) { // by last name
            while(in > 0 && persons[in - 1].getAge() > temp.getAge()) { // compare by age
                persons[in] = persons[in - 1]; // shift to right person
                --in; // go left one position to find if the next person is sorted
            }
            persons[in] = temp;   // get temp person
        }
    }
}
