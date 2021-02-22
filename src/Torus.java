/*
* File: Torus.java
* Author: John Kucera
* Date: October 30, 2020
* Purpose: This Java program is meant to accompany Menu.java and is dedicated
* to constructing Torus objects. Torus inherits attributes from 
* ThreeDimensionalShape (parent) and Shape (grandparent) and has unique attributes
* double minorRadius, double majorRadius, and String torusType. Constructor 
* Torus(double minorRadius, double majorRadius) uses arguments to determine the
* volume and torus type. determineTorusType is used to compare the minorRadius and
* majorRadius to determine the Torus type (Ring, Horn, or Spindle).
* calculateTorusVolume contains the formula to calculate the volume and accounts
* for the fact that Spindle Torus volume cannot be calculated.
*/

// Torus class, ThreeDimensionalShape is parent
public class Torus extends ThreeDimensionalShape {
    
    // Variable initialization
    double minorRadius, majorRadius = 0.0;
    String torusType = null;
    
    // No-argument constructor
    public Torus () {
        name = "Torus";
        numberOfDimensions = 3;
        minorRadius = 0.0;
        majorRadius = 0.0;
        volume = 0.0;
        torusType = null;
    } // end of method
    
    // Constructor
    public Torus (double minorRadius, double majorRadius) {
        name = "Torus";
        numberOfDimensions = 3;
        this.minorRadius = minorRadius;
        this.majorRadius = majorRadius;
        torusType = determineTorusType(minorRadius, majorRadius);
        volume = calculateTorusVolume(minorRadius, majorRadius, torusType);
    } // end of method
    
    // Method to determine Torus type
    private String determineTorusType (double minorRadius, double majorRadius) {
        // Ring torus, r < R
        if (minorRadius < majorRadius) {
            torusType = "Ring";
        } // end of if
        
        // Horn torus, r = R
        else if (minorRadius == majorRadius) {
            torusType = "Horn";
        } // end of else if
        
        // Spindle torus, r > R
        else {
            torusType = "Spindle";
        } // end of else
        return torusType;
    } // end of method
    
    // Method to calculate Torus volume
    private double calculateTorusVolume (double minorRadius, double majorRadius,
                                         String torusType) {
        // Calculate volume for Ring and Horn torus
        if ("Ring".equals(torusType) || "Horn".equals(torusType)) {
            volume = (Math.PI * Math.pow(minorRadius, 2.0)) 
                    * (2.0 * Math.PI * majorRadius);
        } // end of if
        
        // Volume cannot be calculated for Spindle Torus
        else {
            volume = Double.NaN;
        } // end of else
        return volume;
    } // end of method
} // end of class
