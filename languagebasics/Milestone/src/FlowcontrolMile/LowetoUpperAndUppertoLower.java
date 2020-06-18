package FlowcontrolMile;

public class LowetoUpperAndUppertoLower {

	public static void main(String[] args) 
	{
		String str = args[0];
	    char ch = str.charAt(0);
	 if(ch>='a' && ch<='z')
	 {
		 int s = (int)ch ;
		  s = s - 32;
	     char cha = (char)s;  
		 System.out.println(ch+"->"+cha);
	 }
	 else if(ch>='A' && ch<='Z')
	 {
		 int b = (int)ch; 
		  b = b + 32;
		  char cha = (char)b;
		 System.out.println(ch+"->"+cha);
	 }
	 }

}
