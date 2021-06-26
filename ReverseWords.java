import java.util.Scanner;

/**This program reads a word and prints the word in reverse.
 */

public class ReverseWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a word to reverse: ");
		
		String str = in.next();
		String Reverse = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			Reverse += str.charAt(i);
		}
		System.out.print(Reverse);
	}

}
