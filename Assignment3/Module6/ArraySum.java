package Module6;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {12,40,6,8};
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}