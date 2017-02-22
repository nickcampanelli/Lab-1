// Jack Maloy, Lorry Chang and Nick Campanelli


package lab1;

//Scanner to take in user input
import java.util.Scanner;

public class Retierment {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Questions that are answered by user than assigned to variable 
		
		System.out.println("Years to work:");
		double yearsWorked = input.nextDouble();
		
		System.out.println("Annual return while working:");
		double annualReturnBefore = input.nextDouble();
		
		while(annualReturnBefore > 20 || annualReturnBefore < 0){
			System.out.println("This is an invalid number please return a number in between 0 and 20:");
		    annualReturnBefore = input.nextDouble();
		}
		
		System.out.println("Years retiered:");
		double yearsRetiered = input.nextDouble();
		
		System.out.println("Annual return after retierment:");
		double annualReturnAfter = input.nextDouble();
		while(annualReturnAfter > 3 || annualReturnAfter < 0){
			System.out.println("This is an invalid number please return a number in between 0 and 3:");
		    annualReturnAfter = input.nextDouble();
		}
		
		
		System.out.println("Requiered Income:");
		double requiredIncome = input.nextDouble();
		
		System.out.println("MonthlySSI:");
		double monthlySSI = input.nextDouble();		
	
		double num1 = PresentValue(yearsRetiered, annualReturnAfter, requiredIncome, monthlySSI);
		double num2 = FutureValue(yearsWorked, annualReturnBefore, num1);
		
	
		System.out.printf("You will need to save $%.2f",num1);
		System.out.println();
		
		System.out.printf("To get this save $%.2f", num2);
		System.out.println(" per month.");
		
					
		
		}
	
	public static double PresentValue(double a, double b, double c, double d){
		
		double x = (c - d)*((1-(1/Math.pow((1+ (b/1200)), (a*12)))))/(b/1200);
		return x;
		
	}
	
	public static double FutureValue(double a, double b, double c){
		
		double x = c * (b/1200)/((Math.pow(1 + (b/1200), a*12))-1);
		return x;
	}
	
	
	}
	
		
	
	


