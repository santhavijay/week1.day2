package week1.day2;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 11;
		boolean res;
		res = isPrime(number);
		if (res)
			System.out.println("prime");
		else
			System.out.println("not a prime");
	}



public static boolean isPrime(int num)
{
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{

			return false;
		}

	}
	return true;
}

}