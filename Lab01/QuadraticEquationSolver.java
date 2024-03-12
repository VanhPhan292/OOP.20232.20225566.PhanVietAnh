import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            double a, b, c, result;
            System.out.print("a = ");
            a = scanner.nextDouble();
            System.out.print("b = ");
            b = scanner.nextDouble();
            System.out.print("c = ");
            c = scanner.nextDouble();
            
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("The equation has infinite solution.");
                    } else {
                        System.out.println("The equation has no solution.");
                    }
                } else {
                    result = -(c) / b;
                    System.out.printf(result);
                }
            } else {
                double delta = Math.pow(b, 2) - 4 * a * c;
                if (delta < 0) {
                    System.out.println("The equation has no solution.");
                } else if (delta == 0) {
                    result = -(b) / 2 * a;
                    System.out.printf(result);
                } else {
                    double result1 = (-b + Math.sqrt(delta)) / 2 * a;
                    double result2 = (-b - Math.sqrt(delta)) / 2 * a;
                    System.out.println("The quadratic equation has two distinct solutions.");
                    System.out.printf(result1, result2);
                }
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid value.");
        } finally {
            System.exit(0);
        }
    }
}