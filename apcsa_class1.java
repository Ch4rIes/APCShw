import java.util.*;
//author: Charles Zuo

public class apcsa_class1{
    public static void quadratic_formula(int a , int b , int c){
        // a is the coefficient of X^2 
        // b is the coefficient of X 
        // c is the coefficient of 1
        // to calculate the roots we use the quadratic formula
        double r1 = (((-b + Math.sqrt(b * b - 4 * a * c)) / 2 / a));
        // r1 is the first root of the equation
        double r2 = (((-b - Math.sqrt(b * b - 4 * a * c)) / 2 / a));
        // r2 is the second root of the equation
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + a + " x^2 + " + b + "x +" + c +" are " + r1 + " and " + r2);
    }
    public static void slope(double x1 , double x2 , double y1 , double y2){
        // (x1 , y1) are the coordinate of the first point
        // (x2 , y2) are the coordinate of the second point
        System.out.println("SLOPE FORMULA");
        double slp = (y2 - y1 ) / (x2 - x1);
        // slope is the slope of the given linear equation
        System.out.println("A line connecting the points (" + x1 +", " + y1 +") and (" + x2 +", " +y2 +") has a slope of "+ slp);
    }
    public static void mid_point(double x1 , double x2 , double y1 , double y2){
        // (x1 , y1) are the coordinate of the first point
        // (x2 , y2) are the coordinate of the second point
        System.out.println("MIDPOINT FORMULA");
        double mid_x = (x2 - x1) / 2 + x1;
        // mid_x is the x coordinate of the midpoint
        double mid_y = (y2 - y1) / 2 + y1;
        // mid_y is the y coordinate of the midpoint
        System.out.println("The midpoint between ("+ x1 +", " + y1 +") and (" + x2 +", " +y2 +") " + "is " + "(" + mid_x + ", "+mid_y + ")");
    }
    public static void arithmetic(double f , double diff , double k){
        // f is the first term of the arithmetic series
        // diff is the difference between terms
        // k is the number of terms in the series
        double sum = ((f + f + (k - 1) * diff) * k / 2);
        // the "sum" is the sum of the arithmetic series
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first 5 terms of an arithmetic series that starts with " + f + " and increases by " + diff + " is " + sum);
    }
    public static void geometric(double g1 , double r , double k){
        // g1 is the first term of the geometric series
        // r is the rate of change between terms
        // k is the number of cases we will calculate sum
        double sum = g1 * (1 - Math.pow(r , k)) / (1 - r);
        // the "sum" is the sum of the geometric series
        System.out.println("SUM OF AN GEOMETRIC SERIES");
        System.out.println("The sum of the first " + (int)k + " terms of an geometric series that starts with " + g1 + " and increases by a rate of " + r + " is " + sum);
    }
    public static void main(String[] args){
        // quadratic formula
        quadratic_formula(1 , 5 , 6);
        // slope formula
        slope(0 , 2 , 0 , 3);
        // midpoint formula
        mid_point(0 , 2 , 0 , 3);
        // arithmetic
        arithmetic(1.0 , 1.0 , 5);
        // geometric sum
        geometric(1.0 , 2 , 3);
    }
}
