public class LinkedList
{
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
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

        //step2: newnode next=head
        newNode.next= head;//linking

        //step3: head=newnode
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
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int index,int data)
    {
        if(index==0)
        {
            addFirst(data);
            return;
        }

        Node newNode=new Node(data);
        size++;

        Node temp=head;
        int i=0;

        while(i<(index-1))
        {
            temp=temp.next;
            i++;
        }

        //i=index-1: temp=prev
        newNode.next=temp.next;
        temp.next=newNode;
    } 

   //LOOP TO FIND SIZE....NOT NEEDED AS WE HAVE STATIC VARIABLE SIZE
    public int calculatesize()
    {
    Node temp=head;
    int count=0;
       while(temp!=null)
        {
           count++;
            temp=temp.next;
        }

    return count;
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
            //prev= size-2
            Node prev=head;
            for(int i=0;i<size-2;i++)
            {
                prev=prev.next;
            }

             int val=tail.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
    }
    
    public int iterativeSearch(int key)//O(n)
    {
        int i=0;
        Node temp=head;

        while(temp!=null)
        {
            if(temp.data==key)
            return i;

            temp=temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head,int key)//recursiveSearch
    {
        if(head==null)
        return -1;

        if(head.data==key)
        return 0;

        int index=helper(head.next,key);

        if(index==-1)
        return -1;

        return index+1;
    }  

    public int recursiveSearch(int key)//O(n)
    {
        return helper(head,key);
    }

    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;//right to left assignment: head in tail and tail(i.e. head) in curr
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;//REVERSING
            prev=curr;
            curr=next;
        }

        head=prev;//updating head
    }

    public void deleteNthfromend(int n)//n from last is size-n-1 from start
    {
        int sz=calculatesize();

        if(n==sz)
        {
            head=head.next;//removeFirst
            return;
        }

        int i=1;
        int iToFind= sz-n;//prev node
        Node prev=head;
        while(i<iToFind)
        {
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return ;
    }

    public Node findMid(Node head)//SLOW FAST APPROACH
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null /* for even*/ && fast.next !=null/*for odd */)
        {
            slow=slow.next; //+1;
            fast=fast.next.next; //+2;
        }
        
        return slow; //slow is middle node
    }

    public boolean checkPallin()
    {
        if(head==null || head.next==null)
        return true; //0 or 1 node is always pallindrome

        //step 1 : find mid
        Node mid=findMid(head);

        //step 2: reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;//REVERSING
            prev=curr;
            curr=next;
        }

        Node right=prev;//right half head
        Node left=head;

        //step 3: check left half and right half
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }

        return true;
    }

    public boolean isCycle()//FLOYD'S CYCLE FINDING ALGORITHM
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null /* for even*/ && fast.next !=null/*for odd */)
        {
            slow=slow.next; //+1;
            fast=fast.next.next; //+2;
            if(slow==fast)
            return true;//exists
        }

       return false; 
    }


    public  void removeCycle() 
    {
       //detect cycle

       Node slow = head;
       Node fast = head;
       boolean cycle = false;

       while(fast != null && fast.next!= null) 
       {

        slow =slow.next;
        fast =fast.next.next;

          if(fast == slow) 
          {
            cycle = true;
            break;
          }

        }
         
         if (cycle == false)
            return;

    //find meeting point

        slow = head;
        Node prev = null; //last node
         while(slow != fast) 
         {
                prev = fast;
                slow =slow.next;
                fast= fast.next;
         }

         //remove cycle
         prev.next=null;
    }

    public Node getmid(Node head)
    {
        Node slow=head;
        Node fast=head.next;//only diff from find mid in case of even ll

        while(fast!=null /* for even*/ && fast.next !=null/*for odd */)
        {
            slow=slow.next; //+1;
            fast=fast.next.next; //+2;
        }
        
        return slow; //slow is middle node
    }

    public Node merge(Node head1,Node head2)
    {
        Node mergedll=new Node(-1);
        Node temp=mergedll;

        while(head1!=null && head2!=null)
        {
            if(head1.data<=head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else
            {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1!=null)
        {
            temp.next=head1;
                head1=head1.next;
                temp=temp.next;
        }

        while(head2!=null)
        {
            temp.next=head2;
                head2=head2.next;
                temp=temp.next;
        }

        return mergedll.next;
    }

    public Node mergeSort(Node head)
    {
        if(head==null || head.next ==null)
        {
            return head;
        }

        //find mid
        Node mid=getmid(head);

        //left and right merge sort
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft= mergeSort(head);
        Node newRight= mergeSort(rightHead);

        //merge
        return merge(newLeft,newRight);
    }

    public void zigzag()
    {
        //find mid
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next !=null)
        {
            slow=slow.next; 
            fast=fast.next.next; 
        }

        Node mid=slow;
        
        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null; //seperating 1st half
        Node prev=null;
        Node next;

        while(curr!= null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node nextl,nextr;

        //alt merge= zigzag merge
        while(left!=null && right!=null)
        {
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;

            left=nextl;
            right=nextr;
        }
    }

    
   public static void main(String args[])
    {
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        //1->2->3->4->null
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addMiddle(2,9);
        ll.print();

        /*System.out.println("SIZE OF LINKED LIST = "+ll.size);

        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println("SIZE OF LINKED LIST = "+ll.size);
        System.out.println("INDEX IN LINKED LIST = "+ll.iterativeSearch(3));
        System.out.println("INDEX IN LINKED LIST = "+ll.recursiveSearch(10));
        ll.reverse();
        System.out.println("REVERSED LINKED LIST = ");
        ll.print();
        ll.deleteNthfromend(3);
        ll.print(); 
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPallin());*/
        ll.head=ll.mergeSort(ll.head);
        ll.print();
        ll.zigzag();
        ll.print();
    }
}


