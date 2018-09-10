package linked_list.simple_linked_list;

public class LinkList {
    private Link first;  // ref to the first link on the list

    public LinkList() {
        first = null;  // no items on the list yet
    }

    public boolean isEmpty() {
        return (first == null);
    }

    // insert at the start
    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd); // make new link
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }

    // delete first item
    // check if list is not empty
    public Link deleteFirst() throws IllegalStateException {
        if(isEmpty()) return null;
        Link temp = first;  // save reference to link
        first = first.next; // delete it: first --> old next
        return temp;  // return deleted link
    }

    public void displayList() {
        System.out.print("List (first--> last): ");
        Link current = first;  // start at beginning of list

        // if you are not at the end of list
        while(current != null) {
            current.displayLink();   // print data
            current = current.next;  // move to next link
        }
        System.out.println();
    }
}
