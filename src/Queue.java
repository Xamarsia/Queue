import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<E> implements QueueInterface<E> {

    private Node<E> firstNode = null;
    private Node<E> lastNode = null;
    private int size = 0;

    static class Node<E> {
        private Node<E> previousNode;
        private E value;
        private Node<E> nextNode;

        public Node(E value) {
            this.previousNode = null;
            this.value = value;
            this.nextNode = null;
        }

        public Node(Node<E> previousNode, E value, Node<E> nextNode) {
            this.previousNode = previousNode;
            this.value = value;
            this.nextNode = nextNode;
        }

        public Node<E> getPrevious() {
            return previousNode;
        }

        public E getValue() {
            return value;
        }

        public Node<E> getNext() {
            return nextNode;
        }

        public void setPrevious(Node<E> previous) {
            previousNode = previous;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public void setNext(Node<E> next) {
            nextNode = next;
        }
    }

    public static class QueueIterator<E> implements Iterator<E> {
        Node<E> currentNode;

        public QueueIterator(Queue<E> list) {
            currentNode = list.firstNode;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            E value = currentNode.getValue();
            currentNode = currentNode.getNext();
            return value;
        }
    }

    @Override
    public boolean contains(E value) {
        for (E currentValue : this) {
            if (currentValue == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E peek() {
        return firstNode.getValue();
    }

    @Override
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        } else {
            return peek();
        }
    }

    @Override
    public void add(E e) {
        if (isEmpty()) {
            Node<E> node = new Node<>(e);
            firstNode = node;
            lastNode = node;
        } else {
            Node<E> node = new Node<>(lastNode, e, null);
            lastNode.setNext(node);
            lastNode = node;
        }
        ++size;
    }


    @Override
    public E remove() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }

        E result = peek();
        removeFirst();
        return result;
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }

        E result = peek();
        removeFirst();
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return new QueueIterator<>(this);
    }

    private void removeFirst() {
        if (isEmpty()) {
            return;
        } else if (size == 1) {
            firstNode = null;
            lastNode = null;
        } else {
            firstNode = firstNode.getNext();
            firstNode.setPrevious(null);
        }
        --size;
    }
}
