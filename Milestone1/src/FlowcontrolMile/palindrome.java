package FlowcontrolMile;

public class palindrome {

	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		int sum=0;
		int t=n;
		while(t>0)
		{
			int r=t%10;
			sum=sum*10+r;
			t=t/10;
		}
		if(n==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
