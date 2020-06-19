package ArraysMile;
public class MidOf_2arrays 
{
	public static void main(String[] args) 
	{
		int n=args.length;
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[2];
		int i,p=3,k=0;
		for(i=0;i<p;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(i=p;i<n;i++)
		{
			b[k++]=Integer.parseInt(args[i]);
		}
		c[0]=a[1];
		c[1]=b[1];
		for(i=0;i<2;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
