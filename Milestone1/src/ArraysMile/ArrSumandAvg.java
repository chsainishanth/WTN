package ArraysMile;

public class ArrSumandAvg {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5};
		int l=a.length;
		int sum=0;
		for(int i=0;i<=l;i++)
		{
			sum=sum+i;
		}
		int avg=sum/l;
		System.out.println("sum of numbers ="+sum);
		System.out.println("avg of numbers ="+avg);

	}

}
