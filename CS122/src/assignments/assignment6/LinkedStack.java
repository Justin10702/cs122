package assignments.assignment6;

import java.util.LinkedList;




// ***************************************************************
// LinkedStack.java
//
// A linked implementation of an Object stack class with operations push,
// pop, and isEmpty and isFull.
//
// ***************************************************************
public class LinkedStack implements StackADT
{
private Node top; // reference to top of stack
private int test;
private int length;
// ------------------------------------------------

// Constructor -- initializes top
// ---------------------------------------------------
public LinkedStack()
{
	top = null;
	length = 10;
}
// ---------------------------------------------------
// Adds element to top of stack if it's not full, else
// does nothing.
// ---------------------------------------------------
public void push(Object val)
{
	if(isFull() != true) {
       
		Node bruh = top;
		test++;
        top = new Node(val);
        top.setNext(bruh);
    }
}

// ---------------------------------------------------
// Removes and returns value at top of stack. If stack
// is empty returns null.
// ---------------------------------------------------
public Object pop()
{
	if(isEmpty() != true) {
        test--;
        Node bruh = top;
        top = top.getNext();
        return bruh.getElement();
    } else {
        return null;
    }
}
// ---------------------------------------------------
// Returns true if stack is empty, false otherwise.
// ---------------------------------------------------
public boolean isEmpty()
{
	if(test == 0) {
        return true;
      }
      else {
        return false;
      }
}
// ---------------------------------------------------
// Returns true if stack is full, false otherwise.
// ---------------------------------------------------
public boolean isFull()
{
	if(test == length) {
        return true;
      }
      else {
        return false;
      }
    }


//***********************************************************
// Node.java
// A general node for a singly linked list of objects.
//***********************************************************
public class Node
{
private Node next;
private Object element;
//----------------------------------------------------
// Creates an empty node
//----------------------------------------------------
public Node()
{
next = null;
element = null;
}
//----------------------------------------------------
// Creates a node storing a specified element
//----------------------------------------------------
public Node(Object element)
{
next = null;
this.element = element;
}
//----------------------------------------------------
// Returns the node that follows this one
//----------------------------------------------------
public Node getNext()
{
 return next;
}
//----------------------------------------------------
// Sets the node that follows this one
//----------------------------------------------------
public void setNext(Node node)
{
 next = node;
}
//----------------------------------------------------
// Returns the element stored in this node
//----------------------------------------------------
public Object getElement()
{
 return element;
}
//----------------------------------------------------
// Sets the element stored in this node
//----------------------------------------------------
public void setElement(Object element)
{
this.element = element;
}
}
}