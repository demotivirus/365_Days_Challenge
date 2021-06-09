package com.demotivirus.Day_163;

import com.demotivirus.Day_163.constatnts.MessageConst;
import com.demotivirus.Day_163.constatnts.ThreadConst;

public class Lotus implements Asynchronous {
    public static void changeAgd() {
        System.out.println(MessageConst.PLEASE_WAIT.getMessage());
        try {
            Thread.sleep(ThreadConst.ASYNCHRONOUS.getSeconds());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
