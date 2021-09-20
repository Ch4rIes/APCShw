import java.util.Scanner;

public class apcsa_class1{
    public static void quadratic_formula(int a , int b , int c){
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + a + " x^2 " + b + "x " + c +" are " + (((-b + Math.sqrt(b * b - 4 * a * c)) / 2 / a)) + " and " + ((-b - Math.sqrt(b * b - 4 * a * c)) / 2 / a));
    }
    public static void slope(double x1 , double x2 , double y1 , double y2){
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + x1 +", " + y1 +") and (" + x2 +", " +y2 +") has a slope of "+ (y2 - y1 ) / (x2 - x1));
    }
    public static void mid_point(double x1 , double x2 , double y1 , double y2){
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between ("+ x1 +", " + y1 +") and (" + x2 +", " +y2 +")" + "is " + "(" + Double.toString((x2 - x1) / 2 + x1) + ", "+Double.toString((y2 - y1) / 2 + y1) + ")");
    }
    public static void arithmetic(double f , double diff , double k){
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first 5 terms of an arithmetic series that starts with " + f + " and increases by " + diff + "is " +((f + f + (k - 1) * diff) * k / 2));
    }
    public static void geometric(double g1 , double r , double k){
        System.out.println("SUM OF AN GEOMETRIC SERIES");
        System.out.println("The sum of the first " + (int)k + " terms of an geometric series that starts with " + g1 + " and increases by a rate of" + r + "is " + g1 * (1 - Math.pow(r , k)) / (1 - r));
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
