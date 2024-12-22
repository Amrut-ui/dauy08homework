package day08homework;

public class GrossSalaryi {
	

	    public static void main(String args) {
	        double basicSalary = 15000; // Example basic salary

	        double grossSalary = calculateGrossSalary(basicSalary);

	        System.out.println("Gross Salary: " + grossSalary);
	    }

	    public static double calculateGrossSalary(double basicSalary) {
	        double da, hra;

	        if (basicSalary <= 10000) {
	            da = 0.8 * basicSalary;
	            hra = 0.2 * basicSalary;
	        } else if (basicSalary <= 20000) {
	            da = 0.9 * basicSalary;
	            hra = 0.25 * basicSalary;
	        } else {
	            da = 0.95 * basicSalary;
	            hra = 0.3 * basicSalary;
	        }

	        return basicSalary + da + hra;
	    }
	}


