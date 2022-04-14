package kraakmo.learningjava;

import java.util.Scanner;

public class WindowMaster {

    public static void main(String[] args) {
        // Declare variables for height and width
        float height;
        float width;

        // Declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // Declare and initialize our Scanner
        Scanner sc = new Scanner(System.in);

        // Get input from user
        height = readValue("Please enter window height:");
        width = readValue("Please enter window width:");

        // Calculate area of window
        areaOfWindow = height * width;

        // Calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);

        // Calculate total cost - use hard coded for material cost
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }

    public static float readValue(String prompt) {
        //declare and initialize a Scanner variable
        Scanner sc = new Scanner(System.in);
        //print prompt to Console
        System.out.println(prompt);
        //read value into String date type
        String input = sc.nextLine();
        //convert the String to a float
        float floatVal = Float.parseFloat(input);
        //return the float Value
        return floatVal;
    }
}