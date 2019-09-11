import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lab6 {
	
	
	static List<Integer> numbers = 
			Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	
	public static void main(String args[])
	{
		
		
		System.out.println(numbers.stream().reduce((l1,l2) -> l1>l2 ? l1:l2 ).orElse(-1));
		System.out.println(numbers.stream().reduce((l1,l2) -> l1<l2 ? l1:l2 ).orElse(-1));
		
     Object[] arr=numbers.stream().filter(l1->l1%2==0).filter(l1->l1>3).map(l->l*2).toArray();
     
     System.out.println(arr[1]);
		
	}

}
