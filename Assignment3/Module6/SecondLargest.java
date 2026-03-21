package Module6;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5,9,3,7,2};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }
            else if(arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
        }

        System.out.println("Second Largest: " + second);
    }
}