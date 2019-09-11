import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Solution {
	
	
	public static void main(String aregs[]) throws Exception
	{
		Map<Integer,String>  map = new HashMap<Integer,String>();
		
		map.put(1, "one");
		
		
		Optional<String>  op = Optional.ofNullable(map.get(1));
		
		Optional<String>  op1 = Optional.ofNullable(map.get(2));
		
		if(op.isPresent())
		{
			System.out.println("check1 "+op.get());
		}
		
		if(op1.isPresent())
		{
			System.out.println("check2 "+op1.get());
		}
		
		
		
		System.out.println("check3 "+op.orElseGet(() -> " Item not present "));
		
		System.out.println("check4 "+op1.orElseGet(() -> "  the item not present s"));
		
		System.out.println(op1.orElse("the box is empty"));
		
		System.out.println(op1.orElseThrow(()-> new Exception("String not found exception")));
		
	}

}
