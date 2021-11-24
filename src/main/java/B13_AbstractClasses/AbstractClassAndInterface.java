
package B13_AbstractClasses;

interface Bank {
    double rateOfInt(); // lai suat tien gui
}

abstract class Customer {

    abstract void showInfo();
}

class VCB extends Customer implements Bank {

    @Override
    void showInfo() {
        System.out.println("VCB");
    }

    @Override
    public double rateOfInt() {
        return 5.5;
    }

}


public class AbstractClassAndInterface {

    public static void main(String[] args) {

        VCB b = new VCB();
        b.showInfo();
        System.out.println(b.rateOfInt());

    }

}
