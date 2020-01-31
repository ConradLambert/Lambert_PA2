import java.util.*;

public class Lambert_P2 {

	public static void main(String[] args) {
		int one;
		Menu1(); 
		
	}

//Create menu
public static void Menu1() {
	
	System.out.println("Hello, please enter a value\n"
			+ "1 to encrypt a number\n"
			+ "2 to decrypt a number\n"
			+ "3 to end the program\n");
	
	//Get unput from user
	Scanner scan = new Scanner(System.in);
	 int num1 = scan.nextInt();
	 
	 
	 
	 //if 1, call encrypt
	 	if(num1 == 1) {
	 		Encrypt obj1 = new Encrypt();
	 		obj1.Encrypt();
	 Menu1();
	 }
	 	//if 2, call decrypt
	 	else if(num1 == 2)	 {
			 Decrypt obj2 = new Decrypt();
		 		obj2.Decrypt();
			 Menu1();
	 }
	 
	 
	 
	 // if 3, exit
		 else if(num1 == 3) {
			 System.exit(0);
		 }
	 
	 
	 
	 // other, recall the menu
		 else {
			 System.out.println("Please enter a valid value");
			 Menu1();
		 }
	
}
}