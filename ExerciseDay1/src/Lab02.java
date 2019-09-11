import java.util.Scanner;
import java.util.function.Predicate;

public class Lab02 {
	
	
	public static void main(String args[])
	{
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter username");
		String st= sc.nextLine();
		
		Predicate<String> p1 = user -> user !=null;
		
		Predicate<String> p2 = user -> !user.isEmpty();
		
		Predicate<String> p3 = user -> user.length()>6;
		
		Predicate<String> pfinal = p1.and(p2.and(p3));
		
		
		Predicate<String> pfinal1 = p1.and(p2.and(p3));
		
		
		
		System.out.println("Testing username  "+pfinal.test(st));
		
	}

}
