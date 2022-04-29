package com.nuvalence.test.rectangle.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Rectangle {
    private int x0;
    private int y0;
    private int width;
    private int height;
    private Rectangle intersectedRectangle;
    private String intersectionPoints = "";

    public Rectangle(int x0, int y0, int width, int height) {
        this.x0 = x0;
        this.y0 = y0;
        this.width = width;
        this.height = height;
    }

    public boolean contains(Rectangle otherRectangle) {
        int x = otherRectangle.getX0();
        int y = otherRectangle.getY0();
        int w = otherRectangle.getWidth();
        int h = otherRectangle.getHeight();

        return (x >= x0 &&
                y >= y0 &&
                x+w <= x0 + width &&
                y+h <= y0 + height);
    }

    public boolean intersects(Rectangle otherRectangle) {
        int x = otherRectangle.getX0();
        int y = otherRectangle.getY0();
        int w = otherRectangle.getWidth();
        int h = otherRectangle.getHeight();

        int x0_i = Math.max(x0, x);
        int xf_i = Math.min(x0+width, x+w);
        if (xf_i > x0_i) {
            int y0_i = Math.max(y0,y);
            int yf_i = Math.min(y0+height,y+h);
            if(y0_i < yf_i){
                intersectedRectangle = new Rectangle(x0_i, y0_i, xf_i-x0_i, yf_i-y0_i);
                //intersectionPoints = "["+x0_i+","+y0_i+"], ["+x0_i+","+yf_i+"], ["+ xf_i+","+y0_i+"], ["+xf_i+","+yf_i+"]";
                getIntersectedPoints();
                return true;
            }
        }

        return false;
    }

    public void getIntersectedPoints(){
        int x0_i = intersectedRectangle.getX0();
        int xf_i = x0_i + intersectedRectangle.getWidth();
        int y0_i = intersectedRectangle.getY0();
        int yf_i = y0_i + intersectedRectangle.getHeight();
        //Case for X axis
        if (x0_i==x0 && y0_i>y0) {
            intersectionPoints += "["+x0_i+","+y0_i+"], ";
        }
        if (x0_i==x0 && yf_i<y0+height) {
            intersectionPoints += "["+x0_i+","+yf_i+"], ";
        }
        if (xf_i==x0+width && y0_i>y0) {
            intersectionPoints += "["+xf_i+","+y0_i+"], ";
        }
        if (xf_i==x0+width && yf_i<y0+height) {
            intersectionPoints += "["+xf_i+","+yf_i+"], ";
        }
        //Case for Y axis
        if (y0_i==y0 && x0_i>x0) {
            intersectionPoints += "["+x0_i+","+y0_i+"], ";
        }
        if (y0_i==y0 && xf_i<x0+width) {
            intersectionPoints += "["+xf_i+","+y0_i+"], ";
        }
        if (yf_i==y0+height && x0_i>x0) {
            intersectionPoints += "["+x0_i+","+yf_i+"], ";
        }
        if (yf_i==y0+height && xf_i<x0+width) {
            intersectionPoints += "["+xf_i+","+yf_i+"], ";
        }
        //To remove last symbols ", " from the formed intersection points
        intersectionPoints = intersectionPoints.substring(0,intersectionPoints.length()-2);
    }

    public boolean properAdjacent(Rectangle otherRectangle) {
        int x = otherRectangle.getX0();
        int y = otherRectangle.getY0();
        int w = otherRectangle.getWidth();
        int h = otherRectangle.getHeight();

        if ( (x+w == x0 ||
                x == x0 ||
                x+w == x0+width ||
                x == x0+width) &&
                y == y0 &&
                y+h == y0+height) {
            return true;
        } else if ( (y+h == y0 ||
                y == y0 ||
                y+h == y0+height ||
                y == y0+height) &&
                x==x0 &&
                x+w==x0+width) {
            return true;
        }

        return false;
    }

    public boolean subLineAdjacent(Rectangle otherRectangle) {
        int x = otherRectangle.getX0();
        int y = otherRectangle.getY0();
        int w = otherRectangle.getWidth();
        int h = otherRectangle.getHeight();

        if ( (x+w == x0 ||
                x == x0 ||
                x+w == x0+width ||
                x == x0+width) &&
                y >= y0 &&
                y+h <= y0+height) {
            return true;
        } else if ( (y+h == y0 ||
                y == y0 ||
                y+h == y0+height ||
                y == y0+height) &&
                x>=x0 &&
                x+w<=x0+width) {
            return true;
        }

        return false;
    }

    public boolean partialAdjacent(Rectangle otherRectangle) {
        int x = otherRectangle.getX0();
        int y = otherRectangle.getY0();
        int w = otherRectangle.getWidth();
        int h = otherRectangle.getHeight();

        if ( (x+w == x0 ||
                x == x0 ||
                x+w == x0+width ||
                x == x0+width) &&
                ((y >= y0 && y<=y0+height) ||
                (y+h <= y0+height && y+h >= y0)) ) {
            return true;
        } else if ( (y+h == y0 ||
                y == y0 ||
                y+h == y0+height ||
                y == y0+height) &&
                ((x>=x0 && x<=x0+width) ||
                (x+w<=x0+width && x+w>=x0)) ) {
            return true;
        }

        return false;
    }
}
