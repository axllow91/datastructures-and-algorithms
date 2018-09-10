package linked_list.simple_linked_list.link_list2;

import linked_list.simple_linked_list.Link;

public class LinkListApp2 {
    public static void main(String[] args) {
        LinkList theList = new LinkList();  // make list

        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.displayList();

        Link f = theList.find(44); // find item
        if(f!= null)
            System.out.println("Found link with key " + f.iData);
        else
            System.out.println("Can't find the link");

        Link d = theList.delete(44);
        if(d != null)
            System.out.println("Deleted link with key " + d.iData);
        else
            System.out.println("Can't delete link");

        theList.displayList();
    }
}
