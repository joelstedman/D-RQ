import java.util.Iterator;
import java.util.NoSuchElementException;
import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int count;

    private class Node {
        Item item;
        Node next;
    }

    public RandomizedQueue(){
        first = null;
        last = null;
        count = 0;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return count;
    }

    public void enqueue(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        }
        else {
            oldlast.next = null;
        }
    }

    public Item dequeue(){
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        Item item = first.item;
        first = first.next;
        count--;
        if (isEmpty()) last = null;
        return item;
    }

    public Item sample(){
        int random = StdRandom.uniform(count);
        //start at the beginning and go that many nodes
        Node current = first;
        for(int i=0; i<random; i++) {
            current = current.next;
        }
        //todo Need to remove the node
        return current.item;
    }

    public Iterator<Item> iterator(){
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
}