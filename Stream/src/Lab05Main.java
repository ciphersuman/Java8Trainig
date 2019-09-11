import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lab05Main {
	
	
	public static void main(String[] args) {
		Library library = new Library();
		List<Integer> evenNumbers = library.findEvenNumbers();
		List<Integer> oddNumbers = library.findOddNumbers();
		List<Integer> squares = library.findSquares();
		List<Integer> cubes = library.findCubes();
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
		System.out.println(squares);
		System.out.println(cubes);
	}

}



 class Library {
	private List<Integer> numbers = Arrays.asList(12, 34, 56, 21, 78, 92, 43);

	public List<Integer> findEvenNumbers() {
		Stream<Integer>  st1 = numbers.stream();
		return st1.filter(l-> l%2==0)
				.collect(Collectors.toList());
		
	}
	
	public List<Integer> findOddNumbers() {
		Stream<Integer>  st2 = numbers.stream();
		return st2.filter(l-> l%2!=0)
	    .collect(Collectors.toList());	
	}
	
	public List<Integer> findSquares() {
		Stream<Integer>  st1 = numbers.stream();
		return st1.map(l-> l*l)
	    .collect(Collectors.toList());
		
		
		
	}
	
	public List<Integer> findCubes() {
		Stream<Integer>  st1 = numbers.stream();
		return st1.map(l-> l*l*l)
	    .collect(Collectors.toList());
		
	}
}