package assignments.assignment6;

//********************************************************************
//ParenMatch.java
//
//Determines whether or not a string of characters contains
//matching left and right parentheses.
//********************************************************************
import java.util.*;
import java.util.Scanner;
public class ParenMatch
{
public static void main (String[] args)
{
Stack s = new Stack();
String line; // the string of characters to be checked
Scanner scan = new Scanner(System.in);
System.out.println ("\nParenthesis Matching");
System.out.print ("Enter a parenthesized expression: ");
line = scan.nextLine();
System.out.println(ParenthesisMatch(line));
if(ParenthesisMatch(line) == true) {
	System.out.println("You have matching parenthesis");
}else {
	System.out.println("Your parenthesis do not match");
}
//loop to process the line one character at a time
//print the results
}

public static boolean ParenthesisMatch(String ilovejava) {
   

    Stack<Character> bruh = new Stack<Character>();

    char test;
    
    for(int i=0; i < ilovejava.length(); i++) {
        test = ilovejava.charAt(i);

        if(test == '(')
            bruh.push(test);
        
        else if(test == ')')
            if(bruh.empty())
                return false;
            else if(bruh.peek() == '(')
                bruh.pop();
            else
                return false;
        	
        
    }
    return bruh.empty();
}
}

