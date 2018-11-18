package Stuff;

public class Animal {
    protected int legs;

    public void bark() {
        System.out.println("Woof-Woof");
    }

    public void eat() {
        System.out.println("The animal eats.");
    }

    public int getLegs() {
        return this.legs;
    }
}