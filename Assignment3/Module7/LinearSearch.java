package Module7;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,7,1,8,9};
        int key = 7;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}