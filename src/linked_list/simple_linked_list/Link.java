package linked_list.simple_linked_list;

public class Link {
    public int iData;    // data item
    public double dData;  // data item

    public Link next;  // next link in list

    public Link(int id, double dd) {
        iData = id;
        dData = dd;
    }

    public void displayLink() {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}
