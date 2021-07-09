package com.wujian.tank.test;

import java.awt.*;

public class Bullet {

    private int x,y;
    private int width = 20;
    private int hight = 20;
    private final int speed = 5;
    private Dir dir = Dir.DOWN;

    public Bullet(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }


    public void paint(Graphics g) {
        //画方块
        Color old_color = g.getColor();
        g.setColor(Color.red);
        g.fillRect(x,y,width,hight);
        g.setColor(old_color);
        move();

    }

    private void move() {
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
