import java.util.Scanner;

public class timuocsochung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner uocchung = new Scanner(System.in);
        System.out.println("Nhập số a:");
        a = uocchung.nextInt();
        System.out.println("Nhập số b:");
        b = uocchung.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0||b ==0){
            System.out.println("Không có ước chung lớn nhất");
            }while (a != b){
            if (a > b)
            a = a - b;
                else
            b = b -a;
        }
        System.out.println("Ước chung lớn nhất là: " + a);
    }
}
