package javaapplication6;
public class DAkimov_Mod6_Fan {
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
    public DAkimov_Mod6_Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with parameters
    public DAkimov_Mod6_Fan(int speed, boolean on, double radius, String color) {
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

    // Test code
    public static void main(String[] args) {
        // Create a fan using the default constructor
        DAkimov_Mod6_Fan defaultFan = new DAkimov_Mod6_Fan();
        System.out.println(defaultFan.toString());

        // Create a fan using the argument constructor
        DAkimov_Mod6_Fan customFan = new DAkimov_Mod6_Fan(FAST, true, 8.0, "blue");
        System.out.println(customFan.toString());

        // Change properties of the default fan
        defaultFan.setOn(true);
        defaultFan.setSpeed(MEDIUM);
        defaultFan.setRadius(7.5);
        defaultFan.setColor("red");
        System.out.println(defaultFan.toString());
    }
}