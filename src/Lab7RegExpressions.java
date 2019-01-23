import java.util.Scanner;

public class Lab7RegExpressions {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		//name -- take input + print whether valid
		System.out.println("Please enter your name.");
		String userName = scnr.nextLine();
		//scnr.nextLine();

		if (!(nameValidator(userName))) {
			System.out.println(userName + " is not valid.");
		} else {
			System.out.println(userName + " is valid.");
		}
		
		
		//email -- take input + print whether valid
		System.out.println("Please enter your email address.");
		String eMailAddress = scnr.nextLine();
		//scnr.nextLine();
		
		if (!(eMailAddressValidator(eMailAddress))) {
			System.out.println(eMailAddress + " is not valid.");
		} else {
			System.out.println(eMailAddress + " is valid.");
		}

		
		//phone number -- take input + print whether valid
		System.out.println("Please enter your phone number.");
		String phoneNum = scnr.nextLine();
		//scnr.nextLine();
		
		if (!(phoneNumValidator(phoneNum))) {
			System.out.println(phoneNum + " is not valid.");
		} else {
			System.out.println(phoneNum + " is valid.");
		}

		
		//date -- take input + print whether valid
		System.out.println("Please enter a date.");
		String date = scnr.nextLine();
		//scnr.nextLine();
		
		if (!(dateValidator(date))) {
			System.out.println(date + " is not valid.");
		} else {
			System.out.println(date + " is valid.");
		}

		
	}

	private static boolean nameValidator(String userName) {
		if (userName.length() > 30) {
			return false;

		} else if (userName.matches("[A-Z][a-z]*")) {
			return true;

		} else if (userName.matches("([A-Z]{1,2}[a-z]*\\s[A-Z][a-z]*)")) {  //accepts as valid common nicknames such as "JD" or "TJ"
			return true;

		} return false;

	}
	
	private static boolean eMailAddressValidator(String eMailAdress) {
		if (eMailAdress.matches("[\\w]{5,30}[@][\\w]{5,10}[.][a-z]{2,3}")) {
			return true;

		} return false;

	}

	private static boolean phoneNumValidator(String phoneNum) {
		if (phoneNum.matches("\\d{3}-\\d{3}-\\d{4}")) {
			return true;

		} return false;

	}
	
	private static boolean dateValidator(String date) {
		//did not have time to figure out how to validate for specific months: ie., Feb. 30 is valid in this regex
		if (date.matches("((0[1-9])|([12][0-9])|(3[01]))\\/((0[1-9])|(1[012]))\\/(19|20)\\d\\d")) { 
			return true;

		} return false;

	}
	

}
