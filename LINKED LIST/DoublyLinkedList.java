public class DoublyLinkedList
{
    public static class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        //step1: to create new node
        Node newNode= new Node(data);
        size++;

        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        newNode.next= head;//forward linking
        head.prev=newNode;//backward linking
        head=newNode;
    } 

    public void addLast(int data)
    {
        Node newNode= new Node(data);
        size++;

        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    public void print()
    {
        if(head==null)
        {
            System.out.println("LINKED LIST IS EMPTY");
            return;
        }

        Node temp=head;
        while(temp !=null)
        {
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    } 

    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("LL IS EMPTY");
            return Integer.MIN_VALUE;//RETURN ANY NON SUTIABLE NO.
        }

        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

             int val=head.data;
            head=head.next;
            head.prev=null;
            size--;
            return val;
        }

    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("LL IS EMPTY");
            return Integer.MIN_VALUE;//RETURN ANY NON SUTIABLE NO.
        }

        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
            //pre= size-2
            Node pre=head;
            for(int i=0;i<size-2;i++)
            {
                pre=pre.next;
            }

             int val=tail.data;
            pre.next=null;
            tail.prev=null;
            tail=pre;
            size--;
            return val;            
    }

    public void reverse()
    {
        Node prev=null;
        Node curr=head;//right to left assignment: head in tail and tail(i.e. head) in curr
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;//REVERSING
            curr.prev=next;

            prev=curr;
            curr=next;
        }

        head=prev;//updating head
    }

    public static void main(String args[])
    {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.addLast(7);
        dll.removeLast();
        dll.removeFirst();
        dll.print();
        dll.reverse();
        dll.print();
    }
}


