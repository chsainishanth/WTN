package ArraysMile;
public class DeleteDuplicate2 {
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int i,j,k=0;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i+1]);
		}
		int a1[]=new int[n];
		for(i=0;i<n;i++)
		{
			int c=0;
			for(j=0;j<k;j++)
			{
				//System.out.println("*"+k+"*");
				if(a[i]==a1[j])
				{
					c++;
				}
			}
			if(c==0)
			{
				a1[k]=a[i];
				k++;
			}
		}
		for(i=0;i<k;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}

}
