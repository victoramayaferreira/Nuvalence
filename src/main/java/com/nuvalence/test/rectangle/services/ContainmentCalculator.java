package com.nuvalence.test.rectangle.services;

import com.nuvalence.test.rectangle.model.Rectangle;
import com.nuvalence.test.rectangle.model.Rectangles;
import org.springframework.stereotype.Service;

import static com.nuvalence.test.rectangle.model.ContainmentStatus.*;

@Service
public class ContainmentCalculator {
    public String find(Rectangles rectangles) {
        Rectangle rectangle1 = rectangles.getRectangle1();
        Rectangle rectangle2 = rectangles.getRectangle2();

        if (rectangle1.contains(rectangle2) || rectangle2.contains(rectangle1)) {
            return CONTAINED.name();
        } else if(rectangle1.intersects(rectangle2) || rectangle2.intersects(rectangle1)) {
            return PARTIALLY_CONTAINED.name();
        }else {
            return NOT_CONTAINED.name();
        }
    }
}
