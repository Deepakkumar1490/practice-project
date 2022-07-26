package ArthimeticCalculator;
import java.util.*;
import java.util.Scanner;
public class ArthimeticCal {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ArthimeticOperation calc=new ArthimeticOperation();
		while(true) {
		int result;
		System.out.println("Enter 1. Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
		System.out.println("Choose one");
		int choice=sc.nextInt();
		switch(choice){
			case 1 :result=calc.addition(a, b);
					System.out.println("Addition="+result);
					break;
			case 2 :result=calc.subtraction(a, b);
					System.out.println("Subtraction="+result+);
					break;
			case 3 :result=calc.multiplication(a,b);
			        System.out.println("Multiplication="+result+);
			        break;
			case 4 :result=calc.division(a, b);
			        System.out.println("Division="+result);
			        break;
			case 5:System.out.println("You enter wrong input");
			       return;
	}
}
}
}