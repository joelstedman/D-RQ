import edu.princeton.cs.algs4.StdOut;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<Integer>();
        for (int i=1; i<=3; i++) {
            deque.addFirst(i);
        }
        for (int i=4; i<=6; i++) {
            deque.addLast(i);
        }

        while(!deque.isEmpty()) {
            //System.out.println(deque.size());
            System.out.println(deque.removeLast());
        }




    }
}
