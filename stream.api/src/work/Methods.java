package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {
		
		List<String> names= List.of("Monis","Anas","Talha","Ammar","Momin");
	             List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
	              System.out.println(newNames);
		     
		List<String> newNames1 = names.stream().filter(e->e.startsWith("M")).collect(Collectors.toList());
	System.out.println(newNames1);
	
	List<Integer> numbers = List.of(22,3,45,67);
	List<Integer> newNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());
	System.out.println(newNumbers);
	}
}
