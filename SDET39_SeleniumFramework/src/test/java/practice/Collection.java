package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) 
	{
//		ArrayList<Object> list=new ArrayList<Object>();
//		
//		list.add(10);
//		list.add('A');
//		list.add("hi");
//		list.add(10);
//		list.add(null);
//		System.out.println(list);
//		list.add(2,"hello");
//		
//		ArrayList<Object> list2=new ArrayList<Object>();
//		list2.add("bye");
//		list2.add('B');
//		list.add(list2);
//		System.out.println(list);
//		System.out.println(list2);
//		
//		if(list.contains('A'))
//			System.out.println("yes");
//		else
//			System.out.println("No");
//		ArrayList<Integer> list3=new ArrayList<Integer>();
//		list3.add(10);
//		list3.add(50);
//		list3.add(30);
//		list3.add(15);
//		list3.add(20);
//		Collections.sort(list3);
//		for(int i:list3)
//		{
//			System.out.println(i);
//		}
		
//ArrayList<Object> list=new ArrayList<Object>();
//		
//		
//		
//		list.add("hi");
//		list.add('A');
//		list.add(10);
//		list.add(null);
//		list.add(20);
//		
//		
//		ArrayList<Object> list2=new ArrayList<Object>();
//		list2.add(10);
//		list2.add("hi");
//		list2.add('A');
//		list.retainAll(list2);
////		list.removeAll(list2);
//		System.out.println(list);
		
		
		Stack<Object> s=new Stack<Object>();
		s.push(10);
		s.push(40);
		s.push(50);
		s.push("Anubhav");
		s.push('A');
		
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
		System.out.println(s.search(10));
		System.out.println(s.search(40));
		System.out.println(s.search("Anubhav"));
		System.out.println(s.search(50));
		
//		LinkedList<Object> list=new LinkedList<Object>();
//		list.add("Hi");
//		list.add("Hello");
//		list.add("Anubhav");
//		list.add('A');
//		list.add(10);
//		list.add(10);
//		list.add(null);
//		list.addFirst("Indian");
//		list.addLast("Singh");
//		System.out.println(list);
		
//		PriorityQueue<Object> que=new PriorityQueue<Object>();
//		que.add(5);
//		que.add(10);
//		que.add(12);
//		que.add(52);
//		que.add(25);
//		que.add(15);
//		System.out.println(que.peek());
//		System.out.println(que);
//		System.out.println(que.poll());
//		System.out.println(que);
		
		HashSet<Object> set=new HashSet<Object>();
		set.add(10);
		set.add(10);
		set.add("Anubhav");
		set.add('A');
		set.add(20);
		set.add("Hi");
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		LinkedHashSet<Object> set1=new LinkedHashSet<Object>();
		set.add(10);
		set.add(10);
		set.add("AKSingh");
		set.add(20);
		set.add('A');
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		
//		TreeSet<Object> set=new TreeSet<Object>();
//		set.add('A');
//		set.add('A');
//		set.add('E');
//		set.add('D');
//		set.add('C');
//		set.add('B');
//		
//		set.add(null);
//		
//		System.out.println(set);
		
//		Hashtable<Integer,String> map=new Hashtable<Integer,String>();
//		map.put(101, "Hi");
//		map.put(102, "Mr.");
//		map.put(101, "Hi");
//		map.put(103, "A");
////		map.put(null, null);
//		Hashtable<String,Integer> map1=new Hashtable<String,Integer>();
//		map.put( "Hi",102);
//		map.put("Mr.",102);
//		map.put("Hi",103);
//		map.put("A",104);
////		map.put(null, null);
		
//		System.out.println(map);
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(104, "10");
		map.put(101, "Hi");
		map.put(101, "hello");
		map.put(102, "Ak");
		map.put(103, "Singh");
		map.put(null, "Hi");
		map.put(105, null);
		map.put(106, null);
		map.put(null, "bye");
		System.out.println(map);
		
		
		
		
		

	}

}