package day02;

public class Geometry {
    public static void main(String[] args) {

        double a = 10;
        double b = 5;

        Rectangle rectangle1 = new Rectangle(a,b);
        Rectangle rectangle2 = new Rectangle(3,7);
        Rectangle rectangle3 = new Rectangle(5.4,8.2);

        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle3.calculateArea());

    }
}
