package ArraysMile;
public class MaxandMininArr {
	public static void main(String[] args) 
	{
		int i,max=0,sum=0;
		int n=Integer.parseInt(args[0]);
		int a[]  = new int[n];
		for(i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(args[i+1]);
		}
		int l=a.length;
		int min=a[0];
			for( i=0;i<l;i++)
			{
				if(sum<a[i])
				{
					max=a[i];
				}
				if(a[i]<min)
				{
					min=a[i];
				}
			}
			System.out.println("max element is "+max);
			System.out.println("min element is "+min);
	}
}
