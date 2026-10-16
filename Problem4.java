import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("Not a valid triangle");
        } else {
            if (a == b) {
                if (b == c) {
                    System.out.println("Equilateral");
                } else {
                    System.out.println("Isosceles");
                }
            } else {
                if (a == c || b == c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }
    }
}
