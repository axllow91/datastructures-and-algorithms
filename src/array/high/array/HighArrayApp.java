package array.high.array;

public class HighArrayApp {
    public static void main(String[] args) {

        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);
        arr.insert(10);
        arr.insert(33);

        // display items
        arr.display();

        // find item 35
        int searchKey = 35;
        if(arr.find(searchKey))
            System.out.println("Found item " + searchKey);
        else
            System.out.println("Can't find item " + searchKey);
        
        // delete items
        arr.delete(0);
        arr.delete(66);
        arr.delete(10);

        // display items again
        arr.display();

        arr.insert(100);
        arr.insert(101);

        // display again
        arr.display();

    }
}
