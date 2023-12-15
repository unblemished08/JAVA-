import java.util.Stack;
public class StackJCF
{
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("TOP = "+s.peek());
        System.out.println("SIZE = "+s.size());
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }

    }
}