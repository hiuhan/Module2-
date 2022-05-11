public class timmintrongmang {
    public static void main(String[] args) {
        int[][] arr = {
                {25,10,8,6,7,9},
                {8,10,15,20,33},
                {46,20,12,24,32},
                {32,4,16,7},
        };

        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Số bé nhất là: " + min);
    }
    }
