package com.company;

import java.util.Scanner;
public class Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum,ctr;
        int i,m,mm,nn;
        System.out.print("Input the value of x :");
        int x = sc.nextInt();
        System.out.print("Input number of terms : ");
        int n = sc.nextInt();
        sum =x; m=-1;
        System.out.println("The values of the series: ");
        System.out.print(x);
        for (i = 1; i < n; i++)
        {
            ctr = (2 * i + 1);
            mm = (int) Math.pow(x, ctr);
            nn = mm * m;
            System.out.print(","+nn);
            sum = sum + nn;
            m = m * (-1);
        }
        System.out.println("\nSum is: "+sum);

    }

}