package FlowcontrolMile;

public class MaleFemaleAgeInterst {

	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[1]);
		     if(args[0].contentEquals("Male"))
				{
					if(a>=1 && a<=58)
					{
						System.out.println("the percentage of interest is 8.4%");
					}
					else
					{
						System.out.println("the percentage of interest is 10.5%");
					}
				}
		if(args[0].contentEquals("Female"))
		{
			if(a>=1 && a<=58)
			{
				System.out.println("the percentage of interest is 8.2%");
			}
			else
			{
				System.out.println("the percentage of interest is 9.2%");
			}
		}

	}

}
