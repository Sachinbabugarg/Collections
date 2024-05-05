package HASHMAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
public static void main(String[]args)
{
   HashMap<Integer,String> h=new HashMap<>();
   h.put(1, "A");
   h.put(2, "B");
   h.put(3, "C");
   h.put(4, "D");
   h.put(5, "E");
   System.out.println(h);
   h.remove(5);
   System.out.println(h);
   h.values();
   System.out.println(h);
   Set<Integer> s=h.keySet();
   System.out.println(s);
   Collection<String> a=h.values();
   System.out.println(a);
   Set e=h.entrySet();
   System.out.println(e);
   for(int i: s)
   {
	   System.out.println(i);
   }
   for(String j : a)
   {
	   System.out.println(j);
   }
   h.clear();
   System.out.println(h);
   
}
}
