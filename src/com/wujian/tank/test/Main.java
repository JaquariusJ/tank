package com.wujian.tank.test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        TankFarme tankFarme = new TankFarme();
        while(true){
            Thread.sleep(100);
            tankFarme.repaint();
        }
    }
}
