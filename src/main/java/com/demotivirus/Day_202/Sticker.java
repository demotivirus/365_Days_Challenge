package com.demotivirus.Day_202;

import com.demotivirus.Day_202.constants.Color;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @Getter @Setter
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Sticker {
    private Color color;
    private String title;
    private String text;
    private static StickerNumber number;

    public static class Builder {
        private Sticker newSticker;

        public Builder() {
            newSticker = new Sticker();
        }

        public Builder setColor(Color color) {
            newSticker.color = color;
            return this;
        }

        public Builder setTitle(String title) {
            newSticker.title = title;
            return this;
        }

        public Builder setText(String text) {
            newSticker.text = text;
            return this;
        }

        public Sticker build() {
            StickerNumber.increment();
            return newSticker;
        }
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "color=" + color +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}
