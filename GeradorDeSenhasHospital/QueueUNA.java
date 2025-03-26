public class QueueUNA<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int totalElements;

    public QueueUNA() {
        this.firstNode = null;
        this.lastNode = null;
        this.totalElements = 0;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (firstNode == null){
            firstNode = newNode;
            lastNode = newNode;
        }else {
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        totalElements ++;
    }

    public Node<T> dequeue() {
        if (firstNode == null) {
            return null;
        }
        Node<T> aux = firstNode;
        firstNode = firstNode.getNext();

        if (firstNode == null) {
            lastNode = null;
        }

        totalElements--;
        return aux;
    }

    public int size(){
        return this.totalElements;
    }

    public void toEmpty(){
        firstNode = null;
        lastNode = null;
        totalElements = 0;
    }

    public boolean verifyIfIsEmpty(){
        return totalElements == 0;
    }

    @Override
    public String toString() {
        if(this.totalElements == 0) {
            return "[ ]";
        }

        Node<T> currentNode = firstNode;
        StringBuilder builder = new StringBuilder("[");

        while (currentNode != null) {
            builder.append(currentNode.getValue());
            if (currentNode.getNext() != null) {
                builder.append(", ");
            }
            currentNode = currentNode.getNext();
        }

        builder.append("]");
        return  builder.toString();
    }
}