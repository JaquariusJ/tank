package com.wujian.tank.test;


import java.awt.*;

public class Tank {

    private int x = 200,y=200;
    private Dir dir = Dir.DOWN;
    private final int speed = 10;
    private boolean moving = false;

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public void paint(Graphics g) {
        //画方块
        g.fillOval(x,y,50,50);
        move();

    }

    private void move() {
        if(!moving){
            return;
        }
        switch (dir){
            case LEFT:
                x-= speed;
                break;
            case RIGHT:
                x+=speed;
                break;
            case UP:
                y-= speed;
                break;
            case DOWN:
                y+=speed;
                break;
            default:
                break;
        }
    }
}
