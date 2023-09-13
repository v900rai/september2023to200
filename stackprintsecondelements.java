package allmethodsInStack;
import java.util.*;

public class stackprintsecondelements 
{
	///print the second element in given aarays
	public static void main(String []args)
	{
		Stack<Integer> st= new Stack<>();
		st.push(10);
		st.push(11);
		st.push(12);
		st.push(13);
		st.push(14);
		st.push(15);
		System.out.println(st.size());
		System.out.println(st);
		while(st.size()>2)
		{
			st.pop();
		}
		System.out.println(st);
		
		
		
	}

}
