package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * Pseudo Code

		 * a) Declare A String value as"madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 

		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		String str="Madam";
		String rev="";
		boolean isPalindrome=true;

		for(int i=str.length()-1;i>=0;i--) {

			rev=rev+str.charAt(i);

			if(str.equalsIgnoreCase(rev)) {

				System.out.println("The given string "+str+" is Palindrome");
				isPalindrome=false;
				break;
			}

		}

		if(isPalindrome) {
			System.out.println("The given string "+str+" is not Palindrome");
		}
	}

}
