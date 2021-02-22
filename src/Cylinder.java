/*
* File: Cylinder.java
* Author: John Kucera
* Date: October 30, 2020
* Purpose: This Java program is meant to accompany Menu.java and is dedicated
* to constructing Cylinder objects. Cylinder inherits attributes from 
* ThreeDimensionalShape (parent) and Shape (grandparent) and has unique attributes
* double cylinderRadius, double cylinderHeight, and double cylinderLongestDiagonal.
* Constructor Cylinder(double cylinderRadius, double cylinderHeight) uses arguments
* to determine the volume and longest diagonal. calculateCylinderVolume contains
* the formula to calculate volume and calculateCylinderLongestDiagonal contains 
* the formula to calculate the cylinder's longest diagonal.
*/

// Cylinder class, ThreeDimensionalShape is parent
public class Cylinder extends ThreeDimensionalShape {
    
    // Variable initialization
    double cylinderRadius, cylinderHeight, cylinderLongestDiagonal = 0.0;
    
    // No-argument constructor
    public Cylinder () {
        name = "Cylinder";
        numberOfDimensions = 3;
        cylinderRadius = 0.0;
        cylinderHeight = 0.0;
        volume = 0.0;
        cylinderLongestDiagonal = 0.0;
    } // end of method
    
    // Constructor
    public Cylinder (double cylinderRadius, double cylinderHeight) {
        name = "Cylinder";
        numberOfDimensions = 3;
        this.cylinderRadius = cylinderRadius;
        this.cylinderHeight = cylinderHeight;
        volume = calculateCylinderVolume(cylinderRadius, cylinderHeight);
        cylinderLongestDiagonal = calculateCylinderLongestDiagonal(cylinderRadius, 
                                                                   cylinderHeight);
    } // end of method
    
    // Method to calculate cylinder volume
    private double calculateCylinderVolume (double cylinderRadius, 
                                            double cylinderHeight) {
        volume = Math.PI * Math.pow(cylinderRadius, 2.0) * cylinderHeight;
        return volume;
    } // end of method
    
    // Method to calculate longest diagonal
    private double calculateCylinderLongestDiagonal (double cylinderRadius, 
                                                     double cylinderHeight) {
        cylinderLongestDiagonal = Math.sqrt(4.0 * Math.pow(cylinderRadius, 2.0) 
                                 + Math.pow(cylinderHeight, 2.0));
        return cylinderLongestDiagonal;
    } // end of method
} // end of class
