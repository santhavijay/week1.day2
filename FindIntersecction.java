package week1.day2;

public class FindIntersecction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {3,2,11,4,6,7};
int b[]= {1,2,8,4,9,7};
int outerloop = a.length;
int innerloop = b.length;
for(int i=0;i<outerloop;i++)
{
	for(int j=0;j<innerloop;j++)
	{
		if(a[i]==b[j])
			System.out.println(a[i]);
		else
			continue;
	}
}
	}

}
