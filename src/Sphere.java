/*
* File: Sphere.java
* Author: John Kucera
* Date: October 30, 2020
* Purpose: This Java program is meant to accompany Menu.java and is dedicated
* to constructing Sphere objects. Sphere inherits attributes from 
* ThreeDimensionalShape (parent) and Shape (grandparent) and has unique attributes
* double sphereRadius, double capHeight, and double capVolume.
* Constructor Sphere(double sphereRadius, double capHeight) uses arguments
* to determine the volume and spherical cap volume. calculateSphereVolume contains
* the formula to calculate volume and calculateCapVolume contains the formula
* to calculate the spherical cap's volume.
*/

// Sphere class, ThreeDimensionalShape is parent
public class Sphere extends ThreeDimensionalShape {
    
    // Variable initialization
    double sphereRadius, capHeight, capVolume = 0.0;
    
    // No-argument constructor
    public Sphere () {
        name = "Sphere";
        numberOfDimensions = 3;
        sphereRadius = 0.0;
        volume = 0.0;
        capHeight = 0.0;
        capVolume = 0.0;
    } // end of method
    
    // Constructor
    public Sphere (double sphereRadius, double capHeight) {
        name = "Sphere";
        numberOfDimensions = 3;
        this.sphereRadius = sphereRadius;
        volume = calculateSphereVolume(sphereRadius);
        this.capHeight = capHeight;
        capVolume = calculateCapVolume(sphereRadius, capHeight);
    } // end of method
    
    // Method to calculate sphere volume
    private double calculateSphereVolume (double sphereRadius) {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3.0);
        return volume;
    } // end of method
    
    // Method to calculate spherical cap volume
    private double calculateCapVolume (double sphereRadius, double capHeight) {
        capVolume = Math.PI * Math.pow(capHeight, 2.0) 
                   * (sphereRadius - (1.0 / 3.0) * capHeight);
        return capVolume;
    } // end of method
} // end of class
