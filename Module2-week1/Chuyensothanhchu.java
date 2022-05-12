import java.util.Scanner;
public class Chuyensothanhchu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số: ");
        String num = sc.nextLine();
        int check;
        StringBuilder kq = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            check = Integer.parseInt(String.valueOf(num.charAt(i)));
            switch (check){
                case 0:
                    kq.append("Không ");
                    break;
                case 1:
                    kq.append("Một ");
                    break;
                case 2:
                    kq.append("Hai ");
                    break;
                case 3:
                    kq.append("Ba ");
                    break;
                case 4:
                    kq.append("Bốn ");
                    break;
                case 5:
                    kq.append("Năm ");
                    break;
                case 6:
                    kq.append("Sáu ");
                    break;
                case 7:
                    kq.append("Bảy ");
                    break;
                case 8:
                    kq.append("Tám ");
                    break;
                case 9:
                    kq.append("Chín ");
                    break;
            }
        }
        System.out.println(kq);
    }
}
