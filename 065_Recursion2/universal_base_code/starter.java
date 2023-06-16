import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Give me a number for fibonacci");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			System.out.print(fibonacci(i)+" ");
		}

	}
	public static int fibonacci(int x)
	{
		if(x==1)
		{
			return 1;
		}
		else if(x==0)
		{
			return 0;
		}
		else
		{
			return fibonacci(x-1)+fibonacci(x-2);
		}
	}
}
