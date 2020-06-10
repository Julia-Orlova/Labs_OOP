package lab7;

import lab6.Song;

import java.util.*;

//двозв*язний список
public class MyList implements List<Song> {
    //*створюємо приватні поля
    private Node head;
    private Node tail;
    private int size = 0;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Song> iterator() {
        return new Iterator<Song>() {
            private Node currentNode = head;
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public Song next() {
                Node result = currentNode;
                if (currentNode != null) {
                    currentNode = currentNode.getNext();
                } else {
                    throw new NoSuchElementException();
                }
                return result.getData();
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Song song) {
        Node node = new Node();
        node.setData(song);
        if (head == null) {
            head = node;
            tail = node;
        } /*else {
            tail.setNext(node);
            tail = node;
        }*/
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Song> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Song> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Song get(int index) {
        return null;
    }

    @Override
    public Song set(int index, Song element) {
        return null;
    }

    @Override
    public void add(int index, Song element) {

    }

    @Override
    public Song remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Song> listIterator() {
        return new ListIterator<Song>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Song next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Song previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(Song song) {

            }

            @Override
            public void add(Song song) {

            }
        };
    }

    @Override
    public ListIterator<Song> listIterator(int index) {
        return null;
    }

    @Override
    public List<Song> subList(int fromIndex, int toIndex) {
        return null;
    }
}
