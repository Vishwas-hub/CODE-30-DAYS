package com.company;

public class abstract2 {



    public static void main(String[] args) {

        Area a = new Area();

        a.RectangleArea();

        a.SquareArea();

        a.CircleArea();

    }

}



abstract class Shape{


}



class Area extends Shape{

    double Area=0;



    public void RectangleArea(){

        Area = (float) 5.5 * (float) 7.0;

        System.out.println("Area of rectangle is: "+Area);

    }



    void SquareArea(){

        Area = (float) 5.0 * (float) 5.0;

        System.out.println("Area of Square is: "+Area);

    }



    void CircleArea(){

        Area = ((float) 4 * (float) 4)*3.14;

        System.out.println("Area of Circle is: "+Area);

    }

}