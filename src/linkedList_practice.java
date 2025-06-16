
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedList_practice{
Node head = null;
    
    public void insert_element(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp != null){
            temp.next = newNode;
            temp = temp.next;
        }

    }


}