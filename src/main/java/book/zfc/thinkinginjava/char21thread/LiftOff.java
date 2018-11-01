package book.zfc.thinkinginjava.char21thread;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class LiftOff implements Runnable{
    protected int countDouw = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    @Override
    public void run() {
        while (countDouw -- > 0){
            System.out.println(status());
            Thread.yield();

//            try {
//                TimeUnit.MILLISECONDS.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    private String status() {
        return "#" +id +"("+ (countDouw>0?countDouw:"liftoff!") +"),";
    }
}
