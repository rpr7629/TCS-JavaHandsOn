package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point(sc.nextInt(),sc.nextInt());
        Point p2 = new Point(sc.nextInt(),sc.nextInt());
        System.out.format( "%.3f",findDistance(p1,p2));

    }

    public static double findDistance(Point p1, Point p2)
    {
        double X = Math.pow(p1.getX() - p2.getX(),2);
        double Y = Math.pow(p1.getY() - p2.getY(),2);
        return Math.sqrt(X + Y);
    }
}

class Point
{

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y ){
        this.x = x;
        this.y = y;
    }

}