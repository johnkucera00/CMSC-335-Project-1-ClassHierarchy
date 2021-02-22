/*
* File: TwoDimensionalShape.java
* Author: John Kucera
* Date: October 30, 2020
* Purpose: This Java program is meant to accompany Menu.java and is dedicated
* to holding attributes for TwoDimensionalShape children. The parent class
* is Shape from which numberOfDimensions is inherited. All children, including
* circle, rectangle, square, and triangle, inherit double area from this class.
* Constructor TwoDimensionalShape(String name, double area) is unused in
* this application but allows a shape name and area to be input, as well as
* automatically assumes numberOfDimensions to be 2 dimensions.
*/

// TwoDimensionalShape class, Shape is parent
public class TwoDimensionalShape extends Shape {
    
    // Variable initialization
    double area = 0.0;
    
    // No-argument constructor
    public TwoDimensionalShape () {
        name = "Two Dimensional Shape";
        numberOfDimensions = 2;
        area = 0.0;
    } // end of method
    
    // Constructor
    public TwoDimensionalShape (String name, double area) {
        this.name = name;
        numberOfDimensions = 2;
        this.area = area;
    } // end of method
} // end of class
