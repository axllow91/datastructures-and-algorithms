package linked_list.linked_list2;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> rootNode;
    private int sizeOfList;

    @Override
    public void insert(T data) {
        ++sizeOfList;
        if (rootNode == null) {
            rootNode = new Node<>(data);
        } else {
            insertDataAtBeginning(data);
        }
    }

    // very efficient to insert items at the beginning - O(1) time complexity
    private void insertDataAtBeginning(T data) {
        // create new node with the give data
        Node<T> newNode = new Node<>(data);

        // make root node to be the next node  (ex: newNode -> rootNode -> NULL)
        newNode.setNextNode(rootNode);

        // rootNode becomes new Node
        // root node will become the new node
        // (ex: newNode -> rootNode -> NULL if new item is inserted newNode -> rootNode -> rootNode -> NULL)
        rootNode = newNode;
    }

    // very inefficient - time complexity O(N)
    private void insertDataAtEnd(T data, Node<T> node) {
        // we are not at the end of the list
        if (node.getNextNode() != null) {
            // insert recursively data to the next node
            insertDataAtEnd(data, node.getNextNode());
        } else {
            // this operation is very fast
            // we create a new node - with data set it
            // and then we set the next node to be the newly node created
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if (rootNode == null) return;

        --sizeOfList;

        // we ca use compareTo because we used Node<T extends Comparable<T> interface>
        // so we used generic type that extends comparable types
        if(rootNode.getData().compareTo(data) == 0) {
            rootNode = rootNode.getNextNode();
        } else {
            remove(data, rootNode, rootNode.getNextNode());
        }


    }

    // Remove data from list and update the previous and actual nodes
    private void remove(T dataToRemove, Node<T> previousNode, Node actualNode) {
        // actual node is not null
        while(actualNode != null) {
            // founded the element to remove
            if(actualNode.getData().compareTo(dataToRemove) == 0) {
                // update the pointer
                previousNode.setNextNode(actualNode.getNextNode());
                // make sure will be no obsolete references
                actualNode = null;
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    // in interation manner
    @Override
    public void traverseList() {
        if(rootNode == null) return;

        Node<T> actualNode = rootNode;

        // current node is not null
        while(actualNode != null) {
            System.out.print(actualNode + " -> ");
            // update the actual node by getting the next one
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return sizeOfList;
    }
}
