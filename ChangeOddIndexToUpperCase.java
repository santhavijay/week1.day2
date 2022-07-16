package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String changeme="testleaf";
char ch[] = changeme.toCharArray();
int len = ch.length;
String str = " ";
for(int i=0;i<len;i++)
{
	int findOdd = i%2;
	if(findOdd==0)
	{
		ch[i]=Character.toUpperCase(ch[i]);
		str=str+ch[i];
	}
	else
		str=str+ch[i];
}System.out.println(str);
	}

}
