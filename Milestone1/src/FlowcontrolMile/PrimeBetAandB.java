package FlowcontrolMile;
public class PrimeBetAandB {
	public static void main(String[] args) 
	{
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int flag=1;
		for(int i=a;i<=b;i++)
		{
			if(i==0 || i==1)
			{
				continue;
			}
			flag=1;
			for(int j=2;j<a/2;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				System.out.print(i+" ");
			}
		}
	}
}
