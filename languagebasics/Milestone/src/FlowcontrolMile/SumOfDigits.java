package FlowcontrolMile;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int i,sum=0;
		for(i=0;n>0;n=(n/10))
		{
			 sum=sum+(n%10);
		}
		System.out.println(sum);
	}

}
