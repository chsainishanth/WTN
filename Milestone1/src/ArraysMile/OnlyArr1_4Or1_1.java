package ArraysMile;
public class OnlyArr1_4Or1_1 {
public static void main(String[] args) 
	{
	 int n = args.length;
	 int i,j=0;
	 int a[]=new int[n];
	 for(i=0;i<n;i++)
	 {
		 a[i]=Integer.parseInt(args[i]);
	 }
	 for(i=0;i<n;i++)
	 {
		 if(a[i]!=1&&a[i]!=4)
		 {
			 j=1;
		 }
	 }
	 if(j==0)
	 {
		 System.out.println("--> true");
	 }
	 else
	 {
		 System.out.println("--> false");
	 }
	
	 }
}
