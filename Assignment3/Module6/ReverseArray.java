package Module6;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,4,3,7,5};

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}