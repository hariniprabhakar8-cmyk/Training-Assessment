package Module9;
public class Subsets {

    static void subset(String str, String current){
        if(str.length() == 0){
            System.out.println(current);
            return;
        }

        subset(str.substring(1), current + str.charAt(0));
        subset(str.substring(1), current);
    }

    public static void main(String[] args) {
        subset("abc", "");
    }
}