package practicalModuleTwo;
import java.util.*;
public class practicleSeventeen 
{
	public static void main(String[] args)
	{
		//operations performed on arraylist
		//1. creating arrayList
		List<Integer> list = new ArrayList<>();
		List<Integer> listTwo = new ArrayList<>();
		List<Integer> listThree = new ArrayList<>();
		listTwo.add(8);
		listTwo.add(2);
		listTwo.add(4);
		listTwo.add(6);
		listTwo.add(8);
		//2. adding elements 
		list.add(5);
		list.add(1, 10);
		list.addAll(2, listTwo);
		list.addAll(list);
		
		
		//13. sort list
//		Collections.sort(list);
		
		//14. reverst list
//		Collections.reverse(list);
//		System.out.println(list);
		
//      15. shuffle list element		
//		Collections.shuffle(list);
		System.out.println(list);
		
		Object[] arr1 = list.toArray();
		System.out.println(arr1);
		System.out.println("array elements");

		for(Object val: arr1)
			System.out.print(val + ", ");
		
		System.out.println();
		//3. access elements
		System.out.println(list.get(0));
		//here we provide list, but only return element 
		//at perticular index. i.e (5)
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		//4. iterate.
		//a. using for each loop
		System.out.println("printing list element using for each loop");
		for(int val: list)
			System.out.println(val);
		//b. using iterator
		System.out.println("printing list element using iterator");
		Iterator itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		int index = list.indexOf(10); //return first occurance 
		System.out.println("Index of 10: " + index);
		
		
		//5. check element presence
		System.out.println(list.contains(5));
		System.out.println(list.contains(listThree));
		System.out.println(list.containsAll(listTwo));

		//6. get size
		System.out.println("size of list: " + list.size());
	
		//7. remove elements
		//a. by using index
		list.remove(10); 
		System.out.println(list);
		
		//b. by using list object
		list.removeAll(listTwo);
		System.out.println(list);
			
		//8.replace element
		list.set(1, 15);
		System.out.println(list);
		
		//9. find index of an element
		//it will return first occurance of an element
		int indexOne = list.indexOf(10);
		System.out.println("Index of 10: " + indexOne);
		
		//10.return last index of perticular element
		System.out.println("\n " + listTwo);
		System.out.println("last index of element is: "+ listTwo.lastIndexOf(8));
		
		System.out.println(list.isEmpty());
		//10. do array list empty
		list.clear();
		System.out.println(list);
		
		//11. check empty 
		System.out.println(list.isEmpty());
		
		//12. convert arrayList to array
		Object[] arr = list.toArray();
		System.out.println(arr);
		
		
		
	}
	
}
