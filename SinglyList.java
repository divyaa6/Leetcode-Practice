public class SinglyList {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    public static void view(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node Insertbegin(Node head,int val){
        Node NewNode=new Node(val);
        NewNode.next=head;
        head=NewNode; 
        return head;   

    }
    public static Node Insertend(Node head,int val){
        if (head == null)
        return new Node(val);

        Node temp=head;
        Node newnode=new Node(val);
        while(temp.next!=null)
        temp=temp.next;

        temp.next=newnode;
        newnode.next=null;
        return head;
    }
    public static Node Insertatpos(Node head,int val,int k){
        if (k == 1 || head == null)
        return Insertbegin(head, val);

        Node temp=head;
        Node newnode=new Node(val);
        int i=1;

        while(temp.next!=null && i<k-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;

    }

    public static Node Deletebegin(Node head){
        if(head==null)
        return null;

        head=head.next;
        return head;
    }

    public static Node Deleteend(Node head){
        if (head == null || head.next == null)
        return null;

        Node temp=head;
        while(temp.next.next!=null)
        temp=temp.next;

        temp.next=null;
        return head;
    }

    public static Node Deleteatpos(Node head,int k){
        if(head==null)
        return null;

        if(k==1)
        return Deletebegin(head);

        Node temp=head;
        int i=1;

        while(temp.next!=null && i<k-1 && temp!=null){
            temp=temp.next;
            i++;
        }

        if(temp.next==null || temp==null)
            return head;

        temp.next=temp.next.next;
        return head;
    
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

        head=Insertbegin(head,8);
        view(head);

        head=Insertend(head,9);
        view(head);

        head=Insertatpos(head, 10,1);
        view(head);

        head=Deletebegin(head);
        view(head);

        head=Deleteend(head);
        view(head);

        head=Deleteatpos(head,5);
        view(head);
   }
    
}
