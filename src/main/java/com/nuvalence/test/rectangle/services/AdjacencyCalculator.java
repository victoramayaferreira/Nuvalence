package com.nuvalence.test.rectangle.services;

import com.nuvalence.test.rectangle.model.Rectangle;
import com.nuvalence.test.rectangle.model.Rectangles;
import org.springframework.stereotype.Service;

import static com.nuvalence.test.rectangle.model.AdjacencyStatus.*;

@Service
public class AdjacencyCalculator {
    public String find(Rectangles rectangles) {
        Rectangle rectangle1 = rectangles.getRectangle1();
        Rectangle rectangle2 = rectangles.getRectangle2();

        if (rectangle1.properAdjacent(rectangle2)) {
            return PROPER_ADJACENT.name();
        } else if (rectangle1.subLineAdjacent(rectangle2)) {
            return SUB_LINE_ADJACENT.name();
        } else if (rectangle1.partialAdjacent(rectangle2)) {
            return PARTIAL_ADJACENT.name();
        } else {
            return NO_ADJACENT.name();
        }

    }
}
