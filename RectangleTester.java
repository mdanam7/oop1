public class RectangleTester {
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle();
        r1.setHeight(2);
        r1.setWidth(3);
        Rectangle r2=new Rectangle();
        r2.setHeight(7);
        r2.setWidth(2);
        System.out.println("r1 HEIGHT:"+r1.getHeight());
        System.out.println("r1 WIDTH:"+r1.getWidth());
        System.out.println("r2 HEIGHT:"+r2.getHeight());
        System.out.println("r2 WIDTH:"+r2.getWidth());
        r1.area();
        r2.area();
        System.out.println(r1.area());
        System.out.println(r2.area());
        r1.increaseHeight();
        r2.increaseWidth(2);
        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r1.area(2,2));
    }
}
