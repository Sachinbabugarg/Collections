package LINKED;
import java.util.*;
public class Link {
public static void main(String[]arsg)
{
	Set<Integer> s=new LinkedHashSet<>();
	LinkedHashSet h=new LinkedHashSet();
	s.add(12);
	s.add(3);
	s.add(38);
	System.out.println(s);
	s.remove(2);
	System.out.println(s);
	s.add(2);
	Iterator i=s.iterator();
    while(i.hasNext())
    {
    	System.out.println(i.next());
    }
}
}
