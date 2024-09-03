package LinkedListEx;

public class LL {
    private Node head;
    private Node tail;
    static int size=0;
    LL(){
        this.size=1;
    }

    private class Node{
        int val;
        private Node next;

        Node(int val){
            this.val = val;
        }
        Node(int val,Node node){
            this.val = val;
            this.next = node;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.val = val;
        node.next = head;
        head = node;
        if(tail==null){
            tail = node;
        }
        size+=1;
    }


    public void insertLast(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        node.val = val;
        tail.next = node;
        
        tail = node;
        size+=1;

    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }


    public void insertMiddle(int place,int val){
        if(place==1){
            insertFirst(val);
            return;
        }
        if(place==size){
            insertLast(val);
            return;
        }
        Node newNode = new Node(val);
        // newNode.val = val;
        Node temp = head;
        for(int i=1;i<=place-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        // newNode.next = temp.next;
        temp.next = newNode;
        // newNode.val = val;
    }

    public void deleteFirst(){
        if (head.next==null) {
            head = null;
            tail = null;
        }
        else{
            head = head.next;
        }
    }


    public void deleteLast(){
        if(head.next==null){
            head = null;
            tail = null;
        }
        else{
            Node temp =head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            tail = temp;
            tail.next=null;
        }
    }


    public void deleteMiddle(int place){
        if(place==1) deleteFirst();
        else if(place==size) deleteLast();
        else{
            Node temp = head;
            for(int i=1;i<=place-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
}
