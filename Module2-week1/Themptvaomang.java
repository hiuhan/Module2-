import java.util.Scanner;

public class Themptvaomang {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 1, 2, 6, 7, 5, 8, 9, 4, 6};
        int a;
        int index;
        int[] arr2;

        Scanner input = new Scanner(System.in);

        System.out.println("Phần tử muốn thêm: ");
        a = input.nextInt();

        System.out.println("Vị trí muốn thêm");
        index = input.nextInt();

        arr2 = new int[arr1.length+1];

        for (int i = 0; i < arr1.length+1; i++) {
            if (i<index) {
                arr2[i] = arr1[i];
            } else if (i==index){
                arr2[i] = a;
            }else {
                arr2[i] = arr1[i-1];
            }
        }
        for (int b: arr1) {
            System.out.println("Phần tử của arr1: " + b);
        }
        System.out.println("\n \n");
        for (int c: arr2) {
            System.out.println("Phần tử của arr2: " + c);
        }
    }
}