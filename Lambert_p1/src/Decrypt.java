import java.util.*;

public class Decrypt {
	//Decryption function: tests a num and reverts the value to pre-encryption 
	public static void Decrypt() {
		 System.out.println("Decryption online, please enter a code you you like decrypted");
		
		 int length = 4;
			char[] arrayD = new char[4];
			
			Scanner scan = new Scanner(System.in);
			
			String  Decrypt = scan.nextLine();
			int[]   values = new int[Decrypt.length()]; 
			 
			
			for (int i=0; i<values.length; i++) {
			     values[i] = Decrypt.charAt(i) - '0';
			}
			
		//revert values according to user input
		for(int i = 0; i<values.length; i++) {
		
		values[i] = (values[i]+3)%10;
	
		}
		
		//print out values
		System.out.println("The decrypted values is:");
		System.out.println(values[2]);
		System.out.println(values[3]);
		System.out.println(values[0]);
		System.out.println(values[1]);

		
}}
