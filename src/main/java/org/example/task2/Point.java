package org.example.task2;

public class Point implements Movable {

    private int x;

    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void coordinates() {
        System.out.println("Point coordinates: x=" + this.x + ", y=" + this.y);
    }

    @Override
    public void moveUp() {
        System.out.println("Move up");
    }

    @Override
    public void moveDown() {
        System.out.println("Move down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Move left");
    }

    @Override
    public void moveRight() {
        System.out.println("Move right");
    }
}

