import pkg.*;
public class starter{
	public static void main(String[] args){
		// Create a for each loop for the given Integers 2D Array
		Integer[][] arr1 = {{9,8,7},{6,5,4},{3,2,1}};
		for(Integer [] x:arr1)
		{
			for(Integer y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}

		System.out.println();
		// Create a for each loop for the given Dog 2D Array
		Dog[][] arr2 = new Dog[5][4];
		populateDog(arr2);
		for(Dog [] x:arr2)
		{
			for(Dog y:x)
			{
				System.out.println(y);
			}
			System.out.println();
		}
		System.out.println();

		// Create a for each loop to print each letter of the String 2D array on a new line
		String[][] arr3 = {{"abc","def"},{"ghi", "jkl"},{"mno","pqr"}};
		for(String [] x:arr3)
		{
			for(String y:x)
			{
				for(char z:y.toCharArray())
				{
					System.out.print(z+" ");
				}
			}
			System.out.println();
		}
	}

	
	public static void populateDog(Dog[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				arr[i][j] = new Dog();
			}
		}
	}
}
