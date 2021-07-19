package com.demotivirus.Day_202;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class SectionName {
    @NonNull
    private String title;
    private List<Sticker> stickers = new ArrayList<>();

    public void addSticker(Sticker sticker) {
        stickers.add(sticker);
    }

    public void removeSticker(Sticker sticker) {
        stickers.remove(sticker);
    }

//    public void removeSticker(String title) {
//        stickers.remove()
//    }
}
