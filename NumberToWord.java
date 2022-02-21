package com.company;

import java.util.Scanner;
class Code {
    public static final String [] units = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
            "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    public static final String [] tens = {"","","Twenty","thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public static String convert(final int n) {

        if(n<20) {
            return units[n];
        }
        else if( n<100) {
            return tens[n/10]+((n%10 != 0) ?" " : "")+units[n%10];
        }
        else if(n<1000) {
            return units[n/100]+" Hundred "+((n%100 != 0) ?" " : "")+convert(n%100);
        }
        else if(n<100000) {
            return units[n/1000]+" Thousand "+((n%1000 != 0) ?" " : "")+convert(n%1000);
        }
        else{
            return null;
        }
    }
}

public class NumberToWord{
    public static void main(String[] args) {
        Code c = new Code();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =  sc.nextInt();
        System.out.println(Code.convert(n));

    }
}