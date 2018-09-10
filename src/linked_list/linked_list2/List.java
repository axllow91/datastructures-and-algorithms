package linked_list.linked_list2;

// This will implement the operation of the linked
// List is a super type because we instantiate linked list as a interface list
public interface List<T> {
    void insert(T data);
    void remove(T data);
    void traverseList();
    int size();
}
