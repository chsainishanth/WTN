package FlowcontrolMile;

public class EvenBetweenTwoNum {

	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int i;
		for(i=a;i<=b;i++)
		{
			if((i/2)*2==i)
			{
				System.out.print(i+" " );
			}
				
		}

	}

}
