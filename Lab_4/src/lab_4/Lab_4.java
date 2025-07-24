package lab_4;

public class Lab_4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("x       = "+r.getX());
        System.out.println("y       = "+r.getY());
        System.out.println("width   = "+r.getWidth());
        System.out.println("height  = "+r.getHeight());
        System.out.println("===================");
        System.out.println("After Using setter methods : ");
        System.out.println("===================");
        r.setX(100);
        r.setY(200);
        r.setWidth(300);
        r.setHeight(400);
        System.out.println("x       = "+r.getX());
        System.out.println("y       = "+r.getY());
        System.out.println("width   = "+r.getWidth());
        System.out.println("height  = "+r.getHeight());
    }
}
    
