package FlowcontrolMile;

public class CharInAlphabetOrder {

	public static void main(String[] args) 
	{
		char a = args[0].charAt(0);
		char b = args[1].charAt(0);
		if(b>a)
		{
			System.out.println(a+","+b);
		}
		else
		{
			System.out.println(b+","+a);
		}

	}

}
