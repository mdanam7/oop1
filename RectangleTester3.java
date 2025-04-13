public class RectangleTester3 {
    public static void main(String[] args) {


        Rectangle r1 = new Rectangle(50,10);
        Rectangle r4 = new Rectangle(r1);
        r4.setHeight(5);
        r4.setWidth(1);
System.out.println(r4.getHeight());
        System.out.println(r4.getWidth());
        System.out.println(r1);
    }
}
