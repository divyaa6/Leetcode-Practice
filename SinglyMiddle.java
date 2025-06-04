public class SinglyMiddle {
    public static class Node{
            int data;
            Node next;
            Node(int d){
                this.data=d;
                this.next=null;
            }

            Node(int d,Node n ){
                this.data=d;
                this.next=n;
    }
    public static void view(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void middle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);

    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node n1=new Node(2);
        head.next=n1;
        Node n2=new Node(3);
        n1.next=n2;
        Node n3=new Node(4);
        n2.next=n3;
        Node n4=new Node(5);
        n3.next=n4;
        
        view(head);
        middle(head);
    }
       
}
    
}
