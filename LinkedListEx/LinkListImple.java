package LinkedListEx;

public class LinkListImple {
    
    public static void main(String[] args) {
        LL link = new LL();
        link.insertLast(1);
        link.insertLast(2);
        link.insertLast(3);

        // link.display();

        link.insertLast(4);
        link.insertLast(5);
        link.insertLast(6);
        link.insertLast(7);
        // link.display();
        // System.out.println(link.size);


        link.insertMiddle(4, 10);
        link.display();
        System.out.println(link.size);

        link.deleteFirst();
        link.display();
        link.deleteLast();
        link.display();
        link.deleteMiddle(3);
        link.display();
    }
}
