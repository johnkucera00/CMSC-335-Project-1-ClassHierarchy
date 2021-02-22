/*
* File: Menu.java
* Author: John Kucera
* Date: October 30, 2020
* Purpose: This Java program is a command-line driven menu that allows a user to
* construct grandchild objects of the Shape class, such as Circle, Rectangle,
* Sphere, and Cone. After selecting which shape they want to construct, the
* user is prompted to enter dimensions for that shape. The input is used to
* calculate mathematical information about the shapes, such as area and volume.
* Additional unique information, such as the circumference of a circle, is
* also returned depending on the selected shape. The user may exit the program
* at the menu or after a shape construction. When the user exits, the current
* date and time are displayed as output.
* 
* Methods: exitProgramMessage() provides the thank you message when the user
* exits the program. This also provides the date and time and displays them.
* continueOrExit() is used after every shape construction and asks the user
* if they want to continue the application or exit, then scans in the input.
* Menu() constructor holds the main menu and utilizes constructors for all shapes.
* Main method constructs a Menu object when the program is run.
*
* Menu.java should be used alongside the following source files: Circle.java,
* Cone.java, Cube.java, Cylinder.java, Rectangle.java, Shape.java, Sphere.java,
* Square.java, ThreeDimensionalShape.java, Torus.java, Triangle.java,
* TwoDimensionalShape.java.
*/

// import necessary java classes
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

// Menu Class
public class Menu {
    
    // Method for Exit message
    public static void exitProgramMessage() {
        // Formatting Date
        Date rightNow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd");
        String dateString = dateFormat.format(rightNow);

        // Formatting Time
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a z");
        timeFormat.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
        String timeString = timeFormat.format(rightNow);

        // Thank you Message with current Date and Time, exit program
        System.out.println("\nThanks for using the program. Today is "
                            + dateString + " at " + timeString + ".\n");
    } // end of method
    
    // Method for asking if user wants to continue or exit
    public static boolean continueOrExit() {
        // Variable initialization, creating Scanner object
        char yesOrNo = ' ';
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Would you like to continue? (Y or N)\n");
        
        // while loop until user enters proper input
        while (true) {
            // scan in input
            yesOrNo = input.next().charAt(0);
            input.nextLine();
            
            // cases for possible input
            switch (yesOrNo) {
                // Y or y, user wants to continue
                case 'Y':
                case 'y':
                    // continue in main method
                    return false;
                    
                // N or n, user wants to exit
                case 'N':
                case 'n':
                    // print exit message, exit program
                    exitProgramMessage();
                    System.exit(0);
                    
                // Invalid input, continue in while loop
                default:
                    System.out.println ("\nInvalid input. Please try again and "
                            + "enter Y or N.\n");
                    break;
            } // end of switch
        } // end of while
    } // end of method
    
