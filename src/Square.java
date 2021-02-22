/*
* File: Square.java
* Author: John Kucera
* Date: October 30, 2020
* Purpose: This Java program is meant to accompany Menu.java and is dedicated
* to constructing Square objects. Square inherits attributes from 
* TwoDimensionalShape (parent) and Shape (grandparent) and has unique attributes
* double squareLength and double squareDiagonal. Constructor Square(double
* squareLength) uses arguments to determine the area and diagonal. 
* calculateSquareArea contains the formula to calculate area and
* calculateSquareDiagonal contains the formula to calculate the square's diagonal.
*/

// Square class, TwoDimensionalShape is parent
public class Square extends TwoDimensionalShape {
    
    // Variable initialization
    double squareLength, squareDiagonal = 0.0;
    
    // No-argument constructor
    public Square () {
        name = "Square";
        numberOfDimensions = 2;
        squareLength = 0.0;
        area = 0.0;
        squareDiagonal = 0.0;
    } // end of method
    
    // Constructor
    public Square (double squareLength) {
        name = "Square";
        numberOfDimensions = 2;
        this.squareLength = squareLength;
        area = calculateSquareArea(squareLength);
        squareDiagonal = calculateSquareDiagonal(squareLength);
    } // end of method
    
    // Method to calculate square area
    private double calculateSquareArea (double squareLength) {
        area = Math.pow(squareLength, 2.0);
        return area;
    } // end of method
    
    // Method to calculate square Diagonal
    private double calculateSquareDiagonal (double squareLength) {
        squareDiagonal = squareLength * Math.sqrt(2.0);
        return squareDiagonal;
    } // end of method
} // end of class
