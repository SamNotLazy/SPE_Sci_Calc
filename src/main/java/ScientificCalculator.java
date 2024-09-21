
import java.util.Scanner;

public class ScientificCalculator {

    public static double squareRoot(double i) {
        return Math.sqrt(i);
    }

    public static double naturalLog(double i) {
        return Math.log(i);
    }

    public static double power(double i,double  i1) {
        return Math.pow(i,i1);
    }

    // Factorial function
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        do {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Square root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");
//            while(!sc.hasNextInt()){}
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    if (num1 >= 0) {
                        result = squareRoot(num1);
                        System.out.println("Square root of " + num1 + " is: " + result);
                    } else {
                        System.out.println("Error: Square root of negative number is undefined!");
                    }
                    break;
                case 2:
                    System.out.print("Enter an integer number: ");
                    int numFact = sc.nextInt();
                    if (numFact >= 0) {
                        result = factorial(numFact);
                        System.out.println(numFact + "! = " + (long)result);
                    } else {
                        System.out.println("Error: Factorial of negative number is undefined!");
                    }
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    if (num1 > 0) {
                        result = naturalLog(num1);
                        System.out.println("Natural logarithm ln(" + num1 + ") = " + result);
                    } else {
                        System.out.println("Error: Logarithm is only defined for positive numbers!");
                    }
                    break;
                case 4:
                    System.out.print("Enter the base (x): ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter the exponent (b): ");
                    num2 = sc.nextDouble();
                    result = power(num1, num2);
                    System.out.println(num1 + "^" + num2 + " = " + result);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }


}
