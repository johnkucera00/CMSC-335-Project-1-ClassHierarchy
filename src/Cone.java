/*
* File: Cone.java
* Author: John Kucera
* Date: October 30, 2020
* Purpose: This Java program is meant to accompany Menu.java and is dedicated
* to constructing Cone objects. Cone inherits attributes from 
* ThreeDimensionalShape (parent) and Shape (grandparent) and has unique attributes
* double coneRadius, double coneHeight, and double slantHeight.
* Cone(double coneRadius, double coneHeight) constructor uses the arguments to
* determine volume and slant height. calculateConeVolume contains the formula to
* calculate volume and calculateSlantHeight contains the formula to calculate
* slant height.
*/

// Cone class, ThreeDimensionalShape is parent
public class Cone extends ThreeDimensionalShape {
    
    // Variable initialization
    double coneRadius, coneHeight, slantHeight = 0.0;
    
    // No-argument constructor
    public Cone () {
        name = "Cone";
        numberOfDimensions = 3;
        coneRadius = 0.0;
        coneHeight = 0.0;
        volume = 0.0;
        slantHeight = 0.0;
    } // end of method
    
    // Constructor
    public Cone (double coneRadius, double coneHeight) {
        name = "Cone";
        numberOfDimensions = 3;
        this.coneRadius = coneRadius;
        this.coneHeight = coneHeight;
        volume = calculateConeVolume(coneRadius, coneHeight);
        slantHeight = calculateSlantHeight(coneRadius, coneHeight);
    } // end of method
    
    // Method to calculate cone volume
    private double calculateConeVolume (double coneRadius, double coneHeight) {
        volume = Math.PI * Math.pow(coneRadius, 2.0) * coneHeight / 3.0;
        return volume;
    } // end of method
    
    // Method to calculate slant height
    private double calculateSlantHeight (double coneRadius, double coneHeight) {
        slantHeight = Math.sqrt(Math.pow(coneRadius, 2.0) + Math.pow(coneHeight, 2.0));
        return slantHeight;
    } // end of method
} // end of class
