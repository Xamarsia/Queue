import java.util.Iterator;
import java.util.NoSuchElementException;

public interface QueueInterface<E> extends Iterable<E> {

    public boolean contains(E value);

    public Boolean isEmpty();

    public void add(E e);

    public E peek();

    public E element() throws NoSuchElementException;

    public E remove() throws NoSuchElementException;

    public E poll();

    public int size();

    @Override
    public Iterator<E> iterator();
}


