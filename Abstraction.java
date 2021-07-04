package com.prakash;

import java.util.Scanner;

class Rectangle{
    double length,breadth;
    public double rectangleArea(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
        return this.length * this.breadth;
    }
}

public class Abstraction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle obj = new Rectangle();
        System.out.println(obj.rectangleArea(sc.nextDouble(), sc.nextDouble()));
    }
}
