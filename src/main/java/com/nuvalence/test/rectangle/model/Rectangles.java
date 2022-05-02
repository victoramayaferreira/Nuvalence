package com.nuvalence.test.rectangle.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Rectangles {
    private Rectangle rectangle1;
    private Rectangle rectangle2;
    private String intersection;
    private String containment;
    private String adjacency;

    public Rectangles(Rectangle rectangle1, Rectangle rectangle2){
        this.rectangle1 = rectangle1;
        this.rectangle2 = rectangle2;
    }
}
