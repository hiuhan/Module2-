import java.util.Scanner;

public class ktranamnhuan {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int year;
        System.out.println("Nhập số năm");
        year = a.nextInt();
        if (year % 100 ==0) {
            if (year % 400 == 0) {
                System.out.print("Là năm nhuận" +year);
            } else {
                System.out.print("Không là năm nhuận" +year);
               }
            } else {
            System.out.println("Là năm nhuận");
        }
        }
    }

