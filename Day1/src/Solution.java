
@FunctionalInterface
interface SayHelloI 
{
	 public void hello(String name);
}


public class Solution
{

	static SayHelloI  obj = name -> System.out.println(" hello "+name); 
	
	
	public static void main (String args[])
	{
		
		obj.hello("suman");
		
	}
}
