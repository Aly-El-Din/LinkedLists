/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.linkedlist;

/**
 *
 * @author Cyber
 */
public interface ILinkedList {
    
    
    public void add(int index, Node element);                         //done
/**
* Inserts the specified element at the end of the list.
* @
*/
   public void printList();
public void add(Node element);                      //done
/**
* @param index
* @return the element at the specified position in this list.
*/
public Object get(int index);                       //done

/**
* Replaces the element at the specified position in this list with the
*/
    public void set(int index, Node element);             //done
/**
* Removes all of the elements from this list.
*/
    public void clear();            //done                
/**
* @return true if this list contains no elements.
*/
    public boolean isEmpty();                                       //done
/**
* Removes the element at the specified position in this list.
* @param index
*/
    public void remove(int index);                                    //done
/**
* @return the number of elements in this list.
*/
    public int size();    
    //public ILinkedList sublist(int fromIndex, int toIndex);
    public boolean contains(Node o);        //done
    
    public ILinkedList subList(int fromIndex,int toIndex);
}
