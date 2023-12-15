import java.util.*;
public class DequeJCF
{
    public static void main(String args[]) {
            Deque<Integer> dq=new LinkedList<>(); 
            //Deque<Integer> dq=new ArrayDeque<>();
            dq.addFirst(1);
            dq.addFirst(2);
            dq.addLast(3);
            dq.addLast(4);

            System.out.println(dq);

            dq.removeFirst();
            System.out.println(dq);

            dq.removeLast();
            System.out.println(dq);

            System.out.println("first : "+dq.getFirst());
            System.out.println("last : "+dq.getLast()); 
    }
}