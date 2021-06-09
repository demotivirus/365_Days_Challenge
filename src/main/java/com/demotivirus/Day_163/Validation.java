package com.demotivirus.Day_163;

import com.demotivirus.Day_163.constatnts.MessageConst;
import com.demotivirus.Day_163.constatnts.StatusConst;
import com.demotivirus.Day_163.constatnts.ThreadConst;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Validation {
    private static Status status = new Status();
    private static Listener listener = new Listener();

    public static void start(Asynchronous asynchronous) {
        if (status.getStatus() == StatusConst.INIT.getStatus())
            status.change(StatusConst.START.getStatus());

        try {
            System.out.println(MessageConst.VALIDATION_MESSAGE.getMessage());
            Thread.sleep(ThreadConst.VALIDATION.getSeconds());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (asynchronous instanceof Lotus) {
            status.change(StatusConst.CHANGING_AGD.getStatus()); //for synchronous
            Lotus.changeAgd();

            listener.listen(status);
        }

        if (asynchronous instanceof File) {
            status.change(StatusConst.SENDING_FILE.getStatus()); //for synchronous
            File.sendFile("NEW FILE");

            listener.listen(status);
        }
    }
}
