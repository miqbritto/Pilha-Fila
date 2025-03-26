public class StackUNA<T> {
    // Hold the reference to the first node of this List.
    private Node<T> top;
    private int totalElements;

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(top);
        top = newNode;
        totalElements++;
    }

    public Node<T> pop() {
        Node<T> removedNode = top;
        top = top.getNext();
        totalElements--;
        return removedNode;

    }

    public int size(){
        return this.totalElements;
    }

    public void toEmpty(){
        totalElements = 0;
    }

    public boolean verifyIfIsEmpty(){

        if (totalElements == 0){
            return true;
        }else {
            return false;
        }
    }




    @Override
    public String toString() {
        if(this.totalElements == 0) {
            return "[ ]";
        }

        Node<T> currentNode = top;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalElements; i++) {
            builder.append(currentNode.getValue());
            builder.append(", ");

            currentNode = currentNode.getNext();

        }

        builder.append("]");

        return  builder.toString();
    }

    // Design the other list methods.
//    Insert at the end, in order, remove at the end,
//    remove elements by value, search an element.
}
