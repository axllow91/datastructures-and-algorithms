package array;

public class ArrayApp {
    public static void main(String[] args) {
        long[] arr;  // reference to array
        arr = new long[100]; // make array
        int nElements = 0; // number of elements
        int j;  // loop counter
        long searchKey; // key of item to search for

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 0;
        arr[7] = 66;
        arr[9] = 33;

        nElements = 10; // now 10 items in the array

        // display items
        for (j = 0; j < nElements; j++)
            System.out.print(arr[j] + " ");
        System.out.println();

        // find item with the value = 66
        searchKey = 20;
        for (j = 0; j < nElements; j++) {
            if (arr[j] == searchKey)
                break;
        }
        if (j == nElements)
            System.out.println("Can't find item: " + searchKey);
        else
            System.out.println("Found " + searchKey + " at: " + j);


        // delete item with key 55
        searchKey = 55;
        for (j = 0; j < nElements; j++) {
            if (arr[j] == searchKey) // found item
                break;              // found it!
        }

        // move higher ones down a position
        // move the higher position ones from the j position (where the deletion has had place until the last one)
        for (int k = j; k < nElements - 1; k++) {
            arr[k] = arr[k + 1];
        }
        nElements--;

        System.out.println("Array after item deletion:" + searchKey);
        for (j = 0; j < nElements; j++)
            System.out.print(arr[j] + " ");
        System.out.println();
    }
}
