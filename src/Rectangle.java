/*
* File: Rectangle.java
* Author: John Kucera
* Date: October 30, 2020
* Purpose: This Java program is meant to accompany Menu.java and is dedicated
* to constructing Rectangle objects. Rectangle inherits attributes from 
* TwoDimensionalShape (parent) and Shape (grandparent) and has unique attributes
* double rectangleLength, double rectangleWidth, and double rectangleDiagonal.
* Constructor Rectangle(double rectangleLength, double rectangleWidth) uses arguments
* to determine the area and diagonal. calculateRectangleArea contains
* the formula to calculate area and calculateRectangleDiagonal contains 
* the formula to calculate the rectangle's diagonal.
*/

// Rectangle class, TwoDimensionalShape is parent
public class Rectangle extends TwoDimensionalShape {
    
    // Variable initialization
    double rectangleLength, rectangleWidth, rectangleDiagonal = 0.0;
    
    // No-argument constructor
    public Rectangle () {
        name = "Rectangle";
        numberOfDimensions = 2;
        rectangleLength = 0.0;
        rectangleWidth = 0.0;
        area = 0.0;
        rectangleDiagonal = 0.0;
    } // end of method
    
    // Constructor
    public Rectangle (double rectangleLength, double rectangleWidth) {
        name = "Rectangle";
        numberOfDimensions = 2;
        this.rectangleLength = rectangleLength;
        this.rectangleWidth = rectangleWidth;
        area = calculateRectangleArea(rectangleLength, rectangleWidth);
        rectangleDiagonal = calculateRectangleDiagonal(rectangleLength, 
                                                       rectangleWidth);
    } // end of method
    
    // Method to calculate rectangle area
    private double calculateRectangleArea (double rectangleLength, 
                                           double rectangleWidth) {
        area = rectangleLength * rectangleWidth;
        return area;
    } // end of method
    
    // Method to calculate rectangle diagonal
    private double calculateRectangleDiagonal (double rectangleLength, 
                                               double rectangleWidth) {
        rectangleDiagonal = Math.sqrt(Math.pow(rectangleLength, 2.0) 
                                      + Math.pow(rectangleWidth, 2.0));
        return rectangleDiagonal;
    } // end of method
} // end of class