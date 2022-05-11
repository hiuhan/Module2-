public class timmaxtrongmang2chieu {
    public static void main(String[] args) {
        int[][] arr = {
                { 3,4,57,42,14,20},
                { 9,8,35,2,25},
                { 49,53,12,24,57},
                { 22,23,43,25,59},
        };
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất là: " + max);
    }
}