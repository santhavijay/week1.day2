package week1.day2;

import java.util.Arrays;

public class Findminmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//input data
		int[]data = {23,1,2,3,56,4,3,67,33,22};
		System.out.println("Number of datas in an array" + data.length);
		Arrays.sort(data);
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		System.out.println("Minimum val is " + data[0]);
		System.out.println("Max val is " + data[data.length-1]);
	}

}
