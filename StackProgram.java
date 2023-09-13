package allmethodsInStack;
import java.util.*;
public class StackProgram 
{
	public static void main(String []args)
	{
		Stack<Integer> st=new Stack<>();
		// add
		st.push(7);
		st.push(5);
		st.push(9);
		st.push(10);
		st.push(20);
		//LIFO list in frist out
		//peek return
		//System.out.println(st.peek());
		// print
		 System.out.println(st.pop()); /// remove
		 System.out.println(st.pop());// remove
		 System.out.println(st.pop());// remove
		 System.out.println(st.peek());// last return
		System.out.println(st);// print
		System.out.println("size :"+ st.size());
	
		
	}

}
