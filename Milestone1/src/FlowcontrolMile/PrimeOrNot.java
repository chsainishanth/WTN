package FlowcontrolMile;

public class PrimeOrNot {

	public static void main(String[] args)
	{
	int n = Integer.parseInt(args[0]);
	int H=n/2;
	for(int i=2;i<=H;i++)
	{
		if(n%i==0)
		{
			System.out.println("not a prime number");
			break;
		}
		else
		{
			System.out.println("prime number");
		}
	}
	}

}
