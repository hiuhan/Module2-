import java.util.Scanner;

public class Demsoluongsvthido {
    public static void main(String[] args) {
        int dodai;
        int[] arr;
        Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Nhập độ dài: ");
        dodai = sc.nextInt();
        if (dodai > 30)
            System.out.println("Độ dài k đc vượt quá 30");
    } while (dodai > 30);
      arr = new int[dodai];
      int i = 0;
      while (i < arr.length){
          System.out.println("Nhập số điểm cho học sinh " + (i +1) + ": ");
          arr[i] = sc.nextInt();
          i++;
      }
      int count = 0;
        System.out.println("Danh sách điểm: ");
        int j;
        for (j = 0; j < arr.length; j++){
            System.out.println(arr[j] + "\t");
            if (arr[j] > 7 && arr[j] <= 10){
                count++;
            }
        } System.out.println("Số học sinh đỗ bài thi là: "+count);
    }
}
