import java.util.*;
public class StackUsingDeque
{
    public static class Stack {
        static Deque<Integer> dq = new LinkedList<Integer>();

        public static boolean isEmpty() {
            return dq.isEmpty();
        }

        public static void push(int data) {
            dq.addLast(data);
        }

        public static int pop() {
            return dq.removeLast();
        }

        public static int peek() {
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}