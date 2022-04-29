package com.nuvalence.test.rectangle.utils;

import com.nuvalence.test.rectangle.model.Rectangle;
import com.nuvalence.test.rectangle.model.Rectangles;

public class PredefinedRectangles {

    public static Rectangles intersectedRectangles(){
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles notIntersectedRectangles(){
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles containedRectangles(){
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles notContainedRectangles(){
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        return new Rectangles(rectangle1, rectangle2);
    }
}
