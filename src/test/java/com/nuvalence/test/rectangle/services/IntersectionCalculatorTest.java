package com.nuvalence.test.rectangle.services;

import com.nuvalence.test.rectangle.model.Rectangles;
import com.nuvalence.test.rectangle.utils.PredefinedRectangles;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static com.nuvalence.test.rectangle.model.IntersectionStatus.INTERSECTED;
import static com.nuvalence.test.rectangle.model.IntersectionStatus.NOT_INTERSECTED;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IntersectionCalculatorTest {
    @SpyBean
    private IntersectionCalculator intersectionCalculator;

    @Test
    public void whenValidIntersectedXRightRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.intersectedXRightRectangles();
        assertEquals(intersectionCalculator.find(rectangles),
                INTERSECTED.name()+" at "+ rectangles.getRectangle1().getIntersectionPoints());
    }

    @Test
    public void whenValidIntersectedXLeftRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.intersectedXLeftRectangles();
        assertEquals(intersectionCalculator.find(rectangles),
                INTERSECTED.name()+" at "+ rectangles.getRectangle1().getIntersectionPoints());
    }

    @Test
    public void whenValidIntersectedYUpRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.intersectedYUpRectangles();
        assertEquals(intersectionCalculator.find(rectangles),
                INTERSECTED.name()+" at "+ rectangles.getRectangle1().getIntersectionPoints());
    }

    @Test
    public void whenValidIntersectedYDownRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.intersectedYDownRectangles();
        assertEquals(intersectionCalculator.find(rectangles),
                INTERSECTED.name()+" at "+ rectangles.getRectangle1().getIntersectionPoints());
    }

    @Test
    public void whenValidIntersectedAcrossYRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.intersectedAcrossYRectangles();
        assertEquals(intersectionCalculator.find(rectangles),
                INTERSECTED.name()+" at "+ rectangles.getRectangle1().getIntersectionPoints());
    }

    @Test
    public void whenValidIntersectedAcrossXRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.intersectedAcrossXRectangles();
        assertEquals(intersectionCalculator.find(rectangles),
                INTERSECTED.name()+" at "+ rectangles.getRectangle1().getIntersectionPoints());
    }

    @Test
    public void whenValidNotIntersectedRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.notIntersectedRectangles();
        assertEquals(intersectionCalculator.find(rectangles),
                NOT_INTERSECTED.name());
    }

    @Test
    public void whenValidNotIntersectedContainedRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.containedRectangles();
        assertEquals(intersectionCalculator.find(rectangles),
                NOT_INTERSECTED.name());
    }
}