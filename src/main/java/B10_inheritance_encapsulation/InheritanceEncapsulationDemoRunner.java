/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package B10_inheritance_encapsulation;

/**
 *
 * @author huynq
 */
public class InheritanceEncapsulationDemoRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee employee = new Employee("John", "jdoe@gmail.com");

        // System.out.println(employee.name); // can not access to private field
        System.out.println(employee.getName());

        employee.setName("Joe");
        System.out.println(employee.getName());

//        System.out.println(employee.email);
        System.out.println(employee.getEmail());


    }

}
