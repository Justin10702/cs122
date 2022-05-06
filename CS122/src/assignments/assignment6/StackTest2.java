package assignments.assignment6;


//***************************************************************
//StackTest.java
//
//A simple driver to test a stack.
//
//***************************************************************
import java.util.Stack;

import javafx.scene.Node;

import java.util.Collections;

public class StackTest2
{
public static void main(String[] args)
{
//Declare and instantiate a stack
Stack stack = new Stack();
//push some stuff on the stack
for (int i=0; i<10; i++)
stack.push(i);
stack.push(5);

printStack(stack);
reverseStack(stack);
System.out.println(" ");
printStack(stack);
reverseStack(stack);
removeElement(stack, 5);
System.out.println(" ");
printStack(stack);

}
 static void printStack(Stack s) {
	if (s.isEmpty())
        return;
 	int x = (int) s.peek();
    s.pop();
    System.out.print(x + " ");
    printStack(s);
    s.push(x);
   
}
  static Stack reverseStack(Stack s) {
	Stack bruhbutton = new Stack();
	bruhbutton = s;
	  if (!bruhbutton.isEmpty()) {  
		  
	         int bruh = (int) bruhbutton.pop(); 
	         reverseStack(bruhbutton);
	        Bottom(bruhbutton, bruh);  
	    }  
	return bruhbutton;
  }
  
  //to help me in reversing the stack 
  static void Bottom(Stack s, int test) {  
	    if (s.isEmpty()) {  
	        s.push(test);  
	    } else {  
	       int top = (int) s.pop();  
	        Bottom(s, test);  
	        
	        s.push(top);  
	    }  
	}  
  
  static Stack removeElement(Stack s, int val) {
	 
	  Stack bruhbutton = new Stack();
	  bruhbutton = s;
	  bruhbutton.remove((val));
	  bruhbutton.pop();
	return bruhbutton;
  }
  
 }

