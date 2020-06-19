package FlowcontrolMile;

public class ArgEvenOdd {

	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		if((a/2)*2==a)
		{
			System.out.println("Even");
		}
		if((a/2)*2!=a)
		{
			System.out.println("Odd");
		}
	

	}

}
