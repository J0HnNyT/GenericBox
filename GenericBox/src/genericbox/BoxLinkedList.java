
package genericbox;

public class BoxLinkedList<T> {
    
    private Node<T> head;
    
    //empty list constructor.
    public BoxLinkedList(){head = null;}
    
    //boolean is list Empty
    public boolean isEmpty(){return head == null;}
    
    //public get first
    public void addFirst(){}
    
    //T get first
    public T getFirst(){}
    
    //T remove first
    public T removeFirst(){}
    
    //add void last
    public void addLast(){}
    
    //T getLast
    
    //void clear
    
    //? contains (T t)
    
    //T getPosition (int position)
    
    // String toString()
    
    //reverse
    public BoxLinkedList<T> reverse(){
        
        BoxLinkedList<T> boxReverse = new BoxLinkedList<>();
        Node<T> temp = head;
        
        while(temp != null){
            boxReverse.addFirst(temp.dataNode);
            temp = temp.nextNode;
        }
        
        return boxReverse;
    }
    
    
    //The Node inner class self referential.
    private static class Node<T>{
    
    private T dataNode;
    private Node<T> nextNode;
    
    public Node(T data, Node<T> next){
        this.dataNode = data;
        this.nextNode = next;
    }

    public T getNode() {
        return Node;
    }

    public void setNode(T Node) {
        this.Node = Node;
    }

    public T getNextNode() {
        return nextNode;
    }

    public void setNextNode(T nextNode) {
        this.nextNode = nextNode;
    }
    
    }//End Node class.
    
}//End BoxLinkedList class.
