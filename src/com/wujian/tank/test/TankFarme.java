package com.wujian.tank.test;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFarme extends Frame {

    //画方块
    Tank myTank = new Tank(200,200,Dir.DOWN);

    Bullet bullet = new Bullet(300,300,Dir.DOWN);

    public TankFarme() throws HeadlessException {
        setVisible(true);
        setTitle("坦克大战");
        setSize(800,600);
        setResizable(false);

        addKeyListener(new KeyListener());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        myTank.paint(g);
        bullet.paint(g);
    }

    public class KeyListener extends KeyAdapter{
        boolean bu = false;
        boolean bd = false;
        boolean bl = false;
        boolean br = false;

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_LEFT:
                    bl = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    br = true;
                    break;
                case KeyEvent.VK_UP:
                    bu = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bd = true;
                    break;
                default:
                    break;
            }
            setMainTankDir();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_LEFT:
                    bl = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    br = false;
                    break;
                case KeyEvent.VK_UP:
                    bu = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bd = false;
                    break;
                default:
                    break;
            }
            setMainTankDir();
        }

        private void setMainTankDir(){
            if(!bu && !bl && !bd && !br){
                myTank.setMoving(false);
            }else{
                myTank.setMoving(true);
                if(bu) myTank.setDir(Dir.UP);
                if(bl) myTank.setDir(Dir.LEFT);
                if(br) myTank.setDir(Dir.RIGHT);
                if(bd) myTank.setDir(Dir.DOWN);
            }

        }

        }


    }

