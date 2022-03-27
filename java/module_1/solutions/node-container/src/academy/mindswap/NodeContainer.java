package academy.mindswap;

public class NodeContainer {

    private Node head;
    private int length;

    public NodeContainer() {
        head = new Node(null);
        length = 0;
    }

    public int size() {
        return length;
    }

    public void add(Object data) {
        Node node = new Node(data);
        Node iterator = head;

        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
         //   iterator.next = null;
        }

        iterator.setNext(node);
        length++;
    }

    public String sayHello(){

return "";
    }

    public int indexOf(Object data) {

        int index = 0;
        Node iterator = head.getNext();

        while (iterator != null) {

            if (iterator.getData().equals(data)) {
                return index;
            }

            iterator = iterator.getNext();
            index++;
        }

        return -1;
    }

    public Object get(int index) {

        if(index >= length || index < 0){
            return null;
        }

        Node iterator = head.getNext();

        while (iterator != null) {
            if (index == 0) {
                return iterator.getData();
            }

            iterator = iterator.getNext();
            index--;
        }

        return null;
    }

    public boolean remove(Object data) {

        Node previous = head;
        Node iterator = head.getNext();

        while (iterator != null) {

            if (iterator.getData().equals(data)) {
                previous.setNext(iterator.getNext());
                length--;
                return true;
            }

            previous = iterator;
            iterator = iterator.getNext();

        }

        return false;
    }

    private class Node {

        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
