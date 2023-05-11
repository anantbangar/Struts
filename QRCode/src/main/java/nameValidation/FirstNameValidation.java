package nameValidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameValidation {
	private static void firstNameValidate(String name) {

		if (name==null || name.isEmpty()) {
			System.out.println("Please enter the First name");
		}

		else if (onlyOneChar(name)) {
			System.out.println("only one character is not allowed");
		}

		else if (ifNumeric(name)) {
			System.out.println("numeric string is not allowed");
		}

		else if (name.length() > 5) {
			System.out.println("not allowed more than 5 characters");
		}

		else if (isSpaceAtStart(name)) {
			System.out.println("!@poiu34"
					+ "!@");
		}
		
		else if (!(isOnlyOneSpclChar(name))) {
			System.out.println("only one ' special character is allowed ");
		}

		else {
			System.out.println("Entered String is " + name);

		}

	}

	private static boolean isSpaceAtStart(String name) {
	
		if(name.startsWith(" "))
			return true;
		else
			return false;
	}

	private static boolean isOnlyOneSpclChar(String name) {
		
		Pattern p = Pattern.compile("^[a-zA-Z']*$");
		
		Matcher matcher = p.matcher(name);

		return matcher.matches();
	}

	private static boolean ifNumeric(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private static boolean onlyOneChar(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') {
				count++;
			}
		}

		if (count == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter First Name ");

		Scanner sc = new Scanner(System.in);

		String name;

		name = sc.nextLine();

		firstNameValidate(name);
	}

}
