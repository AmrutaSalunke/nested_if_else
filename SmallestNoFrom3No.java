package nested_if_statement;

public class SmallestNoFrom3No {
	
	public static void main(String[] arg) {
		
		int a=10 ,b=06,c=69;
	    
		if(a<b) 
		{
			if(a<c) {
				System.out.println("a="+a+" is smaller than b="+b+ " and c="+c);
			}
			else
			{
				System.out.println("c="+c+" is smaller than a="+a+ " and b="+b);

			}
		}
		
		else
		{
			if(b<c) {
				System.out.println("b="+b+" is smaller than a="+a+ " and c="+c);
			}
			else
			{
				System.out.println("c="+c+" is smaller than a="+a+ " and b="+b);

			}

		}
	}

}
