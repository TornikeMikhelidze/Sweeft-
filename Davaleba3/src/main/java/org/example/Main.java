package org.example;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        list.addData(21);
        list.addData(1);
        list.addData(13);
        list.addData(43);
        list.addData(-5);
        list.addData(-40);
        list.addData(43);
        list.addData(100);
        list.addData(132);

        list.print();
        System.out.println("shebrunebuli listi:");
        //shemowmeba
        ListNode current=reverseList(list.getHead());
        while (current!=null){
            System.out.println(current.getData());
            current=current.getNext();
        }

    }
    //davaleba
    public static ListNode reverseList(ListNode head){

        ListNode current = head;
        ListNode previous = null;
        ListNode next;
        while (current != null) {
            //privel jerze next-it mivutitebt headis shemdeg elements
            next = current.getNext();
            //shemdeg current is next-it  mivutitebT previous
            //romelic pirvel iteraciaze null-ia da asec unda iyos
            current.setNext(previous);
            //shemdeg previous miutitebs currents, da current miutitebs next-s,
            //asevTqvad win wavinacvlebT
            previous=current;
            current=next;
        }
        //sabolood head gaxdeba previous(ukanaskneli elementy sawyis listshi)
        head=previous;
        return head;
    }
}