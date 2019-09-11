import java.util.Scanner;

public class Lab01 {
	
	
	public static void main(String args[])
	{
		Calculator c = new  Calculator();
		
		Scanner sc = new Scanner(System.in );
		
		System.out.println("enter numner 1");
		int x1= sc.nextInt();
		
		System.out.println("enter numner 2");
		int y1 =sc.nextInt();
		
		
		 c.setX(x1);
		 c.setY(y1);
		 
		 System.out.println("enter choice : 1 for add , 2 for sub , 3 for mul , 4 for div ");
		 int choice = sc.nextInt();
		 
		 switch ( choice)
		 {
		 
		 case 1: 
			 System.out.println("addition is "+c.add((p,q)-> p+q));
	            break; 
	        case 2: 
	        	 System.out.println("Subtarction si "+c.sub((p,q)-> p-q)); 
	            break; 
	        case 3: 
	        	System.out.println("Multipicatiob is "+c.mul((p,q)-> p*q));
	            break; 
	        case 4: 
	        	 System.out.println("division is "+c.div((p,q)-> p/q));
	            break; 
	            
	        default: 
	        	System.out.println(" Default");
	        	break;
		 
		 }
		
		 
		
		 
		 
		 
		
	}

}



 class Calculator 
{ 
	 int x; 
	 public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	int y; 
	 
	public  int add ( AddI o )
	{
		return o.add(x, y);
		
	}
	
	
	public  int sub ( SubI o )
	{
		return o.sub(x, y);
		
	}
	
	
	public int mul(MulI o)
	{
		return o.mul(y, y);
	}
	
	
	public int div (DivI o )
	{
		return o.div(x, y);
	}
	 
	 
	 
	 
	
}

@FunctionalInterface
interface AddI {
	
	
	public int add(int a , int b);
}



@FunctionalInterface
interface SubI {
	
	
	public int sub(int a , int b);
	
}

interface MulI
{
	
	public int mul(int a, int b);
}


interface DivI
{
	public int div (int a , int b);
}

