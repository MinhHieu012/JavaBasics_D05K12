/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B09_OOP;

/**
 *
 * @author huynq
 */
public class ClassObjectMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.color = "white";
        myCar.weight = 2_000.0f;

        System.out.println(myCar.color);
        System.out.println(myCar.weight);

        myCar.run();
        myCar.brake();

        // other object
        Car mySecondCar = new Car("red", 1000);
        System.out.println(mySecondCar.color);
        System.out.println(mySecondCar.weight);
        mySecondCar.run();
        mySecondCar.brake();

        // 3rd car
        Car myThirdCar = new Car();
        myThirdCar.insert("black", 3000);
        System.out.println(myThirdCar.color);
        System.out.println(myThirdCar.weight);
        myThirdCar.run();
        myThirdCar.brake();
    }

}

class Car {

    // fields
    // public, private, protected, default
    String color;
    float weight;

    // constructors
    public Car() {

    }

    public Car(String color, float weight) {

        this.color = color;
        this.weight = weight;
    }

    // methods
    public void run() {

        System.out.println("Running...");
    }

    public void brake() {

        System.out.println("Braking...");
    }

    // get, set
    void insert(String c, float w) {

        this.color = c;
        this.weight = w;
    }
}

// MotoCycle // fields + methods
// myMotoCycle


/*
1. class Rectangle
    - fields: chieu dai, chieu rong (length, width)
    - methods: input(), calculatePerimeter(), calculateArea()
User nhap vao chieu dai, chieu rong
In ra dien tich, chu vi (perimeter, area)
*/