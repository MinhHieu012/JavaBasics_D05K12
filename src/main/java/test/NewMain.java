package test;

import java.util.ArrayList;
import java.util.List;

public class NewMain {

    public static void main(String[] args) {

//        int a = 41;
//        char c = (char) a;
//        System.out.println(Character.valueOf(c));

//        char c = '[';
//        int a = Character.getNumericValue(c);
//        System.out.println(a);

        String str = "(((}{]][[)";
        char[] arr = str.toCharArray();
        for (var c: arr) {
            System.out.println(c);
        }

    }

}
