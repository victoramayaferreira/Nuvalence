package com.nuvalence.test.rectangle.utils;

import com.nuvalence.test.rectangle.model.Rectangle;
import com.nuvalence.test.rectangle.model.Rectangles;

public class PredefinedRectangles {

    public static Rectangles intersectedXRightRectangles(){
        Rectangle rectangle1 = new Rectangle(50,50,100,100);
        Rectangle rectangle2 = new Rectangle(70,70,100,100);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles intersectedXLeftRectangles(){
        Rectangle rectangle1 = new Rectangle(50,50,100,100);
        Rectangle rectangle2 = new Rectangle(20,70,100,100);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles intersectedYUpRectangles(){
        Rectangle rectangle1 = new Rectangle(50,50,100,100);
        Rectangle rectangle2 = new Rectangle(80,20,100,100);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles intersectedYDownRectangles(){
        Rectangle rectangle1 = new Rectangle(50,50,100,100);
        Rectangle rectangle2 = new Rectangle(80,100,100,100);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles intersectedAcrossYRectangles(){
        Rectangle rectangle1 = new Rectangle(50,50,100,100);
        Rectangle rectangle2 = new Rectangle(70,20,30,150);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles intersectedAcrossXRectangles(){
        Rectangle rectangle1 = new Rectangle(50,50,100,100);
        Rectangle rectangle2 = new Rectangle(20,80,150,50);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles notIntersectedRectangles(){
        Rectangle rectangle1 = new Rectangle(50, 50, 100, 100);
        Rectangle rectangle2 = new Rectangle(200, 50, 100, 100);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles containedRectangles(){
        Rectangle rectangle1 = new Rectangle(50, 50, 200, 200);
        Rectangle rectangle2 = new Rectangle(100, 100, 50, 50);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles notContainedRectangles(){
        Rectangle rectangle1 = new Rectangle(50, 50, 100, 100);
        Rectangle rectangle2 = new Rectangle(200, 50, 100, 100);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles properYAdjacent(){
        Rectangle rectangle1 = new Rectangle(50, 50, 100, 100);
        Rectangle rectangle2 = new Rectangle(150, 50, 100, 100);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles properXAdjacent(){
        Rectangle rectangle1 = new Rectangle(50, 50, 100, 100);
        Rectangle rectangle2 = new Rectangle(50, 150, 100, 100);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles subLineYAdjacent(){
        Rectangle rectangle1 = new Rectangle(50, 50, 100, 100);
        Rectangle rectangle2 = new Rectangle(150, 80, 100, 20);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles subLineXAdjacent(){
        Rectangle rectangle1 = new Rectangle(50, 50, 100, 100);
        Rectangle rectangle2 = new Rectangle(80, 150, 20, 100);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles partialYAdjacent(){
        Rectangle rectangle1 = new Rectangle(50, 50, 100, 100);
        Rectangle rectangle2 = new Rectangle(150, 20, 100, 100);
        return new Rectangles(rectangle1, rectangle2);
    }

    public static Rectangles partialXAdjacent(){
        Rectangle rectangle1 = new Rectangle(50, 50, 100, 100);
        Rectangle rectangle2 = new Rectangle(20, 150, 100, 100);
        return new Rectangles(rectangle1, rectangle2);
    }

}
