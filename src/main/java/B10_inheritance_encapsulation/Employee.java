/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_inheritance_encapsulation;

/**
 *
 * @author huynq
 */
public class Employee {

    // encapsulation
    private String name;
    private String email;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Employee() {
    }

    

    // get, set
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}

/*
2. Them phone
Thay doi constructor, so dien thoai => in ra so DT moi

*/