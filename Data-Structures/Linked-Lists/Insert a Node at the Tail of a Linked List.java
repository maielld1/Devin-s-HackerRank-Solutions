/*
You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. Insert this node at the tail of the linked list and return the head node. The given head pointer may be null, meaning that the initial list is empty.

Input Format 
You have to complete the Node* Insert(Node* head, int data) method. It takes two arguments: the head of the linked list and the integer to insert. You should not read any input from the stdin/console.

Output Format 
Insert the new node at the tail and just return the head of the updated linked list. Do not print anything to stdout/console.

Sample Input

NULL, data = 22 
22 --> NULL, data = 33
Sample Output

2 -->NULL
2 --> 3 --> NULL
Explanation 
1. We have an empty list, and we insert 22. 
2. We start with a 22 in the tail. When 33 is inserted, 33 then becomes the tail.
*/

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
       if (head == null){
        head = new Node();
        head.data = data;
       }
       else {
        Node node = head;
        while (node.next != null){
            node = node.next;
        }
        node.next = new Node();
        node.next.data = data;
        }
        return head;
}
