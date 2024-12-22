package day08homework;

public class Circumferenceofthecircle {
	

	    public static void main(String[] args) {
	        double radius = 5.0; // Example radius

	        double circumference = calculateCircumference(radius);

	        System.out.println("Circumference of the circle: " + circumference);
	    }

	    public static double calculateCircumference(double radius) {
	        return 2 * Math.PI * radius;
	    }
	}


