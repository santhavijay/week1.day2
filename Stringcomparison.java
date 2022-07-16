package week1.day2;

public class Stringcomparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="santha";
String s2="santha";

String s3= new String();
s3="hello";
String s4 = new String();
s4= "hello";

int a=10,b=10;

if(s1.equals(s2))
{
	System.out.println("reference comparison passed");
}
else
	System.out.println("failed");
if(s1==s2)
{
	System.out.println("both are equal");
}
else
{
	System.out.println("not equal");
}

String mainStirng = "Hello";
String subString = "Ell";
if(mainStirng.contains(subString))
{
	System.out.println("I am present");
}
else
{
	System.out.println("not present");
}

System.out.println(mainStirng.charAt(1));
}

}
