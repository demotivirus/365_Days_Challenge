package com.demotivirus.Day_163;

import com.demotivirus.Day_163.constatnts.MessageConst;
import com.demotivirus.Day_163.constatnts.StatusConst;
import lombok.Data;

@Data
public class Status {
    private Integer status = StatusConst.INIT.getStatus();

    public void change(Integer newStatus) {
        status = newStatus;
        System.out.println(MessageConst.STATUS_MESSAGE.getMessage() + newStatus);
    }
}
