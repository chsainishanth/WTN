package ArraysMile;
public class Arr2_2Reverse
{
	public static void main(String[] args) 
	{
		if(args.length<4)
		{
			System.out.println("please enter 4 elements");
		}
		else
		{
			int i,j;
			int a[][]=new int[2][2];
			int e=0;
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					a[i][j] = Integer.parseInt(args[e++]);
				}
			}
			for(i=1;i>=0;i--)
			{
				for(j=1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		
	}

}
 