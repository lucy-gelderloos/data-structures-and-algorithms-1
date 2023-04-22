package datastructures.linkedlist;

public class LinkedList
{
  Node head = null;
  //Node tail = null; optional

  public void insert(int value){
    // TODO: Implement at 1:08 in recording
    Node newNode = new Node(value);
    newNode.next = this.head;
    this.head = newNode;

    if(head == null){
      newNode = head;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  public boolean includes(int value){
    // TODO: Implement
    // tell whether or not there is a node with the given value in the linked list
    return true;
  }

  @Override
  public String toString()
    {
      // TODO: implement me
      //  1 -> 2 -> 3 -> 4 -> null
        return "null";
    }
}
