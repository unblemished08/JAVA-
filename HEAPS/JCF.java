import java.util.PriorityQueue;
import java.util.Comparator;
public class JCF
{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        pq.add(3); //O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek()+" "); //O(1)
            pq.remove(); //O(log n)
        }

        PriorityQueue<Integer> pq1= new PriorityQueue<>(Comparator.reverseOrder());

        pq1.add(3); //O(log n)
        pq1.add(4);
        pq1.add(1);
        pq1.add(7);

        while(!pq1.isEmpty())
        {
            System.out.println(pq1.peek()+" "); //O(1)
            pq1.remove(); //O(log n)
        }
    }
}