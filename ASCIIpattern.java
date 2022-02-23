package com.company;

public class ASCIIpattern {

    public static void main(String[] args) {

        char ch=65;

        int rows = 4;


        for(int i=1; i<=rows; i++){
            for(int j=rows; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(ch++);
            }
            ch--;
            for(int m=1; m<i; m++){
                System.out.print(--ch);
            }
            System.out.println();
        }
    }

}
