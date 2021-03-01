import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void firstName(Scanner sc) {
		System.out.print("First Name: ");
		String checkFName = sc.nextLine();
		boolean fn = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(checkFName).matches();
		if(fn == true) {
			String firstName = checkFName;
			System.out.println("First Name is "+firstName);
		}
		else {
			System.out.println("Invalid First Name");
		}
	}

	 public static void lastName(Scanner sc) {
      System.out.print("Last Name: ");
      String checkLName = sc.nextLine();
      boolean ln = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(checkLName).matches();
      if(ln == true) {
         String lastName = checkLName;
         System.out.println("Last Name is "+lastName);
      }
      else {
         System.out.println("Invalid Last Name");
      }
   }

	 public static void email(Scanner sc) {
      System.out.print("Email: ");
      String checkEmail = sc.nextLine();
      boolean eml = Pattern.compile("^abc.[a-z]{3,}@bl.co.[a-z]{2,3}$").matcher(checkEmail).matches();
      if(eml == true) {
         String email = checkEmail;
         System.out.println("Email Address is "+email);
      }
      else {
         System.out.println("Invalid Email Address");
      }
   }

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		firstName(sc);
		lastName(sc);
		email(sc);
	}
}

