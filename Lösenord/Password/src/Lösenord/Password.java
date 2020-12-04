package Lösenord;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		String username, password;
		
		System.out.print("Enter your username: ");
		username = input.nextLine();
		
		System.out.print("Enter your password: ");
		password = input.nextLine();
		
		if (username.equals("Jacob") && (password.equals("Ekberg"))) {
			System.out.println("Welcome Jacob.");
		}else {
			System.out.println("Wrong password, try again");
			
		}
		
		
		

	}

}
