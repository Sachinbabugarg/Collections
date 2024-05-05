package Hash;
import java.util.*;
import java.util.Map.Entry;
public class Hashmap {
public static void main(String[]args)
{
	HashMap h=new HashMap();
	h.put(1, "Aa");
	h.put(2, "Ab");
	h.put(1, "AA");
	System.out.println(h);
	Set s=h.keySet();
	System.out.println(s);
	Collection m=h.values();
	System.out.println(m);
	Set s1=h.entrySet();
	System.out.println(s1);
	Iterator itr=s1.iterator();
	while(itr.hasNext())
	{   
		System.out.println(itr.next());
	}
	
	
}
}
