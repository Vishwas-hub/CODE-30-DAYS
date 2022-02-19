package com.company;
import java.util.Scanner;
public class SumEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        for(int i =1; i<=n;i++ ) {
            if(i % 2 == 0) {
                even = even + i;
            }
            else {
                odd = odd + i;
            }
        }
        System.out.println("Sum of even numbers is: "+even);
        System.out.println("Sum of odd numbers is: "+odd);



    }

}
