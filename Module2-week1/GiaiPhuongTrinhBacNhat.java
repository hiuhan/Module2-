import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("a: ");
        a = sc.nextDouble();
        System.out.println("b: ");
        b = sc.nextDouble();
        System.out.println("c: ");
        c = sc.nextDouble();
        if (a != 0) {
             double answer = (c - b)/a;
             System.out.println("Equation pass with x = " +answer);
    } else {
        if (b==c) {
            System.out.print("The solution is all ");
        } else {
            System.out.print("No solution!");
            }
        }
    }
}
