import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> larry = new ArrayList<Integer>();
		addValuesInt(larry, 10);
		printValuesInt(larry);
		randomizeArrayList(larry);
		printValuesInt(larry);
	}
	
	public static void randomizeArrayList(ArrayList<Integer> arr){
		// Iterate through the entire ArrayList
		// Randomly choose a spot in the ArrayList
		// Swap the current value you're on with the random location you generated
		// Print out which 2 values are being swapped.
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*25));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		System.out.println();
		System.out.println("------------------------------");
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
		System.out.println();
		System.out.println("------------------------------");
	}
}
