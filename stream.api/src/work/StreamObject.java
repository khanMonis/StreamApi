package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {

		// Stream API - Collection Process
		// Collection /group of Object

		// Creating Object in 5 ways
		// 1 -blank
		Stream<Object> emptyStream = Stream.empty();

		// 2-array,object,collection
		String names[] = { "Asad", "Monis", "Talha", "Ankit" };

		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e -> {
			System.err.println(e);
		});

		//3- 
		Stream<Object> streamBuilder = Stream.builder().build();
		
		//4
		IntStream stream = Arrays.stream(new int[] {2,4,64,3,564});
		stream.forEach(e->{
			System.out.println(e);
		});
		
		//5.list2,Set
		
		List<Integer> list2 = new ArrayList<>();
	          list2.add(12);
	          list2.add(34);
	          list2.add(23);
	          list2.add(78);
	          
	          Stream<Integer> stream2 = list2.stream();
	            stream2.forEach(e->{
	            	System.out.println(e);
	            });
	}
}
