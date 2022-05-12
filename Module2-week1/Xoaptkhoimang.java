import java.util.Scanner;

public class Xoaptkhoimang {
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 3, 5, 4, 6, 9, 2, 1};
        int a;
        int[] arr2;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Phần tử cần xóa là: ");
        a = input.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            if (a == arr1[i]) {
                count++;
            }
        }
        arr2 = new int[arr1.length - count];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if ((a != arr1[i])) {
                arr2[j] = arr1[i];
                j++;
            }
        }
        for (int b: arr1) {
            System.out.println("Element of arr1: " + b);
        }
        System.out.println("\n \n");
        for (int c: arr2) {
            System.out.println("Element of arr2: " + c);
        }
    }
}
