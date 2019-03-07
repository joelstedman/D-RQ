import edu.princeton.cs.algs4.StdOut;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<Integer>();
        for (int i=1; i<=2; i++) {
            deque.addFirst(i);
        }

        while(!deque.isEmpty()) {
            System.out.println(deque.size());
            System.out.println(deque.removeFirst());
        }




    }
}
