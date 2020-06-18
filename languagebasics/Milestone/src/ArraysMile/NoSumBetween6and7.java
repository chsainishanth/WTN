package ArraysMile;
public class NoSumBetween6and7 {
	public static void main(String[] args) 
	{
		int i,j,sum=0;
		int n=Integer.parseInt(args[0]);
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i+1]);
		}
		int d=0,c=0;
		for(i=0;i<n;i++)
		{
			if(a[i]==6)
			{
				for(j=i;j<n;j++)
				{
					d=d+a[j];
					if(a[j]==7)
					{
						c=1;
						break;
					}
				}
			}
			sum=sum+a[i];
		}
		if(c==1)
		{
			System.out.println(sum-d);
		}
		else
		{
			System.out.println(sum);
		}
		
	}
}
