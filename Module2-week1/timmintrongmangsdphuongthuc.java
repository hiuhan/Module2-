import java.util.Scanner;
public class timmintrongmangsdphuongthuc {
    public static void main(String[] args) {
        int dodai;
        int[] arr;
        Scanner input =new Scanner(System.in);
        System.out.println("Nhập độ dài: ");
        dodai = input.nextInt();

        arr = new int[dodai];
        for (int i = 0; i < dodai; i++) {
            System.out.println("Nhập phần tử " + i + " : ");
            arr[i] = input.nextInt();
        }

        System.out.println("Giá trị nhỏ nhất của mảng là: " + minValue(arr));

    }

    public static int minValue(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i] ) {
                min =  a[i];
            }
        }
        return min;
    }
    }
