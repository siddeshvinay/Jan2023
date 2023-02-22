package com.roughexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class sorting {
	
	public static void printarr(int arr[]) {
		for( int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public void bubblesort() {
		int a[]= {7, 8, 3, 1,2};
		for ( int i=0; i<a.length; i++) {
			for( int j=0; j<a.length-i-1; j++) {
				if(a[j] < a[j+1]){
					int temp= a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			
			}
			
		}
		printarr(a);
	}
	
	
	// selection sort
	public void slectionSort() {
		int a[]= {7,8,3,1,2};
		// in Selection sort-- find the smallest element of the array and put it to the first index of the array
		//by swapping with first element. 
		for ( int i=0; i<a.length; i++) {
			int smallest= i; // here we assume that first element is smallest one. if so we then we keep it first place of the array
            // now in the second for we are implementing logic 
			for(int j=i+1; j<a.length; j++ ) // why I put j=1, because once we get the smallest element, then we have to exclude 1st element in the next iteration.
			{
				//now put a condition;  if first element is smaller than next element,then don't enter in the loop. 
				if(a[j]< a[smallest])   // ex: 8<7 -- is 8 is smaller than 7-- Ans is no then dont enter the loo.
				{                         // second iteration 8<3 --- false then enter into the loop. then make it as smallest by providing the position.
					 smallest=j;        // now is 3 is smaller one and loop will continue 
				}
			}
			//when the loop condition fails then swap with smallest index with first index element of the array
			int temp= a[i];  //1
			a[i]=a[smallest];
			a[smallest]=temp;	
		}
		printarr(a);
	}
	
	public void printstar() {
		for ( int i=0; i<5; i++) {
			for( int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for ( int k=i; k<5; k++)
			{
				System.out.print("*");
			}
			for ( int x=i; x<4; x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for ( int c=0; c<5; c++)
		{
			for (int q=c; q<5; q++) {
			System.out.print(" ");
			}
			for ( int f=0; f<=c; f++) {
			System.out.print("^");
			}
			
			for( int m=1; m<=c; m++) {
				System.out.print("^");
			}
			System.out.println();
			
		}
		
		
	}
	
	//How to convert an array into a collection
	
	public void arrytocole() {
		String Ar= "how to convert an array into a collection";
		char ca[]=Ar.toCharArray();
		String name[]=null;
		for( int i=0; i<ca.length; i++) {
			System.out.print(ca[i]);
			 name= new String[i];
			 System.out.println(name);
		}
		
		  List<String> list= Arrays.asList(name);
		  
		  for(String li:list) { System.out.println(li); }
		 
	}
	//how to print a collection 
	public void TreeExamples() {
		TreeMap<Integer, String> tmap= new TreeMap<Integer, String>();
		tmap.put(1, "Monday");
		tmap.put(2, "Tuesday");
		tmap.put(3, "Wednesday");
		tmap.put(4, "Thursday");
		tmap.put(5, "Friday");
		tmap.put(6, "Saturday");
		tmap.put(7, "Sunday");
		System.out.println("Keys of the tree Map:"+ tmap.keySet());
		System.out.println("Keys of the tree Map:"+ tmap.values());
		System.out.println("Key: 5 value: "+ tmap.get(5)+ "\n");
		System.out.println("Key: 5 value: "+ tmap.get(tmap.lastKey())+ "\n");
		System.out.println("Key: 5 value: "+ tmap.remove(tmap.firstKey())+ "\n");
		System.out.println("Key: tree map contains:"+tmap.values()+ "\n");
	}
	
	//hw to make collection readonly
	public void readonly() {
		List stuff= Arrays.asList(new String[] {"a", "b"});
		List list= new ArrayList(stuff);
		try {
			list.set(0, "new value");
		}catch (UnsupportedOperationException e) {
		}
		Set set= new HashSet(stuff);
		//set= Collections.unmodifiableSet(set);
		Map mp= new HashMap();
		//mp=Collections.unmodifiableMap(mp);
		System.err.println("Collection is read only now");
		
	}
	
	// How to remove specific data from collection
	public void specdatacole()
	{
		System.out.println("Collection Example!\n");
		int size;
		HashSet<String>collect= new HashSet<>();
		String str1="yellow", str2="White", str3="Green", str4="Blue";
		Iterator iterator;
		collect.add(str1);
		collect.add(str2);
		collect.add(str3);
		collect.add(str4);
		System.out.println("collection data");
		iterator= collect.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+ " ");
		}
		System.out.println();
		collect.remove(str2);
		System.out.println("now new collection data");
	    iterator= collect.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+ " ");
		}
		System.out.println();
		size=collect.size();
		System.out.println("collection new size"+ size+ "\n");
	}
	
	
	
	static class Edge{
		int src;
		int dst;
		int weg;
		
		public Edge( int s, int d, int wg) {
			this.src=s;
			this.dst=d;
			this.weg=wg;
		}
		
		public static void createGraph(ArrayList<Edge> graph[]) {
			
			  for( int i=0; i<graph.length; i++) { graph[i]=new ArrayList<Edge>(); }
			 
			
			graph[0].add(new Edge(0, 2,2));
			
			graph[1].add(new Edge(1, 2, 10));
			graph[1].add(new Edge(1, 3, 0));
			
			graph[2].add(new Edge(2, 0, 2));
			graph[2].add(new Edge(2, 1, 10));
			graph[2].add(new Edge(2, 3, -1));
			
			graph[3].add(new Edge(3, 1, 0));
			graph[3].add(new Edge(3, 2, -1));
			
			
		}
	}
	
	//graph examples 0,1,2,3
	public void graphex() {
		int v=4;
		
		ArrayList<Edge> graph[]= new ArrayList[v];
		Edge.createGraph(graph);
		
		//prints  2 neighbors
		for ( int i=0; i<graph[2].size(); i++) {
			Edge e=graph[2].get(i);
			System.out.println(e.dst+" "+e.weg);
		}
		
	
		
	}
	
	public void testa() {
		
		Runnable r = () -> System.out.println("Runnable Implementation Using Lambda Expressions");
	}



	public static void main(String[] args) {
		sorting so=new sorting();
		//so.slectionSort();
		//so.printstar();
		//so.arrytocole();
		//so.TreeExamples();
		//so.readonly();
		//so.specdatacole();
		so.graphex();
		//so.testa();
	
		
	}

}
