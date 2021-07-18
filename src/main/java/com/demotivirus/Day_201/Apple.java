package com.demotivirus.Day_201;

import lombok.*;

@AllArgsConstructor
@Data @NoArgsConstructor
@RequiredArgsConstructor
public class Apple {
    private Color color = Color.GREEN; //default color for apples

    @NonNull
    private int weight;
}
