
import java.util.Scanner;
public class MethodsUse {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("==Simple Factorial Concept==");
		System.out.print("Enter an integer:");
		int digits=input.nextInt();
		int fact=1;
		
		System.out.println("Factorial of : "+digits);
		for(int i=1;i<=digits;i++)
		{
			fact=fact*i;
		}
						 System.out.print(digits+"!"+" = "+fact);
	}



}
