package com.nuvalence.test.rectangle.services;

import com.nuvalence.test.rectangle.model.Rectangle;
import com.nuvalence.test.rectangle.model.Rectangles;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.nuvalence.test.rectangle.model.IntersectionStatus.*;

@Service
public class IntersectionCalculator {
    public String find(Rectangles rectangles){
        Rectangle rectangle1 = rectangles.getRectangle1();
        Rectangle rectangle2 = rectangles.getRectangle2();

        if (rectangle1.contains(rectangle2)) {
            return NOT_INTERSECTED.name();
        } else if (rectangle1.intersects(rectangle2)) {
            return INTERSECTED.name() + " at " + rectangle1.getIntersectionPoints();
        } else {
            return NOT_INTERSECTED.name();
        }
    }
}
