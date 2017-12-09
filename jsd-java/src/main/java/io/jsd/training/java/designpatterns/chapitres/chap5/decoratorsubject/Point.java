﻿package io.jsd.training.java.designpatterns.chapitres.chap5.decoratorsubject;

public class Point implements PointGraphique {
    protected int x, y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

}
