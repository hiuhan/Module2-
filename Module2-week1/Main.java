import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều dài: ");
        double height = scanner.nextDouble();
        Hcn rectangle = new Hcn(width, height);
        System.out.println("Hình chữ nhật của bạn \n"+ rectangle.display());
        System.out.println("Chu vi của hình chữ nhật là: "+ rectangle.getPerimeter());
        System.out.println("Diện tích của hình chữ nhật là: "+ rectangle.getArea());
    }
}
