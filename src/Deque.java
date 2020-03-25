
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.lang.IllegalArgumentException;
import java.lang.UnsupportedOperationException;

public class Deque<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int count = 0;

    private class Node {
        Item item;
        Node next;
        Node prev;
    }

    public Deque() { }

    public boolean isEmpty() {
        if(this.count==0) {
            return true;
        }
        return false;
    }

    public int size()   {
        return this.count;
    }

    public void addFirst(Item item)  {
        if(item == null) {
            throw new IllegalArgumentException();
        }
        if(this.count == 0) {
            createFirstNode(item);
        }
        else {
            Node node = new Node();
            node.item = item;
            node.next = first;
            first.prev = node;
            first = node;
            this.count++;
        }
    }

    public void addLast(Item item)  {
        if(item == null) {
            throw new IllegalArgumentException();
        }
        if(this.count == 0) {
            createFirstNode(item);
        }
        else {
            Node node = new Node();
            node.item = item;
            node.prev = last;
            last.next = node;
            last = node;
            this.count++;
        }
    }
    public Item removeFirst()  {
        if (isEmpty()) throw new NoSuchElementException();
        if(this.count == 0) {
            return removeLastNode();
        }
        else {
            Item item = first.item;
            first = first.next;
            this.count--;
            if(isEmpty()) {
                first = null;
            }
            return item;
        }
    }
    public Item removeLast()   {
        if (isEmpty()) throw new NoSuchElementException();
        if(this.count==0) {
            return removeLastNode();
        }
        else {
            Item item = last.item;
            last = last.prev;
            this.count--;
            if(isEmpty()) {
                last = null;
            }
            return item;
        }
    }

    public Iterator<Item> iterator()  {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() {return current != null;}
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private Item removeLastNode() {
        Item item = first.item;
        first = null;
        last = null;
        this.count--;
        return item;
    }

    private void createFirstNode(Item item) {
        Node node = new Node();
        node.item = item;
        this.first = node;
        this.last = node;
        this.count++;
    }
}
