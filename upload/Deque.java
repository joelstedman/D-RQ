
import java.util.Iterator;
import java.util.NoSuchElementException;

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
        if(this.count == 0) {
            return removeLastNode();
        }
        else {
            Node node = first;
            first = node.next;
            this.count--;
            return node.item;
        }

    }
    public Item removeLast()   {
        if(this.count==0) {
            return removeLastNode();
        }
        else {
            Node node = last;
            last = node.prev;
            this.count--;
            return node.item;
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
