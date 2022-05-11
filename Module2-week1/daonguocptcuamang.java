import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class daonguocptcuamang {
    private static int j;

    public static void main(String[] args) {
        int dodai;
        int[] array;
        Scanner mang = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài: ");
            dodai = mang.nextInt();
            if (dodai > 20)
                System.out.println("Size does not exceed 20");
        } while (dodai > 20);
        array = new int[dodai];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = mang.nextInt();
            i++;
        }
        System.out.println("Element in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[dodai - 1 - j];
            array[dodai - 1 - j] = temp;
        }
        System.out.println("Reverse array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

