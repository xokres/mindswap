package academy.mindswap;


import java.util.Iterator;

public class NodeContainer<T> implements Iterable<T> {

    private Node head;
    private int length;

    public NodeContainer() {
        head = new Node(null);
        length = 0;
    }

    public int size() {
        return length;
    }

    public void add(T data) {

        Node node = new Node(data);
        Node iterator = head;

        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }

        iterator.setNext(node);
        length++;
    }

    public int indexOf(T data) {

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

    public T get(int index) {
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

    public boolean remove(T data) {

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

    @Override
    public Iterator iterator() {
        return new Iterator<T>() {

            Node iterator = head;
            int index = 0;

            @Override
            public boolean hasNext() {
            //    return index < size();
                return iterator.getNext() != null;
            }

            @Override
            public T next() {
             //   return get(index++);


                iterator = iterator.getNext();
                return iterator.getData();
            }
        };
    }


    private class Node {

        private Node next;
        private T data;

        public Node(T data) {
            this.data = data;
            next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
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
