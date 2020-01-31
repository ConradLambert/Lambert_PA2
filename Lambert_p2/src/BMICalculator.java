import java.util.*;
public class BMICalculator {
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();	
			app.readuserData();
			app.calculateBmi();
			app.displayBmi();
		
		
		}

		

		public void readuserData() {
			// TODO ask for imperial or metric
			System.out.println("Welcome to the BMI calculator, enter 1 for imperial or 2 for Metric ");
			
		}

		public float calculateBmi() {
			// TODO get weight and height from user
			Scanner scan = new Scanner(System.in);
			int weight, height, system;
			float BMI;
			BMI = 0;
			height=1;
			weight=1;
			system = scan.nextInt();
			if(system == 1) {
				System.out.println("Please enter your weight in pounds and your height in inches");
			
			weight = scan.nextInt();
			height = scan.nextInt();
			
			
			
			if(weight <= 0 || height <=0) //exit if neg value
				System.exit(0);
			
			BMI = 703*weight/(height*height); //Calc BMI
			}
			
			
			else if(system == 2) {
				System.out.println("Please enter your weight in kilograms and your height in meters");	
				
				weight = scan.nextInt();
				height = scan.nextInt();
				
			
				
				if(weight <= 0 || height <=0) //exit if neg value
					System.exit(0);
				
				BMI = weight/(height*height); //Calc BMI
				}
			
						else {
								calculateBmi();
						}
			
			
			
			
			System.out.println ("Your BMI is");
			System.out.println (BMI	);
			return BMI;
		}
			



		public void displayBmi () {
			// TODO print BMI and categories
			System.out.println ("Underweight =< 18.5\nNormal weight = 18.5-24.9\nOverweight = 25 - 29.9\nObese = 30 or higher");
		}
	

}
