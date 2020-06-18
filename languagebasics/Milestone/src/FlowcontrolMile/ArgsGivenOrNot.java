package FlowcontrolMile;

public class ArgsGivenOrNot {

	public static void main(String[] args)
	{
		int i;
		int a = args.length;
	    if(a==0)
	    {
	    	System.out.println("No Values");
	    }
	    if(a!=0)
	    {
	    	
	    	for(i=0;i<a-1;i++)
	    	{
	    		System.out.print(args[i]+",");
	    	}
	    	System.out.print(args[i]);
	    }
	}

}
