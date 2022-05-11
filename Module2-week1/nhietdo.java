import java.util.Scanner;
public class nhietdo {
    public static void main(String[] args) {
        double F = 1.0;
        double C = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1 : Đổi từ độ C sang độ F");
        System.out.println("2 : Đổi từ độ F sang độ C");
        System.out.println("Nhập lựa chọn");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhập độ C");
                C = input.nextDouble();
                F = C * 1.8 + 32;
                System.out.println("Độ F là: " + F);
                break;
            case 2:
                System.out.println("Nhập độ F");
                F = input.nextDouble();
                C = (F - 32)/1.8;
                System.out.println("Độ C là: " + C);
                break;
        }
    }
}

