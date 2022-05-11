import java.util.Scanner;

public class tinhlaisuat {
    public static void main(String[] args) {
        double tien = 1.0;
        int thang = 1;
        double laisuat = 1.0;
        Scanner tinhlai = new Scanner(System.in);
        System.out.println("Nhập số tiền");
        tien = tinhlai.nextDouble();
        System.out.println("Nhập số tháng");
        thang = tinhlai.nextInt();
        System.out.println("Nhập % lãi suất");
        laisuat = tinhlai.nextDouble();
        double tonglai = 0;
        for (int i = 0; i < thang; i++){
            tonglai += tien * (laisuat/100)/12 * thang;
        } System.out.println("Tổng lãi là: "+tonglai);
    }
}
