package com.nuvalence.test.rectangle.services;

import com.nuvalence.test.rectangle.model.Rectangles;
import com.nuvalence.test.rectangle.utils.PredefinedRectangles;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static com.nuvalence.test.rectangle.model.ContainmentStatus.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ContainmentCalculatorTest {
    @SpyBean
    private ContainmentCalculator containmentCalculator;

    @Test
    public void whenValidContainedRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.containedRectangles();
        assertEquals(containmentCalculator.find(rectangles),
                CONTAINED.name());
    }

    @Test
    public void whenValidNotContainedRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.notContainedRectangles();
        assertEquals(containmentCalculator.find(rectangles),
                NOT_CONTAINED.name());
    }

    @Test
    public void whenValidPartiallyContainedRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.intersectedXRightRectangles();
        assertEquals(containmentCalculator.find(rectangles),
                PARTIALLY_CONTAINED.name());
    }

}