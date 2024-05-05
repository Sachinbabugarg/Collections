package Flat;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fklatmap {
public static void main(String[]args)
{

	List<Integer> list1=List.of(1,2,7);
	List<Integer> list2=List.of(0,5,8);
	List<Integer> list3=List.of(1,92,4);
	List<Integer> list4=List.of(88,6,3);
	List<List<Integer>> list=List.of(list1,list2,list3,list4);
	System.out.println(list+" ");
	List<Integer> a1=list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
   List<Integer>    a3=list.stream().flatMap(z->z.stream()).sorted().collect(Collectors.toList());
	int mi=list.stream().flatMap(y->y.stream()).min((a,b)->a.compareTo(b)).get();
	
	
	   int as = list.stream().flatMap(d->d.stream()).reduce((a,b)->a<b?a:b).get();
	  List<Integer> a24=list.stream().flatMap(t->t.stream()).skip(5).collect(Collectors.toList());
	   
    System.out.println(as);
	System.out.print(a1+" ");
	System.out.println();
	System.out.print("sorted "+a3);
	System.out.println();
	System.out.println("min value is "+mi);
	System.out.println("after skiped 5 values"+a24);
	//
	//list.stream().flatMap(a->a.stream()).Methods we can use// 
}
}
