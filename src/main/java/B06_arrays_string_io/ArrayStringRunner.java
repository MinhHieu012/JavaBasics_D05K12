/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package B06_arrays_string_io;

import java.util.Scanner;

/**
 *
 * @author huynq
 */
public class ArrayStringRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userInput = sc.nextLine();

        System.out.println(firstCharToUpperCase(userInput));

    }

    public static String firstCharToUpperCase(String str) {

        char[] chars = str.toLowerCase().toCharArray();

        boolean found = false;

        for (int i = 0; i < chars.length; ++i) {

            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i])) {
                found = false;
            }
        }

        return String.valueOf(chars);
    }

}

/*
11. Nhap vao ten day du (ngUyen VaN a ads  sfdadf ) --
Viet CT doi ten thanh chuan (Nguyen Van A)
*/