import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr=new int[20];
		genArray(arr);
		printArray(arr);
		System.out.println(getMin(arr,0));
		System.out.println(getMax(arr,0));

	}

	public static int getMin(int[] arr, int i){
		// Parameter - arr is your array that you're searching through
		// Parameter - i is the value you're currently on
		// Return - Return the minimum of the entire array
		// Base Case - When i reaches your length-1, return the minimum of the last 2 numbers
		// While you still have numbers left, find the smaller of the number you're on and the getMin of the rest of the array (not including the number you're on)
		
		if(i==arr.length-1)
		{
			return arr[i];
		}
		int rest=getMin(arr,i+1);
		if(arr[i]<rest)
		{
			return arr[i];
		}
		return rest;
	}

	public static int getMax(int[] arr, int i){
		// Parameter - arr is your array that you're searching through
		// Parameter - i is the value you're currently on
		// Return - Return the maximum of the entire array
		// Base Case - When i reaches your length-1, return the maximum of the last 2 numbers
		// While you still have numbers left, find the larger of the number you're on and the getMin of the rest of the array (not including the number you're on)
		
		if(i==arr.length-1)
		{
			return arr[i];
		}
		int rest=getMax(arr,i+1);
		if(arr[i]>rest)
		{
			return arr[i];
		}
		
		return rest;
		
	}

	public static void genArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100);
		}
	}

	public static void printArray(int[] arr){
		System.out.println("------------------------");
		for(int i: arr){
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("------------------------");
	}
}
