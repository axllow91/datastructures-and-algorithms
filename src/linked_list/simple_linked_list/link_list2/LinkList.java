package linked_list.simple_linked_list.link_list2;

import linked_list.simple_linked_list.Link;

public class LinkList {
    private Link first; // ref to the first link on list

    public LinkList() {
        first = null;
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd); // create a new link
        newLink.next = first;  // it points to old first link
        first = newLink; // now first link points to this
    }

    public boolean isEmpty() {
        return (first == null);
    }

    // find link with given key
    public Link find(int key) throws IllegalStateException {
        if(isEmpty()) return null;  // if list empty return null

        Link current = first;  // start at 'first'
        while(current.iData != key) { // while no match,
            if(current.next == null) // if end of list didn't find it
                return null;
            else
                current = current.next;  // go to next link
        }
        return current;  // found it
    }

    public Link delete(int key) throws IllegalStateException {
        if(isEmpty()) return null;
        Link current = first;
        Link previous = first;
        while(current.iData != key) {
            if(current.next == null)
                return null;
            else {
                previous = current; // go to next link
                current = current.next;
            }
        }
        // if first link, change first otherwise bypass it
        if(current == first)

            first = first.next;
        else
            previous.next = current.next;
        return current;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; // start at the beginning of list
        while(current != null) { // until end of list
            current.displayLink();  // print data
            current = current.next; // move to next link
        }
        System.out.println();
    }
}
