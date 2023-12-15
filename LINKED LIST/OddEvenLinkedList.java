class OddEvenLinkedList {

  Node head;

  class Node {

    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  void segregateEvenOdd() {
    Node end = head;
    Node prev = null;
    Node curr = head;
    while (end.next != null) //last of list
    end = end.next;

    Node new_end = end;
    while (curr.data % 2 != 0 && curr != end) //odd in start of list
    {
      new_end.next = curr;
      curr = curr.next;
      new_end.next.next = null;
      new_end = new_end.next;
    }

    if (curr.data % 2 == 0) {
      head = curr;
      while (curr != end) {
        if (curr.data % 2 == 0) //even 
        {
          prev = curr;
          curr = curr.next;
        } else { //push at last
          prev.next = curr.next;
          curr.next = null;
          new_end.next = curr;
          new_end = curr;
          curr = prev.next;
        }
      }
    } else prev = curr;
    
    if (new_end != end && end.data % 2 != 0) {
      prev.next = end.next;
      end.next = null;
      new_end.next = end;
    }
  }

  void push(int new_data) {
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }

  void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String args[]) {
    OddEvenLinkedList llist = new OddEvenLinkedList();
    llist.push(6);
    llist.push(1);
    llist.push(4);
    llist.push(5);
    llist.push(10);
    llist.push(12);
    llist.push(8);
    System.out.println("Linked List");
    llist.printList();
    llist.segregateEvenOdd();

    System.out.println("updated Linked List");
    llist.printList();
  }
}
