package testUtility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class PracticeCollection
{
	public static void main (String[] args)
	{
    System.err.println("----------ArrayList-----------------");
        ArrayList al = new ArrayList();
		al.add(222);
		al.add("Test");
		al.add('b');
		al.add(222);
		al.add(null);
		al.add(null);
		al.add("Test");
		al.add(1,333);
   System.out.println(al);
    System.out.println(al.get(2));
 Iterator itr = al.iterator();
  while(itr.hasNext())
  {
	  System.out.println(itr.next());
  } 
   System.err.println("----------LinkList-----------------");
   LinkedList ls = new LinkedList();
	ls.add(222);
	ls.add("Test");
	ls.add('b');
	ls.add(222);
	ls.add(null);
	ls.add(null);
	ls.add("Test");
	ls.add(1,333);
  System.out.println(ls);
  System.out.println(ls.get(2));
		
   System.err.println("------------HashSet---------------");
    HashSet hs = new HashSet();
    hs.add(222);
	hs.add("Test");
	hs.add('b');
	hs.add(222);
	hs.add(null);
	hs.add(null);
	hs.add("Test");
 System.out.println(hs);
 
   System.err.println("------------  Arraylist to Hashset---------------");
   HashSet hs2 = new HashSet();
    hs2.addAll(al);   //adding one collection into another
   System.out.println(hs2);
   
   System.err.println("--------------LinkedHashSet-------------------");
   HashSet lh = new HashSet();
    lh.add(222);
  	lh.add("Test");
  	lh.add('b');
  	lh.add(222);
  	lh.add(null);
  	lh.add(null);
  	lh.add("Test");
  System.out.println(lh);
  
 System.out.println("-----------------------------------------------");
  HashSet hs3 = new HashSet();
    hs3.add("aa");
	hs3.add("cc");
	hs3.add('b');
	hs3.add(222);
	hs3.add(null);
	hs3.add(null);
	hs3.add("Test");
System.out.println(hs3);

System.err.println("------------  Hashset Arraylist to---------------");
ArrayList al2 = new ArrayList();
System.out.println(hs3);
al2.addAll(hs3);
System.out.println(al2.get(2));
 //adding one collection into another

System.err.println("------------------TreeSet------------------------");
TreeSet ts = new TreeSet();
  ts.add(11);
  ts.add(22);
  ts.add(50);
  ts.add(8);
  ts.add(33);
  ts.add(10);
  ts.add(84);
System.out.println(ts);

/*ArrayList al2 = new ArrayList();
  al2.addAll(ts);
System.out.println(al2.get(2));  */
 }
}
