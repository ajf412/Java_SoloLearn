import Stuff.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

enum Rank {
    PVT,
    PFC,
    LCPL,
    CPL,
    SGT
}

class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Animal dog = new Animal();
        dog.bark();

        Vehicle myCar = new Vehicle();
        myCar.setColor("gray");
        myCar.horn();
        myCar.seatbelt();
        System.out.println(myCar.getColor());

        System.out.println(myCar.COUNT);
        Vehicle yourCar = new Vehicle();
        System.out.println(yourCar.COUNT);

        Vehicle.horn();
        System.out.println(Vehicle.CYLINDERS);

        Dog beans = new Dog();
        beans.bark();
        System.out.println(beans.getLegs());

        double myNum = 32.87;
        int b = (int)myNum;
        System.out.println(b);

        Vehicle anotherCar = new Vehicle(){
            @Override public void seatbelt(){
                System.out.println("Click it, or ticket!");
            }
        };
        myCar.seatbelt();
        anotherCar.seatbelt();

        beans.checkHunger();

        Rank myRank = Rank.SGT;

        switch(myRank){
            case PVT:
                System.out.println("E-1");
                break;
            case PFC:
                System.out.println("E-2");
                break;
            case LCPL:
                System.out.println("E-3");
                break;
            case CPL:
                System.out.println("E-4");
                break;
            case SGT:
                System.out.println("E-5");
                break;
        }

        try{
            int a[] = new int[2];
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("An error occurred");
        }

        System.out.println(myCar.div(6, 2));
//        System.out.println(yourCar.div(6, 0));

//        threadPractice thread_1 = new threadPractice(50, "Thread_1");
//        thread_1.start();
//        threadPractice thread_2 = new threadPractice(100, "Thread_2");
//        thread_2.start();
//        threadPractice thread_3 = new threadPractice(200, "Thread_3");
//        thread_3.start();

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println("Colors: " + colors);
        colors.remove("Blue");
        System.out.println("Colors Index 1: " + colors.get(1));
        System.out.println("Colors Size: " + colors.size());
        System.out.println("Colors contains \"Red\"?: " + colors.contains("Red"));
        colors.clear();
        System.out.println("Clearing Colors, size now: " + colors.size());
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Orange");

        HashMap<String, Integer> kidsAges = new HashMap<String, Integer>();
        kidsAges.put("Landon", 6);
        kidsAges.put("Hadassah", 5);
        kidsAges.put("Henry", 1);
        System.out.println("Henry: " + kidsAges.get("Henry"));

        HashSet set = new HashSet();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
        System.out.println(set.size());

        // java.util.Collections
        // Sort colors from 3 sections ago.  Red, green should now been green red.
        Collections.sort(colors);
        System.out.println(colors);
        System.out.println("Max: " + Collections.max(colors));
        System.out.println("Min: " + Collections.min(colors));
        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println(colors);
        Collections.reverse(colors);
        System.out.println(colors);

        LinkedList<String> animals = new LinkedList<String>();
        animals.add("Cow");
        animals.add("Donkey");
        animals.add("Horse");
        animals.add("Dog");
        animals.add("Pig");
        System.out.println(animals);
        Iterator<String> it = animals.iterator();
        while(it.hasNext()) {
            String value = it.next();
            System.out.println("Value: " + value);
        }

        // File io
        try{
            Formatter f = new Formatter("./test.txt");
            f.format("%s", "1: Aaron is a dad\r\n");
            f.format("%s", "2: Leslie is a mom");
            f.close();
        } catch(Exception e) {
            System.out.println("Error");
        }

        File myFile = new File("./test.txt");

        if(myFile.exists()) {
            System.out.println(myFile.getName() + " exists!");
            try{
                Scanner sc = new Scanner(myFile);
                while(sc.hasNext()) {
                    System.out.println(sc.nextLine());
                }
            } catch(FileNotFoundException e) {
                System.out.println("File not found.");
            }
        } else {
            System.out.println("The file does not exist.");
        }

        int[] lst = {4, 9, 7, 1, 3, 6, 5};


    }
}