package Stuff;

public class threadPractice extends Thread{
    private int myTimer;
    private String myName;

    public threadPractice (int timer, String name){
        myTimer = timer;
        myName = name;
    }

    @Override public void run () {
        display();
    }

    private void display() {
        int x = 0;

        while(x<10){
            System.out.println(myName + " " + x);
            x++;
            try{
                Thread.sleep(myTimer);
            }catch(InterruptedException e) {
                System.out.println("Program error.");
            }
        }
    }
}
