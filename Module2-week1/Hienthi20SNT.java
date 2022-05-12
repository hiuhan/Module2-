public class Hienthi20SNT {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (count < 20){
            boolean check = true;
            if (i >= 2){
                for (int j = 2; j <= i/2; j++){
                    if (i % j == 0){
                        check = false;
                    }
                }
                if (check){
                    System.out.println(i);
                    count++;
                }
            }
            i++;
        }
    }
}
