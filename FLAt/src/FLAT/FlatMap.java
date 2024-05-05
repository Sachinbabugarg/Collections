package FLAT;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
public static void main(String[]args)
{
	List<String> list1=List.of("amit","sourabh","sachin");
	List<String> list2=List.of("baitho","ruko","pio");
	List<String> list3=List.of("aao","jao","kahao");
	List<String> list4=List.of("kar","so","mohan");
	List<String> list5=List.of("Manish","Ram","shyam");
	List<List<String>> list=List.of(list1,list2,list3,list4);
	List<String> main= list.stream().flatMap(x->x.stream()).filter((y->y.startsWith("a"))).collect(Collectors.toList());
	long n=list.stream().flatMap(y->y.stream()).count();
	list.stream().flatMap(z->z.stream()).map(c->c.length()).forEach(System.out::println);
	System.out.println("The Empolyee Name Start with a"+main);
	System.out.println("total no of employee"+n);
}
}
