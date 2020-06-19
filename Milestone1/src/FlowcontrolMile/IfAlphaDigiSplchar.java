package FlowcontrolMile;

public class IfAlphaDigiSplchar {

	public static void main(String[] args) 
	{
		String str = args[0];
		char ch = str.charAt(0);
		
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Charcter");
		}
	}

}
