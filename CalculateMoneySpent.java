import java.util.Scanner;

public class CalculateMoneySpent{
	public static void main(String[] args){
		String name;
		int moneySpent;
		double average;
		int total;
		int totalDay = 7;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Your Money!!!\n");
		
		System.out.println("Hey, What is your name?");
		name = input.nextLine();
		
		System.out.println("How much money did you spend at the pub on Monday?");
		moneySpent = input.nextInt();
		
		total = moneySpent;
		
		System.out.println("How much money did you spend at the pub on Tuesday?");
		moneySpent = input.nextInt();
		
		total = total + moneySpent;
		
		System.out.println("How much money did you spend at the pub on Wednesday?");
		moneySpent = input.nextInt();
		
		total = total + moneySpent;
		
		System.out.println("How much money did you spend at the pub on Thursday?");
		moneySpent = input.nextInt();
		
		total = total + moneySpent;
		
		System.out.println("How much money did you spend at the pub on Friday?");
		moneySpent = input.nextInt();
		
		total = total + moneySpent;
		
		System.out.println("How much money did you spend at the pub on Saturday?");
		moneySpent = input.nextInt();
		
		total =total + moneySpent;
		
		System.out.println("How much money did you spend at the pub on Sunday?");
		moneySpent = input.nextInt();
		
		total = total + moneySpent;
		
		average = (double) total/totalDay;
		
		System.out.println("The Calculation Results:");
		
		System.out.println("Hi Pete.");
		System.out.println("Your total expenditure at the pub this week is $ " + total);
		System.out.println("With an Average daily expenditure of $ " + average);
	}
}
		
		
		