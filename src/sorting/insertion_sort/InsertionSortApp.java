package sorting.insertion_sort;

public class InsertionSortApp {
    public static void main(String[] args) {
        int maxSize = 100; // array size

        ArrayInsertion arr; // reference to array
        arr = new ArrayInsertion(maxSize); // create the array

//        arr.insert(77); // insert 10 items
//        arr.insert(99);
//        arr.insert(44);
//        arr.insert(55);
//        arr.insert(22);
//        arr.insert(88);
//        arr.insert(11);
//        arr.insert(00);
//        arr.insert(66);
//        arr.insert(33);

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < maxSize; i++) {
            long n = (long) (Math.random() * (maxSize -1));
            arr.insert(n);
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Time spend: " + totalTime + " milliseconds");

        arr.display(); // display items
        arr.insertionSort(); // insertion-sort them
        arr.display();
    }
}
