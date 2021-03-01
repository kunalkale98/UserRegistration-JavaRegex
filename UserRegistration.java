import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void firstName(Scanner sc) {
		System.out.print("First Name: ");
		String checkFName = sc.nextLine();
		boolean b=Pattern.compile("^[A-Z]{1}[a-z]{2}$").matcher(checkFName).matches();
		if(b == true) {
			String firstName = checkFName;
			System.out.println("First Name is "+firstName);
		}
		else {
			System.out.println("Invalid First Name");
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		firstName(sc);
	}
}

