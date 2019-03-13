import edu.princeton.cs.algs4.StdOut;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<Integer>();
        deque.addLast(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addFirst(5);
        //deque.removeFirst()   ==> 5
        //deque.removeLast()    ==> 4
        //        for (int i=1; i<=3; i++) {
//            deque.addFirst(i);
//        }
//        for (int i=4; i<=6; i++) {
//            deque.addLast(i);
//        }
//
        while(!deque.isEmpty()) {
            //System.out.println(deque.size());
            System.out.println(deque.removeFirst());
        }




    }
}
