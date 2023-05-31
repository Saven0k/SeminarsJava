

public class Node <E> {
    E value;
    Node<E> nextNode;
    Node<E> previousNode;

    public void setNext(Node nextNode){
        this.nextNode = nextNode;
    }

    public void setValue(E value){
        this.value = value;
    }

    public E getValue(){
        return value;
    }

    public Node getNext(){
        return nextNode;
    }
}
