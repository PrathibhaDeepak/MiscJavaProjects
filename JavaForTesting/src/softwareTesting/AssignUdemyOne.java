package softwareTesting;

import java.util.Scanner;

public class AssignUdemyOne {

	public static void main(String[] args) {
		/*int num1, num2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value num1: ");
		num1 = input.nextInt();
		System.out.println("Enter value num2: ");
		num2 = input.nextInt();
		
		/*if(num1 > num2) {
			System.out.printf("First entered number %d is the largest number", num1);
		}
		else {
			System.out.printf("Second number %d is the largest number%d",num2);
			
			}
		}

	
		String result = (num1>num2)?"num1 larger " : "num2 larger";
		System.out.println(result);*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int month = input.nextInt();
		switch(month){
		
		case 1:
			System.out.println("January");break;
		case 2 : System.out.println("February");break;
		case 3 : System.out.println("March"); break;
		case 4 : System.out.println("April"); break;
		case 5 : System.out.println("May");break;
		case 6 : System.out.println("June");break;
		case 7 : System.out.println("July");break;
		case 8 : System.out.println("August"); break;
		case 9 : System.out.println("September"); break;
		case 10 : System.out.println("October");break;
		case 11 : System.out.println("November");break;
		case 12 : System.out.println("December"); break;
		default : System.out.println("Invalid"); 
		input.close();
		
		
		
		
		
		
			
			
		}
		
		
	
	

}

	private static void Switch(String month) {
		// TODO Auto-generated method stub
		
	}}
