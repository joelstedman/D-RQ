import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {

    public static void main(String[] args)  { // test client (optional)


//        if (n <= 0) {
//            throw new java.lang.IllegalArgumentException();
//        }

        RandomizedQueue<String> q =  new RandomizedQueue<String>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            q.enqueue(s);

        }
        int count = 0;
        int n = q.size();
        while (count < n) {
            StdOut.println(q.dequeue());
            count++;

        }
    }
}
