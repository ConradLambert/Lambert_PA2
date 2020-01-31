import java.util.*; 
public class Encrypt {

	//System.out.println("Encryption online, Please enter a code you would like to encrypt with a space between each number");
		//Take values from user
		
	public void Encrypt() {	
	int length = 4;
	char[] arrayE = new char[4];
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Encryption online, please enter a code you would like encrypted"); 
	
	//convert string to array
	String  Encrypt = scan.nextLine();
	int[]   values = new int[Encrypt.length()]; 
	 
	
	for (int i=0; i<values.length; i++) {
	     values[i] = Encrypt.charAt(i) - '0';
	}
	
	// print out values
	System.out.println("The Encrypted value is:");
	System.out.println((values[2]+7)%10);	
	System.out.println((values[3]+7)%10);	
	System.out.println((values[0]+7)%10);	
	System.out.println((values[1]+7)%10);	
	
	
}}




