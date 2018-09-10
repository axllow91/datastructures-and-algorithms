package array.array;

// Not convenient
// You can't see too much difference between setElement() and []
public class LowClassApp {
    public static void main(String[] args) {
        LowArray arr;
        arr = new LowArray(100);
        int nElements = 0;
        int j = 0;

        arr.setElement(0, 77); // insert 10 items
        arr.setElement(1, 99);
        arr.setElement(2, 44);
        arr.setElement(3, 55);
        arr.setElement(4, 22);
        arr.setElement(5, 88);
        arr.setElement(6, 11);
        arr.setElement(7, 0);
        arr.setElement(8, 66);
        arr.setElement(9, 33);

        nElements = 10;

        // display items
        for(; j < nElements; j++)
            System.out.print(arr.getElement(j) + " ");
        System.out.println();

        // search for element
        int searchKey = 11;
        for(j = 0; j < nElements; j++) {
            if(arr.getElement(j) == searchKey)
                break;
        }

        if(j == nElements)
            System.out.println("Can't find item: " + searchKey);
        else
            System.out.println("Found " + searchKey + " at: " + j);

        // delete item
        searchKey = 55;
        for(j = 0; j < nElements; j++)
            if(arr.getElement(j) == searchKey)
                break;

        // move higher positioned items to a -1 lower position
        //
        for(int k = j; k < nElements; k++)
            arr.setElement(k, arr.getElement(k + 1));
        nElements--;                        // decrement size


        // display items
        System.out.println("Elements after deletion of: " + searchKey);
        for(j = 0; j < nElements; j ++)
            System.out.print(arr.getElement(j) + " ");
        System.out.println();
    }
}
