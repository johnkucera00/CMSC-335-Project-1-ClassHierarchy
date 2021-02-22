/*
* File: Circle.java
* Author: John Kucera
* Date: October 30, 2020
* Purpose: This Java program is meant to accompany Menu.java and is dedicated
* to constructing Circle objects. Circle inherits attributes from 
* TwoDimensionalShape (parent) and Shape (grandparent) and has unique attributes
* double circleRadius and double circumference. Circle(double circleRadius)
* constructor uses the argument as radius and uses that to determine area and
* circumference. calculateCircleArea(double circleRadius) contains the formula to
* calculate area and calculateCircumference(double circleRadius) contains the
* formula to calculate circumference.
*/

// Circle class, TwoDimensionalShape is parent
public class Circle extends TwoDimensionalShape {
    
    // Variable initialization
    double circleRadius, circumference = 0.0;
    
    // No-argument constructor
    public Circle () {
        name = "Circle";
        numberOfDimensions = 2;
        circleRadius = 0.0;
        area = 0.0;
        circumference = 0.0;
    } // end of method
    
    // Constructor
    public Circle (double circleRadius) {
        name = "Circle";
        numberOfDimensions = 2;
        this.circleRadius = circleRadius;
        area = calculateCircleArea(circleRadius);
        circumference = calculateCircumference(circleRadius);
    } // end of method
    
    // Method to calculate circle area
    private double calculateCircleArea (double circleRadius) {
        area = Math.PI * Math.pow(circleRadius, 2.0);
        return area;
    } // end of method
    
    // Method to calculate circle circumference
    private double calculateCircumference (double circleRadius) {
        circumference = 2.0 * Math.PI * circleRadius;
        return circumference;
    } // end of method
} // end of class
