package FlowcontrolMile;

public class CheckInttAsPosNegZero
{
	public static void main(String[] args) 
	{
		
		int a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.println("positive");
		}
		if(a<0)
		{
			System.out.println("Negative");
		}
		if(a==0)
		{
			System.out.println("Zero");
		}
	}
	

}
