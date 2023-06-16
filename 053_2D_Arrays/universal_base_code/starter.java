import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [][] arr=new int [3][4];
		for(int i=0;i<arr.length;i++)
		{
			for(int x=0;i<arr[0].length;x++)
			{
				arr[i][x]=(int)(Math.random()*11+1);
				System.out.print(arr[x][i]);
			}
			System.out.println("");
		}


		
	}
}
