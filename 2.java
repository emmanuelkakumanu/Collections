
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"a");hm.put(2,"b");hm.put(3,"c");hm.put(4,"d");hm.put(5,"e");
		hm.put(6,"f");hm.put(7,"g");hm.put(8,"h");hm.put(9,"i");hm.put(10,"j");
		System.out.println(hm);
		hm.put(11,"k");
		System.out.println("7 : "+hm.get(7));
		
		HashMap<Integer,String> cp=new HashMap<>();
		cp.putAll(hm);
		System.out.println(cp);
		System.out.println("contains 9 as a key : "+hm.containsKey(9));
		System.out.println("contains k as a value : "+hm.containsValue("k"));
		System.out.println(" is map empty : "+hm.isEmpty());
		System.out.println("size of map :"+hm.size());
		System.out.println("Key set : "+hm.keySet());
		System.out.println("Value set :  "+hm.values());
		hm.remove(6);
		System.out.println(hm);
		
	}
}
