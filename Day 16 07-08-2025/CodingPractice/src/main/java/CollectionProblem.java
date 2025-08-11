package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
//System.out.println();
public class CollectionProblem {
		public ArrayList<String> shuffleArrayList() {
			ArrayList<String> list = new ArrayList<>();
			list.add("apple");
			list.add("Mango");
			list.add("Pineapple");
			list.add("Banana");
			System.out.println("Before shuffle: "+ list);
			Collections.shuffle(list);
			System.out.println("After shuffle: "+ list);
			
			return list;
			
		}
		
		public List<String> extractPortionList() {
			ArrayList<String> list = new ArrayList<>();
			list.add("apple");
			list.add("Mango");
			list.add("Pineapple");
			list.add("Banana");
			System.out.println("Original List: "+list);
			List<String> subList= list.subList(1, 3);
			System.out.println("SubPortion"+subList);
			return subList;
		}

		public void replaceSecondElement() {
			ArrayList<String> list = new ArrayList<>();
			list.add("apple");
			list.add("Mango");
			list.add("Pineapple");
			list.add("Banana");
			System.out.println("Original List before replcement: "+ list);
			list.set(2, "Date");
	
			System.out.println("After replace 2nd element: "+list);	
		}
		public void cloneOfHashSet() {
			HashSet<Integer> hash = new HashSet<>();
			hash.add(2);
			hash.add(5);
			hash.add(7);
			hash.add(8);
			
			HashSet<Integer> cloneHash = new HashSet<>(hash);
			
			
			System.out.println(hash);	
		}
		public void hashSetToTreeSet() {
			HashSet<Integer> hash = new HashSet<>();
			hash.add(2);
			hash.add(5);
			hash.add(7);
			hash.add(8);
			
			System.out.println("HashSet " + hash);

			TreeSet<Integer> tree = new TreeSet<>(hash);
			
			
			System.out.println("HashSet to treeSet: "+ tree);
			
			
		}
		
		public void viewMapKey() {
			HashMap<Integer,String> map = new HashMap<>();
			map.put(1,"Kiran");
			map.put(2,"Ravi");
			map.put(3,"Abhi");
			map.put(4,"Rahul");
			
			for(Map.Entry<Integer, String> entry : map.entrySet()) {
				System.out.println("Keys: "+ entry.getKey());
			}
		}
}
