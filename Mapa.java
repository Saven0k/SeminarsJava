

public class Mapa<K, V> {
    Node<K, V>[] nodes = new Node[16];


    public V put(K key, V value) {

        V result = null;
        Node<K, V> inputNode = new Node<>(key, value);
        Integer hash16 = inputNode.key.hashCode() % 16;
        if (nodes[hash16] != null) {
            Node<K, V> currentNode = nodes[hash16];
            while (currentNode != null) {
                if (currentNode.key == key) {
                    result = currentNode.value;
                    currentNode.value = value;
                    return result;
                }
                currentNode = currentNode.nextnode;
            }
            inputNode.nextnode = nodes[hash16];
        }
        nodes[hash16] = inputNode;
        return result;
    }

    public V get(K key) {
        Integer index = key.hashCode() % 16;
        Node<K, V> currentNode = nodes[index];
        while (currentNode != null) {
            if (currentNode.key == key) {
                return currentNode.value;
            }
            currentNode = currentNode.nextnode;
        }
        return null;
    }

    public V remove(K key) {
        Integer index = key.hashCode() % 16;
        Node<K, V> currentNode = nodes[index];
        if (currentNode != null) {
            while (currentNode.nextnode != null) {
                if (currentNode.nextnode.key == key) {
                    V result = currentNode.nextnode.value;
                    currentNode.nextnode = currentNode.nextnode.nextnode;
                    return result;
                }
                currentNode = currentNode.nextnode;
            }
        }
        return null;
    }

    public V replace(K key, V newValue){
        Integer index = key.hashCode() % 16;
        Node<K, V> currentNode = nodes[index];
        while (currentNode != null) {
            if (currentNode.key == key) {
                currentNode.value = newValue;
                return currentNode.value;
            }
            currentNode = currentNode.nextnode;
        }
        return null; 
    }

    public Integer size(K key){
        Integer index = key.hashCode() % 16;
        Node<K, V> currentNode = nodes[index];
        Integer result = 0;
        while (currentNode != null) {
            if (currentNode.key == key) {
                if(currentNode.value != null){
                    result = result + 1;
                }
            }
            currentNode = currentNode.nextnode;
        }
        return result;
    }

    public boolean containsKey(K key){
        Integer index = key.hashCode() % 16;
        Node<K, V> currentNode = nodes[index];
        while (currentNode != null) {
            if (currentNode.key == key) {
                return true;
            }
            currentNode = currentNode.nextnode;
        }
        return false;
    }

    public boolean containsValeu(V value){
        Integer index = key.hashCode() % 16;
        Node<K, V> currentNode = nodes[index];
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.nextnode;
        }
        return false;
    }
}   