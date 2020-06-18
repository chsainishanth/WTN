package ArraysMile;
public class Large2Small2inArr {
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
		for(i=0;i<l;i++)
		{
			for(j=i;j<l;j++)
			{
				if(a[i]>a[j])
				{
					int swap=a[j];
					a[j]=a[i];
					a[i]=swap;
				}
			}
		}
		System.out.print("Samllest of 2 is --> "+a[0]+","+a[1]); System.out.println();
		System.out.print("Largest  of 2 is --> "+a[l-2]+","+a[l-1]);
	}
}
