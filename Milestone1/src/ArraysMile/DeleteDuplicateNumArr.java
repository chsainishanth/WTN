package ArraysMile;
public class DeleteDuplicateNumArr {
	public static void main(String[] args) 
	{
		int i,j,l,k=0;
		int n=Integer.parseInt(args[0]);
		int a[]  = new int[n];
		for(i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(args[i+1]);
		}
		l=a.length;
		for(i = 0; i < l; i++)
		    {
		        for(j = i+1; j < l;j++ )
		        {
		            if(a[j] == a[i])
		            {
		                a[j]=-1;
		            }
		        }
		    }
		for(k=0;k<l;k++)
		{
			if(a[k]>=0)
			{
				System.out.print(a[k]+" ");
			}
		}
	}
}