    // Menu constructor displays menu and scans in user input, 
    // constructs shapes and returns shape info
    public Menu() {
        // Variable Initialization.
        // Multiple general dimension variables to account for each shape's
        // different names and amounts of dimensions.
        double dimension1, dimension2, dimension3 = 0.0;
        String dimension1String, dimension2String, dimension3String = null;
        int menuSelection = 0;
        
        // Welcome message
        System.out.println("********* Welcome to the Java OO Shapes Program **********");
        
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Menu selection
        while (true) {
            try {
                // List menu items
                System.out.println("\nSelect from the menu below:");
                System.out.println("1. Construct a Circle");
                System.out.println("2. Construct a Rectangle");
                System.out.println("3. Construct a Square");
                System.out.println("4. Construct a Triangle");
                System.out.println("5. Construct a Sphere");
                System.out.println("6. Construct a Cube");
                System.out.println("7. Construct a Cone");
                System.out.println("8. Construct a Cylinder");
                System.out.println("9. Construct a Torus");
                System.out.println("10. Exit the program\n");

                // Scan in User Input
                menuSelection = Integer.parseInt(input.nextLine().trim());

                // Perform selected task
                switch (menuSelection) {

                    // Selection: Circle
                    case 1:
                        // while loop until user enters proper double
                        while (true) {
                            try {
                                // Prompt user for Radius
                                System.out.println("\nYou have selected a Circle.");
                                System.out.println("\nWhat is the Radius?\n");

                                // Scan in User input, convert to double
                                dimension1String = input.nextLine();
                                dimension1 = Double.parseDouble(dimension1String);

                                // Input dimensions cannot be zero or negative
                                if (dimension1 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Create Circle, display circle's info
                                Circle circle = new Circle(dimension1);
                                System.out.println("\nThe area of the " + circle.name
                                        + " is " + circle.area + ".\n");
                                System.out.println("The circumference of the "
                                        + circle.name + " is " + circle.circumference 
                                        + ".\n");

                                // Prompt user if they want to continue or exit
                                continueOrExit();
                                break;
                            } // end of try

                            // NumberFormatException if user doesn't input positive double
                            catch (NumberFormatException e) {
                                System.out.println("\nInvalid input. Only a positive "
                                        + "double is accepted here. Please try again.");
                            } // end of catch
                        } // end of while
                        break;

                    // Selection: Rectangle
                    case 2:
                        // while loop until user enters proper double
                        while (true) {
                            try {
                                // Prompt for Rectangle length
                                System.out.println("\nYou have selected a Rectangle.");
                                System.out.println("\nWhat is the Length?\n");

                                // Scan in User Input, convert to Double
                                dimension1String = input.nextLine();
                                dimension1 = Double.parseDouble(dimension1String);

                                // Input dimensions cannot be zero or negative
                                if (dimension1 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Prompt for Rectangle width, scan in user input
                                // and convert to double
                                System.out.println("\nWhat is the Width?\n");
                                dimension2String = input.nextLine();
                                dimension2 = Double.parseDouble(dimension2String);

                                // Input dimensions cannot be zero or negative
                                if (dimension2 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Construct Rectangle, display it's info
                                Rectangle rectangle = new Rectangle(dimension1,     
                                                                    dimension2);
                                System.out.println("\nThe area of the " + rectangle.name
                                                   + " is " + rectangle.area + ".\n");
                                System.out.println("The diagonal of the " + rectangle.name
                                                   + " is " + rectangle.rectangleDiagonal 
                                                   + ".\n");

                                // Prompt user if they want to continue or exit
                                continueOrExit();
                                break;
                            } // end of try

                            // NumberFormatException if user doesn't input positive double
                            catch (NumberFormatException e) {
                                System.out.println("\nInvalid input. Only a positive "
                                        + "double is accepted here. Please try again.");
                            } // end of catch
                        } // end of while
                        break;

                    // Selection: Square
                    case 3:
                        // while loop until user enters proper double
                        while (true) {
                            try {
                                // Prompt for Square Length or Width
                                System.out.println("\nYou have selected a Square.");
                                System.out.println("\nWhat is the Length or Width?\n");

                                // Scan in User Input, convert to Double
                                dimension1String = input.nextLine();
                                dimension1 = Double.parseDouble(dimension1String);

                                // Input dimensions cannot be zero or negative
                                if (dimension1 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Construct Square, display it's info
                                Square square = new Square(dimension1);
                                System.out.println("\nThe area of the " + square.name
                                                   + " is " + square.area + ".\n");
                                System.out.println("The diagonal of the " + square.name
                                                   + " is " + square.squareDiagonal 
                                                   + ".\n");

                                // Prompt user if they want to continue or exit
                                continueOrExit();
                                break;
                            } // end of try

                            // NumberFormatException if user doesn't input positive double
                            catch (NumberFormatException e) {
                                System.out.println("\nInvalid input. Only a positive "
                                        + "double is accepted here. Please try again.");
                            } // end of catch
                        } // end of while
                        break;

                    // Selection: Triangle
                    case 4:
                        // while loop until user enters proper double
                        while (true) {
                            try {
                                // Prompt for Triangle Side 1 length
                                System.out.println("\nYou have selected a Triangle.");
                                System.out.println("\nWhat is the Length of Side 1?\n");

                                // Scan in User Input, convert to Double
                                dimension1String = input.nextLine();
                                dimension1 = Double.parseDouble(dimension1String);

                                // Input dimensions cannot be zero or negative
                                if (dimension1 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Prompt for Side 2 length, scan in user input
                                // and convert to double
                                System.out.println("\nWhat is the Length of Side 2?\n");
                                dimension2String = input.nextLine();
                                dimension2 = Double.parseDouble(dimension2String);

                                // Input dimensions cannot be zero or negative
                                if (dimension2 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Prompt for Side 3 length, scan in user input
                                // and convert to double
                                System.out.println("\nWhat is the Length of Side 3?\n");
                                dimension3String = input.nextLine();
                                dimension3 = Double.parseDouble(dimension3String);

                                // Input dimensions cannot be zero or negative
                                if (dimension3 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Construct Triangle, display it's info
                                Triangle triangle = new Triangle(dimension1, dimension2,
                                                                 dimension3);

                                // Display triangle info if it is proper
                                if (Double.isNaN(triangle.area) == false
                                    && triangle.area > 0.0) {
                                    System.out.println("\nThe area of the " + triangle.name
                                                   + " is " + triangle.area + ".\n");
                                    System.out.println("The " + triangle.name 
                                                       + " is " + triangle.triangleType 
                                                       + ".\n");

                                    // Prompt user if they want to continue or exit
                                    continueOrExit();
                                    break;
                                } // end of if

                                // Ask user to try again if triangle cannot exist 
                                // with the input dimensions
                                else {
                                    System.out.print("\nThis Triangle cannot exist"
                                                     + " with the dimensions provided."
                                                     + " Please try again.\n");
                                } // end of else
                            } // end of try

                            // NumberFormatException if user doesn't input positive double
                            catch (NumberFormatException e) {
                                System.out.println("\nInvalid input. Only a positive "
                                        + "double is accepted here. Please try again.");
                            } // end of catch
                        } // end of while
                        break;

                    // Selection: Sphere
                    case 5:
                        // while loop until user enters proper double
                        while (true) {
                            try {
                                // Prompt user for Radius
                                System.out.println("\nYou have selected a Sphere.");
                                System.out.println("\nWhat is the Radius?\n");

                                // Scan in User input, convert to double
                                dimension1String = input.nextLine();
                                dimension1 = Double.parseDouble(dimension1String);

                                // Input dimensions cannot be zero or negative
                                if (dimension1 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Prompt for Spherical Cap Height, scan in user input
                                // and convert to double
                                System.out.println("\nGive the Height of a Spherical"
                                                    + " Cap in this Sphere.\n");
                                dimension2String = input.nextLine();
                                dimension2 = Double.parseDouble(dimension2String);

                                // Input dimensions cannot be zero or negative
                                if (dimension2 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Display sphere info if input dimensions are
                                // proper
                                if (dimension2 < dimension1) {
                                    // Create Sphere, display sphere's info
                                    Sphere sphere = new Sphere(dimension1, dimension2);
                                    System.out.println("\nThe volume of the " 
                                                       + sphere.name + " is " 
                                                       + sphere.volume + ".\n");
                                    System.out.println("The volume of this "
                                                       + "Spherical Cap in the "
                                                        + sphere.name + " is " + 
                                                        sphere.capVolume + ".\n");

                                    // Prompt user if they want to continue or exit
                                    continueOrExit();
                                    break;
                                } // end of if

                                // Spherical Cap cannot have Height greater than
                                // or equal to Sphere's Radius
                                else {
                                    System.out.print("\nThe Spherical Cap cannot have"
                                                      + " a Height greater than or "
                                                      + "equal to the Sphere's Radius."
                                                      + " Please try again.\n");
                                } // end of else
                            } // end of try

                            // NumberFormatException if user doesn't input positive double
                            catch (NumberFormatException e) {
                                System.out.println("\nInvalid input. Only a positive "
                                        + "double is accepted here. Please try again.");
                            } // end of catch
                        } // end of while
                        break;

                    // Selection: Cube
                    case 6:
                        // while loop until user enters proper double
                        while (true) {
                            try {
                                // Prompt for Cube Length or Width or Height
                                System.out.println("\nYou have selected a Cube.");
                                System.out.println("\nWhat is the Length or Width "
                                                   + "or Height?\n");

                                // Scan in User Input, convert to Double
                                dimension1String = input.nextLine();
                                dimension1 = Double.parseDouble(dimension1String);

                                // Input dimensions cannot be zero or negative
                                if (dimension1 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Construct Cube, display it's info
                                Cube cube = new Cube(dimension1);
                                System.out.println("\nThe volume of the " + cube.name
                                                   + " is " + cube.volume + ".\n");
                                System.out.println("The space diagonal of the " 
                                                   + cube.name + " is " 
                                                   + cube.spaceDiagonal + ".\n");

                                // Prompt user if they want to continue or exit
                                continueOrExit();
                                break;
                            } // end of try

                            // NumberFormatException if user doesn't input positive double
                            catch (NumberFormatException e) {
                                System.out.println("\nInvalid input. Only a positive "
                                        + "double is accepted here. Please try again.");
                            } // end of catch
                        } // end of while
                        break;

                    // Selection: Cone
                    case 7:
                        // while loop until user enters proper double
                        while (true) {
                            try {
                                // Prompt user for Radius
                                System.out.println("\nYou have selected a Cone.");
                                System.out.println("\nWhat is the Radius?\n");

                                // Scan in User input, convert to double
                                dimension1String = input.nextLine();
                                dimension1 = Double.parseDouble(dimension1String);

                                // Input dimensions cannot be zero or negative
                                if (dimension1 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Prompt for height, scan in user input,
                                // convert to double
                                System.out.println("\nWhat is the Height?\n");
                                dimension2String = input.nextLine();
                                dimension2 = Double.parseDouble(dimension2String);

                                // Input dimensions cannot be zero or negative
                                if (dimension2 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Create Cone, display cone's info
                                Cone cone = new Cone(dimension1, dimension2);
                                System.out.println("\nThe volume of the " + cone.name
                                        + " is " + cone.volume + ".\n");
                                System.out.println("The slant height of the " + cone.name
                                                   + " is " + cone.slantHeight + ".\n");

                                // Prompt user if they want to continue or exit
                                continueOrExit();
                                break;
                            } // end of try

                            // NumberFormatException if user doesn't input positive double
                            catch (NumberFormatException e) {
                                System.out.println("\nInvalid input. Only a positive "
                                        + "double is accepted here. Please try again.");
                            } // end of catch
                        } // end of while
                        break;

                    // Selection: Cylinder
                    case 8:
                        // while loop until user enters proper double
                        while (true) {
                            try {
                                // Prompt user for Radius
                                System.out.println("\nYou have selected a Cylinder.");
                                System.out.println("\nWhat is the Radius?\n");

                                // Scan in User input, convert to double
                                dimension1String = input.nextLine();
                                dimension1 = Double.parseDouble(dimension1String);

                                // Input dimensions cannot be zero or negative
                                if (dimension1 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Prompt for height, scan in user input,
                                // convert to double
                                System.out.println("\nWhat is the Height?\n");
                                dimension2String = input.nextLine();
                                dimension2 = Double.parseDouble(dimension2String);

                                // Input dimensions cannot be zero or negative
                                if (dimension2 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Create Cylinder, display cylinder's info
                                Cylinder cylinder = new Cylinder(dimension1, dimension2);
                                System.out.println("\nThe volume of the " + cylinder.name
                                                   + " is " + cylinder.volume 
                                                   + ".\n");
                                System.out.println("The longest diagonal of the " 
                                                   + cylinder.name + " is " 
                                                   + cylinder.cylinderLongestDiagonal
                                                   + ".\n");

                                // Prompt user if they want to continue or exit
                                continueOrExit();
                                break;
                            } // end of try

                            // NumberFormatException if user doesn't input positive double
                            catch (NumberFormatException e) {
                                System.out.println("\nInvalid input. Only a positive "
                                        + "double is accepted here. Please try again.");
                            } // end of catch
                        } // end of while
                        break;

                    // Selection: Torus
                    case 9:
                        // while loop until user enters proper double
                        while (true) {
                            try {
                                // Prompt user for Minor Radius
                                System.out.println("\nYou have selected a Torus.");
                                System.out.println("\nWhat is the Minor Radius?\n");

                                // Scan in User input, convert to double
                                dimension1String = input.nextLine();
                                dimension1 = Double.parseDouble(dimension1String);

                                // Input dimensions cannot be zero or negative
                                if (dimension1 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Prompt for Major Radius, scan in user input,
                                // convert to double
                                System.out.println("\nWhat is the Major Radius?\n");
                                dimension2String = input.nextLine();
                                dimension2 = Double.parseDouble(dimension2String);

                                // Input dimensions cannot be zero or negative
                                if (dimension2 <= 0.0) {
                                    throw new NumberFormatException();
                                } // end of if

                                // Create Torus, display torus' info
                                Torus torus = new Torus(dimension1, dimension2);
                                if (Double.isNaN(torus.volume) == false) {
                                    System.out.println("\nThe volume of the " 
                                                       + torus.name + " is " 
                                                       + torus.volume + ".\n");
                                    System.out.println("This is a " + torus.torusType
                                                       + " " + torus.name + ".\n");
                                } // end of if

                                // Spindle torus volume cannot be calculated
                                else {
                                    System.out.println("\nThe volume of the " 
                                                       + torus.name 
                                                       + " cannot be calculated.\n");
                                    System.out.println("This is a " + torus.torusType
                                                       + " " + torus.name + ".\n");
                                } // end of else

                                // Prompt user if they want to continue or exit
                                continueOrExit();
                                break;
                            } // end of try

                            // NumberFormatException if user doesn't input positive double
                            catch (NumberFormatException e) {
                                System.out.println("\nInvalid input. Only a positive "
                                        + "double is accepted here. Please try again.");
                            } // end of catch
                        } // end of while
                        break;

                    // Selection: Exit Program
                    case 10:
                        exitProgramMessage();
                        System.exit(0);
                        break;

                    // Handling input outside of 1 to 10
                    default:
                        System.out.println("\nInvalid input. Only integers 1 to 10 are "
                                            + "accepted as input. Please try again.");
                        break;
                } // end of switch
            } // end of outer try
            
            // Handling non-integer input
            catch (NumberFormatException e) {
                System.out.println("\nInvalid input. Only integers 1 to 10 are "
                                   + "accepted as input. Please try again.");
            } // end of outer catch
        } // end of while  
    } // end of method
    
    // Main method, Menu() is created
    public static void main(String[] args) {
        Menu menu = new Menu();
    } // end of main method
} // end of class
