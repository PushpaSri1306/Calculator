import java.util.Scanner;
public class Calculator {
	public static void main(String[] args){
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("Enter the operator (+,-,*,/):");
		char option = sc.next().charAt(0);
		double c = 0;
		switch (option){ 
		case '+':
			c = a + b;
			break;
		case '-':
			c = a - b;
			break;
		case '*':
			c = a * b;
			break;
		case '/':
			c = a / b;
			break;
		default:
			System.out.println("Invalid input");
		}
		System.out.println(c);
        sc.close();
	}
}
