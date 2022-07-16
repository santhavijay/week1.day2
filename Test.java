package week1.day2;

import java.util.Arrays;

public class Test {
 int s=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Santha";
int len = s.length();
System.out.println(len);
if(s.equals("Santha"))
{
	System.out.println("equal");
}
else
{
	System.out.println("not equal");
}

if(s.equalsIgnoreCase("santha"))
{
	System.out.println("equal");
}
else
{
	System.out.println("not equal");
}
String newstring = s.concat("kumari");
System.out.println(newstring);

char index = s.charAt(3);
System.out.println(index);
char[]name = s.toCharArray();
System.out.println(name);
if(s.contains("th"))
	System.out.println("sub string is present");
else
	System.out.println("not present");


	}

}
