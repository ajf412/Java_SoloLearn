package Stuff;

public class Dog extends Animal {
    public Dog() {
        legs = 4;
    }

    public void checkHunger(){
        Tummy thisDog = new Tummy();
        System.out.println(thisDog.hungry());
    }

    void myFunc(int arg)
        IllegalArgumentException {

    }

    class Tummy {
        public String hungry(){
            return "The dog's tummy is hungry...";
        }
    }
}
