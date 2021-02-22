/*
* File: Cube.java
* Author: John Kucera
* Date: October 30, 2020
* Purpose: This Java program is meant to accompany Menu.java and is dedicated
* to constructing Cube objects. Cube inherits attributes from 
* ThreeDimensionalShape (parent) and Shape (grandparent) and has unique attributes
* double cubeLength and double spaceDiagonal. Constructor Cube(double cubeLength)
* uses the arguments to determine volume and space diagonal. calculateCubeVolume
* contains the formula to calculate volume and calculateCubeSpaceDiagonal contains
* the formula to calculate the cube's space diagonal.
*/

// Cube class, ThreeDimensionalShape is parent
public class Cube extends ThreeDimensionalShape {
    
    // Variable initialization
    double cubeLength, spaceDiagonal = 0.0;
    
    // No-argument constructor
    public Cube () {
        name = "Cube";
        numberOfDimensions = 3;
        cubeLength = 0.0;
        volume = 0.0;
        spaceDiagonal = 0.0;
    } // end of method
    
    // Constructor
    public Cube (double cubeLength) {
        name = "Cube";
        numberOfDimensions = 3;
        this.cubeLength = cubeLength;
        volume = calculateCubeVolume(cubeLength);
        spaceDiagonal = calculateCubeSpaceDiagonal(cubeLength);
    } // end of method
    
    // Method to calculate cube volume
    private double calculateCubeVolume (double cubeLength) {
        volume = Math.pow(cubeLength, 3.0);
        return volume;
    } // end of method
    
    // Method to calculate space diagonal
    private double calculateCubeSpaceDiagonal (double cubeLength) {
        spaceDiagonal = cubeLength * Math.sqrt(3.0);
        return spaceDiagonal;
    } // end of method
} // end of class
