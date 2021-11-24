package B12_Polymorphism;

// method overloading / compile time polymorphism
class Example {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}


public class CompileTimePolymorphism {

    public static void main(String[] args) {

        Example example = new Example();

        System.out.println(example.add(10, 20));
        System.out.println(example.add(10.0, 20.0));
        System.out.println(example.add(10, 20, 30));

    }

}

