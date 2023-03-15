/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlist;
/**
 *
 * @author Cyber
 */
public class mylinkedList implements ILinkedList{
    private Node head;
    private Node tail;
    private int length;
   //checking if it's empty or not
   public boolean isEmpty(){
       if(size()==0){
           return true;
       }
       return false;
   }
    public ILinkedList subList(int fromIndex,int toIndex){
         if (fromIndex < 0 || fromIndex >= length || toIndex < 0 || toIndex > length || fromIndex > toIndex) {
            System.out.println("Error");
            return null;
         }
         mylinkedList sublist = new mylinkedList();
         Node current=get(fromIndex);
           for (int i = fromIndex; i < toIndex; i++) {
            sublist.add(current);
            current = current.next;
        }
           current.next=null;
          return sublist; 
    }
   //getting size
   public int size(){
       return length;
   }
   public void clear(){
       head=null;
       tail=null;
       length=0;
   }
   public Node get(int index){
       if(length==0){
           return null;
       }
       Node P=head;
       for(int i=0;i<index;i++){
           P=P.next;
           if(P==null){
               return P;
           }
       }
       return P;
   }
   public boolean contains (Node o){
       int val=o.value;
       Node P=head;
       for(int i=0;i<size();i++){
           if(P.value==val){
               return true;
           }
           P=P.next;
       }
       return false;
   }
   public void set(int index,Node element){
       Node P1=head;
       Node P2=head;
       Node P3=head;
        if(length==0){
           System.out.println("Error");
           return;
       }
       if(index==0){
           P1=head.next;
           head=element;
           element.next=P1;
           printList();
           return;
       }

       for(int i=0;i<index;i++){
           P1=P2;
           P2=P2.next;
           if(P2==null){
               System.out.println("Error");
               return;
           }
       }
       P3=P2.next;
       P1.next=element;
       element.next=P3;
       P2=null;
       printList();
   }
   public void add(Node element){
       //creating pointer to point on the value entering
       if(length==0){
           head=element;
           tail=element;
       }
       else{
        tail.next=element;
        tail=element;
       }
       length++;
   }
   public void add(int index, Node element){
       Node P1=head;
       Node P2=head;
       if((length==0 && index==0)||(index==length)){
           add(element);
           printList();
           return;
       }
       else if((length==0 && index!=0)||index>length){
           System.out.println("Error");
           return;
       }
       if(index==0){
           head=element;
           element.next=P1;
           printList();
           return;
       }
       for(int i=0;i<index;i++){
           P2=P1;
           P1=P1.next;
           if(P1==null){
               System.out.println("Error");
               return;
           }
       }
       P2.next=element;
       element.next=P1;
       length++;
        printList();
   }
   public void remove (int index){
       Node P1=head;
       Node P2=head;
       Node P3=head;
       if(length==0){
           System.out.println("Error");
           return;
       }
       if(length==1 && index==0){
           clear();
       }
       else if(length==1 && index!=0){
           System.out.println("Error");
           return;
       }
       else if(length!=0 && length!=1 && index==0){
           head=head.next;
           printList();
           return;
       }
       for(int i=0;i<index;i++){
           P1=P2;
           P2=P2.next;
          if(P2==null){
           System.out.println("Error");
           return;
          }
       }

       P3=P2.next;
       P1.next=P3;
       P2.next=null;
       length--;
       printList();
   }
    public void printList(){
       Node temp=head;
       System.out.print("[");
       while(temp!=null){
           System.out.print(temp.value);
           temp=temp.next;
           if(temp!=null){
               System.out.print(", ");
           }
       }
       System.out.print("]");
    }   
   /*removing testcase scenarious
   1)2 or more items
   2)1 item
   3)no items
   */
   /*public Node removeLast(){
        Node temp=head;
        Node preTemp=head;
       if(length==0){
           System.out.println("the list is already empty");
       }
       else if(length==1){
           head=null;
           tail=null;
       }
       else{
           //while(temp.next!=null)same as below
           while(temp!=tail){
               preTemp=temp;
               temp=temp.next;
           }
           tail=preTemp;
           tail.next=null;
       }
       length--;
       return temp;
   }
   public void removeFirst(){
       if(length==0){
           System.out.println("the list is already empty");
       }
       else{
           head=head.next;
       }
       length--;
   }
     
   }*/

      /*   public void addToFirst(Node element){
       if(length==0){
           head=element;
           tail=element;
       }
       else{
           element.next=head;
           head=element;
       }
       length++;
   }*/
   /*
      public int getHead(){
       if(head==null){
           System.out.println("Linked list is empty");
       }
       return head.value;
   }
   //returns the last element
   public int getTail(){
       if(tail==null){
           System.out.println("Linked list is empty");
       }
       return tail.value;
   }
   */
}
