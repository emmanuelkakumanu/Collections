
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		ArrayList<String> ar=new ArrayList<>();
		ar.add("hi");ar.add("hello");ar.add("example");ar.add("program");ar.add("to");
		ar.add("demonstrate");
		ar.add("arraylist");ar.add("and");ar.add("its");ar.add("operations");
		System.out.println(ar);
		ar.add("cheking");
		System.out.println("After adding an element : "+ar);
		Iterator li=ar.iterator();
		while(li.hasNext())
		{
			if(li.next().equals("program"))
			{
				System.out.println("found program element");
			}
		}
		ar.add(10,"adding_new_element");
		System.out.println(ar);
		ar.remove("hello");
		ar.remove(9);
		System.out.println(ar);
		ar.set(9,"updated");
		System.out.println(ar);
		System.out.println("ar contains updated : "+ar.contains("updated"));
		System.out.println("element at index 7 : "+ar.get(7));
		System.out.println("size of ar : "+ar.size());
		ar.removeAll(ar);
		System.out.println(ar);
	}
}
