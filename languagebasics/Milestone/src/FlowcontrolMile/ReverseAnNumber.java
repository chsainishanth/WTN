package FlowcontrolMile;

public class ReverseAnNumber 
{

	public static void main(String[] args) 
	{
	int n = Integer.parseInt(args[0]);
	int t,sum=0;
	t=n;
	while(t>0) 
	{
		int r=t%10;
		sum=sum*10+r;
		t=t/10;
	}
	System.out.println(sum);
    }
}
