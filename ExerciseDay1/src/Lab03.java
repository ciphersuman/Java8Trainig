import java.util.function.Function;
import java.util.function.Predicate;

public class Lab03 {
	
	public static void main (String args[])
	{
		int a = 3 ;
		
		int b = 2 ; 
		
	Function <Input,Input> aSquare  = num -> num.getInstance(op -> o );
	Function <Input,Integer> bSquare = num -> num.b * num.b;
	
	Function <Input,Integer> twoAB = num -> 2 * num.a * num.b;
	
	}

	
	public class Input {
	 
		
		
		Input getInstance(Operation o )
		{
			return o.getInstance(this);
		}
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		public Input(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}
		private int a;
		private int b;
		
		//ADD MORE CODE IF REQUIRED
	}	
	
	
	@FunctionalInterface
	interface Operation 
	{
		
		Input getInstance(Input a);
	}
}
