import java.util.Scanner;

public class KtraSNT {
    public static void main(String[] args) {
        Scanner snt = new Scanner(System.in);
        System.out.print("Nhập số");
        int number = snt.nextInt();
        if (number < 2){
            System.out.println(number+ "Ko phải SNT");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number+ "Ko phải SNT");
            else
                System.out.println(number+ "Là SNT");
        }

    }
}
