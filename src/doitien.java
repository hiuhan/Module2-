import java.util.Scanner;

public class doitien {
    public static void main(String[] args) {
        double USD;
        Scanner sc = new Scanner(System.in);
        System.out.println("Số tiền muốn đổi là");
        USD = sc.nextDouble();
        double quydoi = USD * 23000 ;
        System.out.println("Tiền Việt:" +quydoi);
    }
}
