/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedlist;

/**
 *
 * @author Cyber
 */
import java.util.Scanner;
public class LinkedList {
    
    public static void main(String []args){
        Scanner cin=new Scanner(System.in);
        int val;
        String str=cin.nextLine();
        str=str.replaceAll("\\[|\\]","");
        String []s=str.split(", ");
        if(s[0].isEmpty()){
            s=new String[]{};
        }
        mylinkedList linked=new mylinkedList();
        for(int i=0;i<s.length;i++){
            val=Integer.parseInt(s[i]);
            Node myNode=new Node(val);
            linked.add(myNode);
        }  
        String []inputs={"add","addToIndex", "set", "clear","remove","get","isEmpty","contains","sublist","size"};
        String s2=cin.nextLine();
        int c=0;
        int val2,idx;
        for(int i=0;i<10;i++){
            if(s2.equals(inputs[i])){
                c=i;
            }
        }
        Node another;
        switch(c){
            case 0:val2=cin.nextInt();
            another=new Node(val2);
            linked.add(another);
            linked.printList();
            break;
            case 1:            
            idx=cin.nextInt();
            val2=cin.nextInt();
            another=new Node(val2);
            linked.add(idx, another);
            break;
            case 2:
            idx=cin.nextInt();
            val2=cin.nextInt();
            another=new Node(val2);
            linked.set(idx, another);
            break;
            case 3:linked.clear();
             linked.printList();
            break;
            case 4:
            idx=cin.nextInt();
            linked.remove(idx);
            break;
            case 5:
                idx=cin.nextInt();
                if(linked.get(idx)==null){
                    System.out.println("Error");
                }
                else{
                    System.out.println(linked.get(idx).value);
                }
            break;
            case 6:
                boolean flag=linked.isEmpty();
                System.out.println(linked.size());
                if(flag){
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
                }
                break;
            case 7:val2=cin.nextInt();
            another=new Node(val2);
            boolean flag2=linked.contains(another);
            if(flag2){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
            break;
            case 8:
            int idx1=cin.nextInt();
            int idx2=cin.nextInt();
            ILinkedList sub1=linked;
            ILinkedList sub2=new mylinkedList();
            sub2=sub1.subList(idx1, idx2);
            sub2.printList();
            break;
            case 9:System.out.println(linked.size());
            break;
        }   
    }
}
