package ArraysMile;
public class EvenOddArr {
	public static void main(String[] args) 
	{
		int n = args.length;
		int i,p=0,q=0,k=0;
		int a1[]=new int[n];
		int a2[]=new int[n];
		int a3[]=new int[n];
		for(i=0;i<n;i++)
		{
			a1[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<n;i++)
		{
			if(a1[i]%2==0)
			{
				a2[p]=a1[i];
				p++;
			}
			else
			{
				a3[q]=a1[i];
				q++;
			}
		}
		for(i=p;i<n;i++)
		{
			a2[i]=a3[k++];
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a2[i]+" ");
		}
		
	}
}
