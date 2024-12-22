package day08homework;

public class AreaofTringle {
	

	    public static void main(String[] args) {
	        double base = 5.0;
	        double height = 3.0;

	        double area = calculateArea(base, height);

	        System.out.println("Area of the triangle: " + area);
	    }

	    public static double calculateArea(double base, double height) {
	        return 0.5 * base * height;
	    }
	}


