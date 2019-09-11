import java.util.function.Function;

public class Example2 {
	
	public static  void main(String args[])
	{
		
		
		
		
		
		Function<Integer,Integer> doubleit = num -> num*2;
		
		Function<Integer,Integer> inc = num -> num++;
		
		Function<Integer,Integer> sqr = num -> num * num ; 
		
		
		final int nu = 100 ;
		
		final int result = doubleit.andThen(inc).andThen(sqr).apply(nu);
		
		System.out.println(result);
	}

}
