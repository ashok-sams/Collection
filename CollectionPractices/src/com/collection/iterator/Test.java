package com.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Ashok");
		al.add("Susmita");
		al.add("Dipshika");
		al.add("Pinky");
		al.add("Deblina");
		
		System.out.println(al);
		
		
		//How we iterates the value from foreach loop
		
		for(String str:al)
		{
			System.out.print(str +"\t\t"+str.length()+"\t");
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse());
			System.out.println("*********************************");
		}
		System.out.println("-------------------------------------------------");
		//Travese the elements by iterators :Forward Traversing
		
		Iterator<String> itr = al.iterator();
		
		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
			
		}
		System.out.println("============================================================");
		
		//Backward Travesing Elements by Iterator : we have to used List Iterator
		
		ListIterator<String> ltr = al.listIterator(al.size());
		
		while (ltr.hasPrevious())
		{
			String pre = ltr.previous();
			System.out.println(pre);
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		//travesing element from foreach() method
		
		al.forEach(e->{
			System.out.println(e);
		});
	}

}
