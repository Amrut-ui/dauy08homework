package day08homework;
import java.util.Scanner;

public class FunctionUsingFindPrime {
	

	

	    public static void main(String args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        scanner.close();
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false; // Numbers less than or equal to 1 are not prime
	        }

	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // If divisible by any number other than 1 and itself, it's not prime
	            }
	        }

	        return true; // If no divisors found, it's prime
	    }
	}


