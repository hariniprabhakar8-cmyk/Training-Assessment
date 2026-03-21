package Module4;
public class StringComparison {

    public static void main(String[] args) {

        String s = "Hello";

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" Java");

        System.out.println(s);
        System.out.println(sb);
        System.out.println(sbf);
    }
}
