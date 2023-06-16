import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Give me a word");
		String word=sc.nextLine();
		
		System.out.println(createPalindrome(word));
	}
	
	public static String createPalindrome(String word){
		if(word.length()<=0)
		{
			return "";
		}
		else
		{
			return word.substring(word.length()-1,word.length())+createPalindrome(word.substring(0,word.length()-1))+word.substring(word.length()-1,word.length());
		}
		// Input: potato
		// Output: otatoppotato
		// Recursive Algorithm
		// Base case - If one letter is left, just print the letter out twice
		// While the String word has more than one letter, break off the last letter and add it to the string returned
	}
}
