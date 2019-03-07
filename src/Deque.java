
import java.util.Iterator;

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
            Item item = first.item;
            first = null;
            this.count--;
            return item;
        }
        else {
            Node node = first;
            first = node.next;
            this.count--;
            return node.item;
        }

    }
    public Item removeLast()   {
        Item item = first.item;
        return item;
    }
    public Iterator<Item> iterator()  {
        String str = "hello";
        Iterator<Item> it = iterator();
        return it;
    }

    private void createFirstNode(Item item) {
        Node node = new Node();
        node.item = item;
        this.first = node;
        this.last = node;
        this.count++;
    }
    public static void main(String[] args) {

    }  // unit testing (optional)
}
