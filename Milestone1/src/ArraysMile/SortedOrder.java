package ArraysMile;
public class SortedOrder {
	public static void main(String[] args) 
	{
		int i,j,l;
		int n=Integer.parseInt(args[0]);
		int a[]  = new int[n];
		for(i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(args[i+1]);
		}
		l=a.length;
		int swap;
		for(i=0;i<l;i++)
		{
			for(j=i;j<l;j++)
			{
				if(a[i]>a[j])
				{
					swap=a[j];
					a[j]=a[i];
					a[i]=swap;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}
