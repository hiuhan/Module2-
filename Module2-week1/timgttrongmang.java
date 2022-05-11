import java.util.Scanner;

public class timgttrongmang {
    public static void main(String[] args) {
        String[] hocsinh = {"Hieu", "CongAnh", "Duong", "Binh", "Hai", "Minh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên học sinh: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < hocsinh.length; i++) {
            if (hocsinh[i].equals(input_name)) {
                System.out.println("Thứ tự của học sinh " + input_name + " là: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
        System.out.println("Ko tìm thấy " + input_name + " trong danh sách");
    }
}
