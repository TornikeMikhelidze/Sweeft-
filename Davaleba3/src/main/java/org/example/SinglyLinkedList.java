package org.example;
//martivi singlyLinkedLIst shesrulebuli davalebis shesamowmeblad
public class SinglyLinkedList {
    private ListNode head;
    public ListNode getHead(){
        return this.head;
    }
    public SinglyLinkedList(){
        this.head=null;
    }
    public void addData(int data){
        ListNode newNode=new ListNode(data);
        if(head==null)head=newNode;
        else{
            ListNode current=head;
            while (current.getNext()!=null){
                current=current.getNext();
            }
            current.setNext(newNode);
        }
    }
    public void print(){
        ListNode current=head;
        while(current!=null){
            System.out.println(current.getData());
            current=current.getNext();
        }
    }
}
