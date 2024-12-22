package day08homework;
import java.util.Scanner;

public class FunctionEvenOdd {
	

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        String result = checkEvenOdd(number);
	        System.out.println(result);

	        scanner.close();
	    }

	    public static String checkEvenOdd(int num) {
	        if (num % 2 == 0) {
	            return "Even";
	        } else {
	            return "Odd";
	        }
	    }
	}

