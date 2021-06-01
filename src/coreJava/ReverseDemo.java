package coreJava;

public class ReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String UpperCase = "Aniket";
			String s = UpperCase.toLowerCase();
			
			String r = "";
			
			for(int i=s.length()-1;i>=0;i--) {
				
				r=r+s.charAt(i);
		//		System.out.println(r);
				
			}
			System.out.println(r);
			
			if(s.equals(r)) 
			{
				System.out.println("It's a Palindrome");
			}
			else
			{
				System.out.println("It's not an palindrome");
			}
	}

}
