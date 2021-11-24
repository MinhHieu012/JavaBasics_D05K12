/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B07_basics;

import java.util.Scanner;

/**
 *
 * @author huynq
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input data
        System.out.println("Enter number of elements: ");
        int number = sc.nextByte();

        int[] numbers = new int[number];

        for (int i = 0; i < number; ++i) {

            System.out.println("Enter element[" + (i + 1) + "]: ");
            numbers[i] = sc.nextInt();
        }

        // for test only
        System.out.println("---------------------------");
//        for (int i = 0; i < number; ++i) {
//            System.out.println(numbers[i]);
//        }
//        System.out.println(factorial(4));

        int sum = 0;
        int sumFact = 0;
        for (int i = 0; i < number; ++i) {

            sum = sum + numbers[i];

            sumFact = sumFact + factorial(numbers[i]);
        }

        System.out.println("Summary: " + sum);
        System.out.println("Factorial Summary: " + sumFact);


        // sort

        for (int i = 0; i < number - 1; ++i) {

            for (int j = i + 1; j < number; ++j) {

                if (numbers[i] > numbers[j]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        System.out.println("-----------------------------");
        for (int i = 0; i < number; ++i) {
            System.out.println(numbers[i]);
        }

    }

    private static int factorial(int n) {

        int fact = 1;
        for (int i = 1; i <= n; ++i) {

            fact = fact * i;
        }

        return fact;
    }

}

/*
12. Nhap vao so nguyen n, sau do nhap array co n so nguyen. [4, 9, 7,...]
- Tinh va in ra tong cua cac phan tu (4 + 7 + 9 + ... =?)
- Tinh va in ra tong cac giai thua (4! + 7! + 9! + ...) (n! = n * (n-1) *... *2 *1)
- Sap xep mang theo thu tu tang dan.

for (i=1 n) {
    for (j= i n) {
        arr[i] arr[j]
    }
}

factorial(int n) => n!
for () => s = s + factorial()

13. Nhap vao mot day so nguyen cach nhau bang 1 dau cach. Viet chuong trinh tach
day so thanh mang cac so nguyen, tim so max, min va in ra man hinh.
14 17 19 85 ... => [14, 17, 19 , 85, ...]
*/
