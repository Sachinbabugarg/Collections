package COLLECTON;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLIST {
public static void main(String[]args)
{
	List<Integer> al=new ArrayList<>();
	ArrayList l=new ArrayList();
	al.add(10);
    l.add("Sachin");
    l.add(40);
    al.add(20);
    System.out.println(al);
    System.out.println(l);
    l.remove(1);
    System.out.println(l);
    al.remove(0);
    System.out.println(al);
    al.add(12);
    al.add(13);
    l.add("Mohir");
    l.add('d');
    System.out.println(al);
    System.out.println(l);
    al.remove(2);
    l.remove(1);
    System.out.println(l);
    System.out.println(al);
	al.add(20);
	al.add(30);
	al.add(50);
	al.add(null);
	al.add(20);
	System.out.println(al.lastIndexOf(20));
	al.removeAll(al);
	al.add(20);
	Iterator i=al.iterator();
    while(i.hasNext())
    {
    	System.out.println(i.next());
    }
    al.remove(0);
    al.add(50);
    System.out.println(al);
    
}
}
