public class addDel {
    Node head;
    class Node{
        int data;
        Node next;

        //constructor
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    // add first to linked list
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last to list
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete first node
    public void delFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // delete Last node
    public void delLast(){
        Node currNode = head;
        Node prevNode = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        while(currNode.next != null){
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
    }

    // print linked list

    public void printingList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode =currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        addDel list = new addDel();
        list.addFirst(2);
        list.addFirst(1);
        list.printingList();
        list.addLast(3);
        list.addLast(4);
        list.addLast(8);
        list.printingList();

        list.delFirst();
        list.printingList();
        list.delLast();
        list.printingList();
    }
}
