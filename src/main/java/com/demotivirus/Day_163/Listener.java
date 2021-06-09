package com.demotivirus.Day_163;

import com.demotivirus.Day_163.constatnts.MessageConst;
import com.demotivirus.Day_163.constatnts.StatusConst;

public class Listener {
    public void listen(Status status) {
        if (status.getStatus() == StatusConst.CHANGING_AGD.getStatus()) {
            printAsynchEnd();
            status.change(StatusConst.CHANGE_AGD.getStatus());
            System.out.println(MessageConst.LISTENER_AGD_SUCCESS.getMessage());
            printEndMessage();
        }
        if (status.getStatus() == StatusConst.SENDING_FILE.getStatus()) {
            printAsynchEnd();
            status.change(StatusConst.SEND_FILE.getStatus());
            System.out.println(MessageConst.LISTENER_FILE_SUCCESS.getMessage());
            printEndMessage();
        }
    }

    private void printAsynchEnd() {
        System.out.println(MessageConst.LISTENER_ASYNCH_END.getMessage());
    }

    private void printEndMessage() {
        System.out.println(MessageConst.LISTENER_END_MESSAGE.getMessage());
    }
}
