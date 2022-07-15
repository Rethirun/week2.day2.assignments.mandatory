package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Pseudo Code:
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)

		d)split the words and have it in an array

		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

		 */

		String test="I am a software tester";
		String[] arrSplit=test.split(" ");

		for(int i=0;i<arrSplit.length;i++) {
			
			if(i%2==0) {

				char[] charArray = arrSplit[i].toCharArray();

				for(int j=charArray.length-1;j>=0;j--) {
					System.out.print(charArray[j]);
				}

			}else
				System.out.print(" "+arrSplit[i]+" ");
		}

	}

}
