import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
	
	public static void main(String args[])
	{
		List<String> list = (List) Arrays.asList("Java","Sala","Ruby","JavaScript","Clojure" );
		
		
		Stream<String>  st = list.stream();
		
		st.parallel().filter(l-> { 
			System.out.println("Filter1 "+ l);
			return l.startsWith("J");
			}).filter(l->
			
			
			
			{
				
				System.out.println("Filter 2 "+ l);
				return l.length()>4;
				}
			
					
					
					).map(l-> 
					
					
					{
						System.out.println("map1 "+ l);
						return l.toLowerCase();
						
					
					
					}).forEach(System.out::println);
		
		
	}

}
