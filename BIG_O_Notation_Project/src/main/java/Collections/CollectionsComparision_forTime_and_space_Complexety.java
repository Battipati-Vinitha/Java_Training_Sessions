package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsComparision_forTime_and_space_Complexety {

	private static long getmemoryusage() {
		Runtime runtime=Runtime.getRuntime();
		return runtime.totalMemory()-runtime.freeMemory();

	}



	public static void main(String args[]) {
		long startTime,endTime;
		long memoryBefore,memoryAfter;
		long totalTime;
		long beforeTime;
		long afterTime;
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();


		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();

		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		
		//ArrayList and LinkedList

		startTime = System.nanoTime();
		memoryBefore = getmemoryusage();

		for(int i = 0; i < 2100; i++)
		{
			arrayList.add(i);
		}
		memoryAfter = getmemoryusage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("ArrayList insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("ArrayList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getmemoryusage();

		for(int i = 0; i < 500; i++)
		{
			linkedList.add(i);
		}
		memoryAfter = getmemoryusage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("LinkedList insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("LinkedList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");


		//HashSet and TreeSet

		startTime = System.nanoTime();
		memoryBefore = getmemoryusage();

		for(int i = 0; i < 3000; i++)
		{
			hashSet.add(i);
		}
		memoryAfter = getmemoryusage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("HashSet insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("HashSet memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getmemoryusage();

		for(int i = 0; i < 4000; i++)
		{
			treeSet.add(i);
		}
		memoryAfter = getmemoryusage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("TreeSet insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("TreeSet memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		//HashMap and TreeMap

		for(int i = 0; i < 5000; i++)
		{
			hashMap.put(i, "value"+i);
		}

		System.out.println("==============================");
		System.out.println("HashMap insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("HashMap memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");


		for(int i = 0; i < 6000; i++)
		{
			treeMap.put(i, "value"+i);
		}
		memoryAfter = getmemoryusage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("TreeMap insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("TreeMap memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		//insertion time complexity of ArryList


		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			arrayList.add(i);

		}
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("ArrayList Insertion time :"+ totalTime);
		System.out.println("=========================================");

		//retrieve time complexity of ArrayList
		

		arrayList.get(8734);

		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("ArrayList retrieve time :"+totalTime);
		System.out.println("=========================================");

		arrayList.remove(3456);
		System.out.println("ArrayList remove time complexity :"+totalTime);
		System.out.println("=========================================");

		//insertion time complexity of LinkedList

		startTime = System.nanoTime();
		for (int i =0; i<15000; i++) {
			linkedList.add(i);

		}
		
		System.out.println("LinkedList Insertion time :"+ totalTime);
		System.out.println("=========================================");

		//retrieve time complexity of LinkedList 
		startTime = System.nanoTime();

		linkedList.get(5000);
		System.out.println("LinkedList retrieve time :"+totalTime);
		System.out.println("=========================================");

		//remove time complexity of LinkedList
		linkedList.remove(4000);

		System.out.println("Linkedlist remove complexity time of :"+totalTime);
		System.out.println("=========================================");
		//insertion time complexity of HashMap


		beforeTime = System.nanoTime();
		for(int i =0; i<100000; i++) {
			hashMap.put(i, "i");
		}
		afterTime = System.nanoTime();
		totalTime = afterTime - beforeTime;
		System.out.println("HashMap insertion time complexity :"+totalTime);

		//Remove time complexity of HashMap

		
		hashMap.remove(100000);
		System.out.println("Remove elements time complexity of HashMap :"+totalTime);

		//Insertion elements time complexity of TreeMap

	
		for(int i = 0; i<10000; i++) {
			treeMap.put(i, "i");
		}
		System.out.println("Insertion time complexity of TreeMap :"+totalTime);

		//remove elements time complexity of TreeMap

		beforeTime = System.nanoTime();
		treeMap.remove(4567);
		System.out.println("deletion time complexity of TreeMap :"+totalTime);

		//add time complexity of HashSet
		beforeTime = System.nanoTime();
		for(int i = 0; i<10000; i++) {
			hashSet.add(i);

		}
		System.out.println();
		System.out.println("HashSet insertion time complexity :"+totalTime);
		System.out.println("======================================");


		//deletion elements of HashSet time complexity
		hashSet.remove(5432);		
		System.out.println("HashSet deletion time complexity :"+totalTime);
		System.out.println("======================================");

		//add elements time complexity of TreeSet
		
		for(int i = 0; i<100000; i++) {
			treeSet.add(i);

		}
		
		System.out.println("TreeSet insertion time complexity :"+totalTime);
		System.out.println("======================================");


		//deletion elements of TreeSet time complexity
		
			treeSet.remove(7890);
		System.out.println("TreeSet deletion time complexity :"+totalTime);
		System.out.println("======================================");
	}
}
















