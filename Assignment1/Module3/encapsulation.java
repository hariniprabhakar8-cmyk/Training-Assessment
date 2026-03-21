package Module3;

public class encapsulation {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        encapsulation obj = new encapsulation();
        obj.setName("ABCD");

        System.out.println("Name: " + obj.getName());
    }
}