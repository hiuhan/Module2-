import java.util.Scanner;

public class Thietkemenu {
    public static void main(String[] args) {
        int luachon = -1;
        Scanner menu = new Scanner(System.in);
        while (luachon != 0);
        System.out.println("Menu");
        System.out.println("1.Vẽ hình tam giác");
        System.out.println("2.Vẽ hình vuông");
        System.out.println("3.Vẽ hình chữ nhật");
        System.out.println("0. Thoát");
        System.out.println("Nhập lựa chọn của bạn: ");
        luachon = menu.nextInt();
        switch (luachon) {
            case 1:
                System.out.println("Vẽ hình tam giác");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Vẽ hình vuông");
                System.out.println("* * * * * ");
                System.out.println("* * * * * ");
                System.out.println("* * * * * ");
                System.out.println("* * * * * ");
                System.out.println("* * * * * ");
                break;
            case 3:
                System.out.println("Vẽ hình chữ nhật");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Không chọn");
        }
    }
}
