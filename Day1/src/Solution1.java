
@FunctionalInterface
interface Shape
{
	public int area (); 
	default  void print()
	{
		System.out.println(" printing ");
		
	}
	
}
