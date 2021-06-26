package com.demotivirus.Day_180;

import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
public class UserImpl implements User {
    private List<String> info;

    @Override
    public void addUserInfo(String info) {
        if (info == null)
            throw new IllegalArgumentException("Info must contains information");
        if (this.info == null)
            this.info = new ArrayList<>();
        else this.info.add(info);
    }

    @Override
    public List<String> readUserInfo() {
        return info;
    }

}
