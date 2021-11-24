
package B13_AbstractClasses;

interface Line {

    //fields
    // public static final
    public static final double pi = 3.14;

    // methods
    // public abstract
    public abstract void draw();
}

class Rectangle implements Line {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }

}

public class Interfaces {

    public static void main(String[] args) {

        Line rectangle = new Rectangle();
        rectangle.draw();

    }

}
