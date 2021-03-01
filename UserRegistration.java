import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static String firstName(Scanner sc) {
		System.out.print("First Name: ");
		String firstName = sc.nextLine();
		boolean fn = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(firstName).matches();
		if(fn == true) {
			return firstName;
		}
		else{
			System.out.println("Invalid First Name");
			return firstName(sc);
		}
	}

	public static String lastName(Scanner sc) {
		System.out.print("Last Name: ");
		String lastName = sc.nextLine();
		boolean ln = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(lastName).matches();
		if(ln == true) {
			return lastName;
		}
		else{
			System.out.println("Invalid Last Name");
			return lastName(sc);
		}
	}

	public static String email(Scanner sc) {
		System.out.print("Email: ");
		String email = sc.nextLine();
		boolean eml = Pattern.compile("^abc.[a-z]{1,}@bl.co.[a-z]{2,3}$").matcher(email).matches();
		if(eml == true) {
			return email;
		}
		else{
			System.out.println("Invalid Email Address");
			return email(sc);
		}
	}

	public static String phoneNo(Scanner sc) {
		System.out.print("Phone No: ");
		String phoneNo = sc.nextLine();
		boolean pn = Pattern.compile("^[0-9]{1,3} [0-9]{10}$").matcher(phoneNo).matches();
		if(pn == true) {
			return phoneNo;
		}
		else{
			System.out.println("Invalid Phone No");
			return phoneNo(sc);
		}
	}

	public static String password(Scanner sc) {
		System.out.print("Password: ");
		String password = sc.nextLine();
		boolean pass = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?.,])[a-zA-Z0-9!@#$%^&*?.,]{8,}").matcher(password).matches();
		if(pass == true) {
			return password;
		}
		else{
			System.out.println("Invalid Password");
			return password(sc);
		}
	}

	public static void toPrint(String fName, String lName, String email, String pNo, String pass){
		System.out.println(fName+" , "+lName+" , "+email+" , "+pNo+" , "+pass);
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String fName = firstName(sc);
		String lName = lastName(sc);
		String email = email(sc);
		String phoneNo = phoneNo(sc);
		String pass = password(sc);
		toPrint(fName,lName,email,phoneNo,pass);
	}
}

