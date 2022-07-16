package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "madam";
		
		String rev = "";
		char ch[] = original.toCharArray();
		int len= ch.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);	

		if(original.equals(rev))
		{
			System.out.println("these strings are equal.Palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
