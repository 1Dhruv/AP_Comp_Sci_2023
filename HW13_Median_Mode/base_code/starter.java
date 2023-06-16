import java.util.*;

class starter {
	public static void main(String args[ ]){
		int [ ] arr1 = {1, 2, 3, 4, 5, 6, 7};
		int [ ] arr2 = {1, 2, 3, 10, 11, 12};
		int median1 = getMedian(arr1);  	//The value of median1 is 4.
		int median2 = getMedian(arr2);	//The value of median2 is 3.

		int [ ] arr3 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
		int [ ] arr4 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
		int [ ] arr5 = {2, 6, 4, 5, 3, 8, 9, 1};
		int mode1 = getMode(arr3);		//The value of mode1 is 5.
		int mode2 = getMode(arr4);		//The value of mode2 is 7
		int mode3 = getMode(arr5);		// The value of mode3 is -1.

		System.out.println("Median1 - " + median1);
		System.out.println("Median2 - " + median2);
		System.out.println("Mode1 - " + mode1);
		System.out.println("Median1 - " + mode2);
		System.out.println("Median1 - " + mode3);
	}

	public static int getMedian(int [] array){

	}

	public static int getMode(int [] array){

	}
}

