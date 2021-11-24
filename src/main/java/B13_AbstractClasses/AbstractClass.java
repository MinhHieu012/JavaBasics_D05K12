
package B13_AbstractClasses;

// abstract base class
abstract class Shape {

    // fields
    double x;
    double y;

    // constructors

    public Shape(double x) {
        this.x = x;
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // methods
    abstract void area();

    void show() {
        System.out.println("Shape");
    }


}

class Rectangle extends Shape {

    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    void area() {
        double a = x * y;
        System.out.println("Area of rectangle: " + a);
    }

    @Override
    void show() {
        System.out.println("Rectangle");
    }

}

//

public class AbstractClass {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.show();
        rectangle.area();

    }

}
