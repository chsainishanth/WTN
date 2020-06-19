package ArraysMile;

public class AsciiToChar 
{
	public static void main(String[] args) 
	{
		int a[]=new int[] {65,66,90,97,98,122,36,37};
		int i,l;
		l=a.length;
		for(i=0;i<l;i++)
		{
			char ar = (char)a[i];
			System.out.print(ar+" ");
		}
	}
}
