package allmethodsInStack;
import java.util.*;
public class insertationInStack 
{
	public static void main(String []args)
	{

		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		//System.out.println(st.size());
		int index=3;
		int x=7;
		Stack<Integer> temp=new Stack<>();
		while(st.size()>index)
		{
			temp.push(st.pop());	
		}
		st.push(x);
		while(temp.size()>0)
		{
			st.push(temp.pop());
		}
		System.out.println(st);
		
		
	}

}
