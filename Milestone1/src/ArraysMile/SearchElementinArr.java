package ArraysMile;
public class SearchElementinArr 
{
public static void main(String[] args) 
	{
	int i;
	int n=Integer.parseInt(args[0]);
	int key=Integer.parseInt(args[1]);
	int a[]  = new int[n];
	for(i=0;i<n;i++)
	{
		a[i] = Integer.parseInt(args[i+2]);
	}
	int l=a.length;
	int flag=0;
		for( i=0;i<l;i++)
		{
			if(a[i]==key)
			{
				flag=1; break;
			}
		}
		if(flag==1)
		{
			System.out.println("the element with the index "+key+" --> "+i); 
		}
		else
		{
			System.out.println("-1"); 
		}
	
	}
}

