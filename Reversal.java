public class Reversal<E>{
    private Node<E> head;

    public void Revers(E values){
        Node previous = null;
        for (E value : values){
            Node node = new Node();
            node.setValue(value);
            if(previous != null){
                previous.setNext(node);
            }  else{
                head = node;
            }
            previous = node;

        }
    }

    public Reversal<E> rev(){
        Node node = head;
        Node previous = null;

        while(node != null){
            Node tmp = node.getNext();

            node.setNext(previous);
            previous = node;
            node = tmp;
        }
        return this;
    } 
}
