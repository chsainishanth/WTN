package FlowcontrolMile;
public class PrimeBetweenAandB {
	public static void main(String[] args) 
	{
	int a= Integer.parseInt(args[0]);
	int b= Integer.parseInt(args[1]);
	boolean flag=false;
	int i;
		for( i=a;i<=b;i++)
		{
			flag=false;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==false && i!=0 &&i!=1)
			{
				System.out.print(i+" ");
			}
		}
	}

}
