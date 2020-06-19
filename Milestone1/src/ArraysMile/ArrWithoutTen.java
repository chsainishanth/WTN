package ArraysMile;
public class ArrWithoutTen {
	public static void main(String[] args) 
	{
		int n=args.length;
		int i,k=0;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int a1[]=new int[n];
		for(i=0;i<n;i++)
		{
			if(a[i]!=10)
			{
				a1[k]=a[i];
				k++;
			}
		}
		
		for(i=0;i<n;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}
}
