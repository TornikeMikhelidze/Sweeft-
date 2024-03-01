package org.example;
/* martalia Node-s jobia garedan wvdomady wevreby ar qondes da mxolod singlyLinkedLIst-idan iyos wvdomady,
amas movaxerxebdit private inner class it da public constructorit, magram me mxolod chemi algoritmis shemowmeba
mainteresebs, romelic Main class-shia.
 */
public class ListNode {

    private int data;
    private ListNode next;

    public int getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int data) {
        this.data = data;
        next = null;
    }
}
