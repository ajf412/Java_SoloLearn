package Stuff;

public class Vehicle {
    private int maxSpeed;
    private int wheels;
    private String color;
    private double fuelCapacity;

    public static int COUNT = 0;
    public static final int CYLINDERS = 6;

    public Vehicle() {
        COUNT++;
    }

    public static void horn() {
        System.out.println("BEEP!");
    }

    public void door() {
        System.out.println("BANG!");
    }

    public void seatbelt() {
        System.out.println("CLICK!");
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public int div(int a, int b){
        if(b == 0) {
            throw new ArithmeticException("Division by zero.");
        } else {
            return a / b;
        }
    }
}
