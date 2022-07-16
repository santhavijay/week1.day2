package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] inputData = {2,3,2,1,1,5,6,4,8,7,5,6,12,8};
int length = inputData.length;
Arrays.sort(inputData);
for(int i=0;i<length-1;i++)
{
	if(inputData[i]==inputData[i+1])
	{
		System.out.println("Duplicated numbers are " + inputData[i]);
	}


}
	}

}
