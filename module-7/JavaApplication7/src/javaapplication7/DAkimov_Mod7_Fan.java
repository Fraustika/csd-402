// Reference: https://www.w3schools.com/java/java_methods.asp

package javaapplication7;

import java.util.ArrayList;

public class DAkimov_Mod7_Fan {
    // Constants for fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public DAkimov_Mod7_Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with parameters
    public DAkimov_Mod7_Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan is on with speed " + speed + ", radius " + radius + ", and color " + color;
        } else {
            return "Fan is off";
        }
    }

    // UseFans class to manage multiple fans
    public static class UseFans {
        private ArrayList<DAkimov_Mod7_Fan> fans;

        // Constructor to initialize the fan collection
        public UseFans() {
            fans = new ArrayList<>();
        }

        // Method to add a Fan instance to the collection
        public void addFan(DAkimov_Mod7_Fan fan) {
            fans.add(fan);
        }

        // Method to display all Fans in the collection
        public void displayFans() {
            for (DAkimov_Mod7_Fan fan : fans) {
                displayFan(fan);
            }
        }

        // Method to display a single Fan instance
        public void displayFan(DAkimov_Mod7_Fan fan) {
            System.out.println("Fan color: " + fan.getColor());
            System.out.println("Fan radius: " + fan.getRadius());
            System.out.println("Fan speed: " + fan.getSpeed());
            System.out.println("Is fan on? " + (fan.isOn() ? "Yes" : "No"));
            System.out.println();
        }

        // Main method to test the functionality
        public static void main(String[] args) {
            UseFans useFans = new UseFans();

            // Creating Fan instances
            DAkimov_Mod7_Fan fan1 = new DAkimov_Mod7_Fan(DAkimov_Mod7_Fan.FAST, true, 10, "blue");
            DAkimov_Mod7_Fan fan2 = new DAkimov_Mod7_Fan(DAkimov_Mod7_Fan.MEDIUM, false, 8, "red");
            DAkimov_Mod7_Fan fan3 = new DAkimov_Mod7_Fan(DAkimov_Mod7_Fan.SLOW, true, 6, "green");

            // Adding Fans to the collection
            useFans.addFan(fan1);
            useFans.addFan(fan2);
            useFans.addFan(fan3);

            // Displaying all Fans
            useFans.displayFans();
        }
    }
}