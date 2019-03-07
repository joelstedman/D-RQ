import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private Item item;

    public RandomizedQueue(){
        Deque<Item> item = new Deque<Item>();
    }

    public boolean isEmpty(){
        return true;
    }

    public int size(){
        return 5;
    }

    public void enqueue(Item item){

    }

    public Item dequeue(){
        return item;
    }

    public Item sample(){
        return item;
    }

    public Iterator<Item> iterator(){
        Iterator<Item> it = this.iterator();
        return it;
    }

    public static void main(String[] args) {

    }
}
