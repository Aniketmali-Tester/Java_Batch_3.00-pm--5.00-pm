package Constructor;

public class ConstructorOverloadig {
	
	
	
	
	

	public ConstructorOverloadig(String s) 
	{
		this(50);
		System.out.println(s);
		
	}

	
	public ConstructorOverloadig(int k)
	
	{
		this(true);
		System.out.println(k);
	}
	
	public ConstructorOverloadig(boolean b)
	{
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloadig obj=new ConstructorOverloadig("String");
		
		
		

	}

}
