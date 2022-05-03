package assignments.assignment5;

import java.util.LinkedList;

import javafx.scene.Node;

//***********************************************************
//LinkedQueue.java
//A linked-list implementation of the classic FIFO queue interface.
//***********************************************************
public class LinkedQueue implements QueueADT
{
private Node front, back;
private int numElements;
LinkedList<String> LinkedQueue;

//---------------------------------------------
//Constructor; initializes the front and back pointers
//and the number of elements.
//---------------------------------------------
public LinkedQueue()
{
	this.LinkedQueue = new LinkedList<String>();
}
//---------------------------------------------
//Puts item on end of queue.
//---------------------------------------------
public void enqueue(Object item)
{
	Node newnode = new Node(item);
	//if list is empty, this will be the only node in it
	if (front == null) 
	front = newnode;

	else
	{
	//make temp point to last thing in list
	Node temp = front;
	while (temp.next != null)
	temp = temp.next;
	
	temp.next = newnode;
	}
	}

//---------------------------------------------
//Removes and returns object from front of queue.
//---------------------------------------------
public Object dequeue()
{
	return LinkedQueue.removeFirst();
}
//---------------------------------------------
//Returns true if queue is empty.
//---------------------------------------------
public boolean isEmpty()
{
	if(LinkedQueue.size() == 0) {
		return true;
	}else {
		return false;
	}
}
//---------------------------------------------
//Returns true if queue is full, but it never is.
//---------------------------------------------
public boolean isFull()
{
	return false;
}
//---------------------------------------------
//Returns the number of elements in the queue.
//---------------------------------------------
public int size()
{
	return LinkedQueue.size();
}
//---------------------------------------------
//Returns a string containing the elements of the queue
//from first to last
//---------------------------------------------
public String toString()
{
String result = "\n";
Node temp = front;
while (temp != null)
{
result += temp.getElement() + "\n";
temp = temp.getNext();

}
return result;

}public class Node
{
private Node next;
private Object element;
//-------------------------------------------------------
//Creates an empty node
//-------------------------------------------------------
public Node()
{
next = null;
element = null;
}
//-------------------------------------------------------
//Creates a node storing a specified element
//-------------------------------------------------------
public Node(Object element)
{
next = null;
this.element = element;
}
//-------------------------------------------------------
//Returns the node that follows this one
//-------------------------------------------------------
public Node getNext()
{
return next;
}
//-------------------------------------------------------
//Sets the node that follows this one
//-------------------------------------------------------
public void setNext(Node node)
{
next = node;
}
//-------------------------------------------------------
//Returns the element stored in this node
//-------------------------------------------------------
public Object getElement()
{
return element;
}
//-------------------------------------------------------
//Sets the element stored in this node
//-------------------------------------------------------

public void setElement(Object element)
{
this.element = element;
}
}

}