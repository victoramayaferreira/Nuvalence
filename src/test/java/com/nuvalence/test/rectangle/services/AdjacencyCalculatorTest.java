package com.nuvalence.test.rectangle.services;

import com.nuvalence.test.rectangle.model.Rectangles;
import com.nuvalence.test.rectangle.utils.PredefinedRectangles;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static com.nuvalence.test.rectangle.model.AdjacencyStatus.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AdjacencyCalculatorTest {
    @SpyBean
    private AdjacencyCalculator adjacencyCalculator;

    @Test
    public void whenValidProperYAdjacentRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.properYAdjacent();
        assertEquals(adjacencyCalculator.find(rectangles),
                PROPER_ADJACENT.name());
    }

    @Test
    public void whenValidProperXAdjacentRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.properXAdjacent();
        assertEquals(adjacencyCalculator.find(rectangles),
                PROPER_ADJACENT.name());
    }

    @Test
    public void whenValidSubLineYAdjacentRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.subLineYAdjacent();
        assertEquals(adjacencyCalculator.find(rectangles),
                SUB_LINE_ADJACENT.name());
    }

    @Test
    public void whenValidSubLineXAdjacentRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.subLineXAdjacent();
        assertEquals(adjacencyCalculator.find(rectangles),
                SUB_LINE_ADJACENT.name());
    }

    @Test
    public void whenValidPartialYAdjacentRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.partialYAdjacent();
        assertEquals(adjacencyCalculator.find(rectangles),
                PARTIAL_ADJACENT.name());
    }

    @Test
    public void whenValidPartialXAdjacentRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.partialXAdjacent();
        assertEquals(adjacencyCalculator.find(rectangles),
                PARTIAL_ADJACENT.name());
    }

    @Test
    public void whenValidNoAdjacentRectanglesThenReturnsValidResponse(){
        Rectangles rectangles = PredefinedRectangles.notContainedRectangles();
        assertEquals(adjacencyCalculator.find(rectangles),
                NO_ADJACENT.name());
    }

}