package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {

		// Q)Create a List and Filter all even numbers from a List
		List<Integer> list1 = List.of(2, 3, 34, 56, 67);
		// list1.add(45);

		// list1
		// Without Stream
		ArrayList<Integer> listEven = new ArrayList<>();
		for (Integer i : list1) {
			if (i % 2 == 0) {
				listEven.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(listEven);

		// Using Stream
		
  //		Stream<Integer> stream = list1.stream();
  //	List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
  //		System.out.println(newList);
		List<Integer> newList = list1.stream().filter(i ->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
	}
}
