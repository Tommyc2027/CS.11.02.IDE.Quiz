package org.example;

import java.io.PipedReader;

public class Main {

    /** Method 1
     * Method name: circleArea
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleArea(int)
     * Returns the area of a circle. */
    public static double circleArea(double radius) {
        return (double) Math.round(Math.PI * radius * radius * 100)/100;



    }

    /** Method 2
     * Method name: circleCircum
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleCircum(int)
     * Returns the circumference of a circle. */
    public static double circleCircum(int radius) {
        return (double) Math.round(2*Math.PI * radius *100 )/100;
    }

    /** Method 3
     * Method name: circleInfo
     * Method return type: String
     * Method parameter: the radius of a circle
     * Method signature: circleInfo(int)
     * Returns a String detailing the radius, circumference, and area of a circle.
     * Format of returned String: e.g.
     * Radius: 3
     * Circumference: 18.85
     * Area: 28.27 */
    public static String circleInfo(int radius) {
        return "Radius: " + radius +  "\nCircumference: " + circleCircum(radius) + "\nArea: " + circleArea(radius) ;

    }




    /** Method 4
     * Method name: minutesToHoursMinutes
     * Method return type: String
     * Method parameter: total minutes (e.g. 226)
     * Method signature: minutesToHoursMinutes(int)
     * Returns a String detailing the number of hours and minutes.
     * Format of returned String: e.g. 3 hours and 46 minutes */
    public static String minutesToHoursMinutes(int minutes) {

        return minutes/60 + "hours and" + minutes %60;
    }

    /** Method 5
     * Method name: twentyFourToTwelve
     * Method return type: String
     * Method parameter: time in 24-hour format (e.g. 15:56). time >= 13:00 (always pm)
     * Method signature: twentyFourToTwelve(String)
     * Returns a String detailing the time in 12-hour format (e.g. 3:56 pm).
     * Format of returned String: e.g. 3:56 pm
     * */
    public static String twentyFourToTwelve(String time) {
        String hours = time.substring(0, 2); //
        String minutes = time.substring(3);
        int hour24 = Integer.parseInt(hours);
        int hour12 = (hour24 - 1) % 12 + 1;
        return String.format("%d:%s pm", hour12, minutes);

    }

    /** Method 6
     * Method name: distanceBetweenTwoPoints
     * Method return type: double
     * Method parameter: x1, y1, x2, y2 (the two coordinates on a 2D plane)
     * Method signature: distanceBetweenTwoPoints(int,int,int,int)
     * Returns the distance between two points */
    public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        double dxSquared = Math.pow(dx, 2);
        double dySquared = Math.pow(dy, 2);
        double distance = Math.sqrt(dxSquared + dySquared);
        double distance2 = Math.round(distance * 100.0) / 100.0;
        return distance2;

    }

    /** Method 7
     * Method name: fahrenheitToCelsius
     * Method return type: double
     * Method parameter: degrees fahrenheit
     * Method signature: fahrenheitToCelsius(int)
     * Returns the degrees celsius equivalent of the degrees in fahrenheit */
    public static double fahrenheitToCelsius(int fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        double celsius2 = Math.round(celsius * 100.0) / 100.0;
        return celsius2;


    }

    /** Method 8
     * Method name: celsiusToFahrenheit
     * Method return type: double
     * Method parameter: degrees celsius
     * Method signature: celsiusToFahrenheit(int)
     * Returns the degrees fahrenheit equivalent of the degrees in celsius */
    public static double celsiusToFahrenheit(int celsius) {
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double fahrenheit2 = Math.round(fahrenheit * 100.0) / 100.0;
        return fahrenheit2;

    }

}