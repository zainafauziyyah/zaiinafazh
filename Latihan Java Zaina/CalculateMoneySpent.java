import java.util.Scanner;

import javax.lang.model.element.Name;
public class CalculateMoneySpent {
public static void main(String[] args) {
String name;
int moneySpent; 
double average;
int total;
int totalDay = 7;
Scanner input = new Scanner(System.in);
System.out.println("Calculate Your Money!!!\n");
System.out.println("Hey, What is your name?");
name = input.nextLine();
System.out.println("How much money did you spend at the club on Monday"); 
moneySpent = input.nextInt();
total = moneySpent;
System.out.println("How much money did you spend at the club on Tuesday");
moneySpent = input.nextInt();
total = total + moneySpent;
System.out.println("How much money did you spend at the club on Wednesday");
moneySpent = input.nextInt();
total = total + moneySpent;
System.out.println("How much money did you spend at the club on Thursday");
moneySpent = input.nextInt();
total = total + moneySpent;
System.out.println("How much money did you spend at the club on Friday");
moneySpent = input.nextInt();
total = total + moneySpent;
System.out.println("How much money did you spend at the club on Saturday");
moneySpent = input.nextInt();
total = total + moneySpent;
System.out.println("How much money did you spend at the club on Sunday");
moneySpent = input.nextInt();
total = total + moneySpent;
average = (double) total/totalDay;
System.out.println("The Calculation Results: ");
System.out.println("Hi " + name);
System.out.println("Your total expenditure at the club this week is $ " + total); 
System.out.println("With ɲan Average daily expenditure of $ "+ average);
  
 }
}