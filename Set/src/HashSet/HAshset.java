package HashSet;
import java.util.*;
public class HAshset {
public static void main(String[]args)
{
	Set<String> s=new HashSet<>();
	s.add("a");
	s.add("b");
	s.add("c");
	s.add("a");
	s.add(null);
	System.out.println(s);
	s.remove("a");
	s.add("d");
 	Iterator i=s.iterator();
 	while(i.hasNext())
 	{
 		System.out.println(i.next());
 	}
 	System.out.println(s);
}
}
