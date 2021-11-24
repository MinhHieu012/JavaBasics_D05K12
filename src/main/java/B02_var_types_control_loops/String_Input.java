/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B02_var_types_control_loops;

import java.util.Scanner;

/**
 *
 * @author huynq
 */
public class String_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int number = sc.nextByte(); // 27 '\n'

        sc.nextLine();

        String[] names = new String[number];
        int[] ages = new int[number];
        String[] klasses = new String[number];

        int[] maths = new int[number];
        int[] physicals = new int[number];
        int[] chemystries = new int[number];
        int[] avgs = new int[number];

        for (int i = 0; i < number; ++i) {

            System.out.println("Enter name: ");
            names[i] = sc.nextLine();

            System.out.println("Enter age: ");
            ages[i] = sc.nextByte();

            sc.nextLine();

            System.out.println("Enter class: ");
            klasses[i] = sc.nextLine();

            //...

            if (avgs[i] >= 8) {
                //.....
            } else if (avgs[i] >= 6.5) {
                //...
            } else if (avgs[i] >= 5) {
                //...
            }
        }
    }

}

// Nhap so luong sv: 2, 3
// Nhap vao ho ten sv, tuoi, lop, diem cac mon Toan, Ly, Hoa
// in ra diem TB va xep hang >= 8 gioi; 8 > TB >= 6.5 kha; 6.5 > TB > 5 trung binh
// Tim va in ra ban co diem TB max

/*
    int[] arr; arr[index]
    String[] name;
    int[]    age;
    String[] klass;

    name[i], age[i], klass[i], math[i], ... avg[i]

*/


