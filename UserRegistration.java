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
      boolean eml = Pattern.compile("^abc.[a-z]{1,}@bl.co.[a-z]{2,3}$").matcher(checkEmail).matches();
      if(eml == true) {
         String email = checkEmail;
         System.out.println("Email Address is "+email);
      }
      else {
         System.out.println("Invalid Email Address");
      }
   }

	 public static void phoneNo(Scanner sc) {
      System.out.print("Phone No: ");
      String checkPhoneNo = sc.nextLine();
      boolean pn = Pattern.compile("^[0-9]{1,3} [0-9]{10}$").matcher(checkPhoneNo).matches();
      if(pn == true) {
         String phoneNo = checkPhoneNo;
         System.out.println("Phone No is "+phoneNo);
      }
      else {
         System.out.println("Invalid Phone No");
      }
   }

	 public static void password(Scanner sc) {
      System.out.print("Password: ");
      String checkPass = sc.nextLine();
      boolean pass = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}").matcher(checkPass).matches();
      if(pass == true) {
         String password = checkPass;
         System.out.println("Password is "+password);
      }
      else {
         System.out.println("Invalid Password");
      }
   }

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		firstName(sc);
		lastName(sc);
		email(sc);
		phoneNo(sc);
		password(sc);
	}
}

