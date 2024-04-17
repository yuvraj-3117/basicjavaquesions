package ARRAYSINJAVA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeduplicate {

	public static void main(String[] args) {
		
		int a [] = {10,20,3,40,30,70,60,70,10};
		
		Set <Integer> st = new HashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			
				st.add(a[i]);
		}
		
		Integer b [] =st.toArray(new Integer[st.size()]); 
		    //set convert into aaray
	       //	Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		
		
	}

}
