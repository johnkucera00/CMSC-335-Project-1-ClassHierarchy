/*
* File: Triangle.java
* Author: John Kucera
* Date: October 30, 2020
* Purpose: This Java program is meant to accompany Menu.java and is dedicated
* to constructing Triangle objects. Triangle inherits attributes from 
* TwoDimensionalShape (parent) and Shape (grandparent) and has unique attributes
* double side1Length, double side2Length, double side3Length, double semiPerimeter,
* and String triangleType. Constructor Triangle(double side1Length, double 
* side2Length, double side3Length) uses arguments to determine the
* area and triangle type. calculateSemiperimeter is used to calculate the
* triangle's semiperimeter which will be used to calculate it's area.
* calculateTriangleArea uses the 3 side lengths and semiperimeter to calculate
* the area with Heron's formula. determineTriangleType compares the 3 side 
* lengths to determine the type of triangle: equilateral, isoceles, or scalene.
*/

// Triangle class, TwoDimensionalShape is parent
public class Triangle extends TwoDimensionalShape {
    
    // Variable initialization
    double side1Length, side2Length, side3Length, semiPerimeter = 0.0;
    String triangleType = null;
    
    // No-argument constructor
    public Triangle () {
        name = "Triangle";
        numberOfDimensions = 2;
        side1Length = 0.0;
        side2Length = 0.0;
        side3Length = 0.0;
        semiPerimeter = 0.0;
        area = 0.0;
        triangleType = null;
    } // end of method
    
    // Constructor
    public Triangle (double side1Length, double side2Length, double side3Length) {
        name = "Triangle";
        numberOfDimensions = 2;
        this.side1Length = side1Length;
        this.side2Length = side2Length;
        this.side3Length = side3Length;
        semiPerimeter = calculateSemiperimeter(side1Length, side2Length, side3Length);
        area = calculateTriangleArea(side1Length, side2Length, side3Length, 
                                     semiPerimeter);
        triangleType = determineTriangleType(side1Length, side2Length, side3Length);
    } // end of method
    
    // Method to calculate triangle's semiperimeter
    private double calculateSemiperimeter (double side1Length, double side2Length, 
                                           double side3Length) {
        semiPerimeter = (side1Length + side2Length + side3Length) / 2.0;
        return semiPerimeter;
    } // end of method
    
    // Method to calculate triangle area with Heron's formula
    private double calculateTriangleArea (double side1Length, double side2Length, 
                                           double side3Length, double semiPerimeter) {
        area = Math.sqrt(semiPerimeter * (semiPerimeter - side1Length)
                         * (semiPerimeter - side2Length) * (semiPerimeter - 
                         side3Length));
        return area;
    } // end of method
    
    // Method to determine triangle type
    private String determineTriangleType (double side1Length, double side2Length, 
                                           double side3Length) {
        // Equilateral, 3 equal sides
        if (side1Length == side2Length && side2Length == side3Length) {
            triangleType = "Equilateral";
        } // end of if
        
        // Isoceles, 2 equal sides
        else if (side1Length == side2Length || side2Length == side3Length
                 || side1Length == side3Length) {
            triangleType = "Isoceles";
        } // end of else if
        
        // Scalene, no equal sides
        else {
            triangleType = "Scalene";
        } // end of else
        
        return triangleType;
    } // end of method
} // end of class