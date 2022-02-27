package com.company;

public class abstract1 {



    public static void main(String[] args) {

        Cats c = new Cats();

        c.cats();

        Dogs d = new Dogs();

        d.dogs();


    }

}



abstract class Animals{


}



class Cats extends Animals{



    public void cats(){

        System.out.println("Cat's Meow: ");

    }

}



class Dogs extends Animals{


    public void dogs(){

        System.out.println("Dogs bark: ");

    }

}


