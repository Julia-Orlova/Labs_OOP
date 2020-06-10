package lab7;

import lab6.Song;

public class Node {
    private Node next;
    private Node previous;
    private Song data;


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Song getData() {
        return data;
    }

    public void setData(Song data) {
        this.data = data;
    }
}
