package org.sino.test.thread;

import java.util.Timer;
import java.util.TimerTask;

public class TradtionalTimerTest {
    public static void main(String[] args) {

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("bomb");
            }
        }, 4000,3000);


    }
}
