package ArraysMile;
public class Largein3By3MatrixArr {
	public static void main(String[] args) 
	{
		int n=args.length;
		int i,j,k=0;
		int a[][]=new int[3][3];
		int max = a[0][0];
		if(n<9)
		{
			System.out.println("please enter 9 elements");
		}
		else
		{
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					a[i][j]=Integer.parseInt(args[k++]);
				}
			}
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					if(a[i][j]>max)
					{
						max=a[i][j];
					}
				}
			}
			System.out.println("the biggest number in the given array is "+ max);
		}
	}
}
