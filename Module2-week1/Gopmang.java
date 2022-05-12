public class Gopmang {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6};
        int[] arr2 = {5,4,3,2,1};
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i]=arr2[i];
        }
        for (int a:arr3) {
            System.out.println("Phần tử của arr3: "+ a);
        }
    }
}
