import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class timmaxtrongmang {
    public static void main(String[] args) {
        int dodai;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài: ");
            dodai = sc.nextInt();
            if (dodai > 20)
                System.out.println("Ko được vượt quá 20");
        } while (dodai > 20);
        array = new int[dodai];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i +1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Danh sách giá trị: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất là " + max + " ở vị trí "+ index);
    }
}