// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
        Random rand = new Random();
        for(int k=0; k<101; k++) {
            int x1 = rand.nextInt(391)+10;
            int y1 = rand.nextInt(290)+10;
            int x2 = rand.nextInt(391)+10;
            int y2 = rand.nextInt(290)+10;
            int c1 = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);
            g.setColor(new Color(c1,c2,c3));
            g.drawLine(x1, y1, x2, y2);

        }

        // Draw Random Squares

        for(int k=0; k<101; k++) {
            int x1 = rand.nextInt(340) + 400;
            int y1 = rand.nextInt(240) + 10;
            int c1 = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);
            g.setColor(new Color(c1,c2,c3));
            g.fillRect(x1,y1,50,50);
        }

        // Draw Random Circles

        for(int k=0; k<101; k++) {
            int diameter = rand.nextInt(200);
            int x1 = rand.nextInt(391 - diameter) + 10;
            int y1 = rand.nextInt(291 - diameter) + 300;
            int c1 = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);
            g.setColor(new Color(c1,c2,c3));
            g.drawOval(x1,y1,diameter,diameter);
        }



        // Draw 3-D Box
//yellow
        int c2 = rand.nextInt(255);
        g.setColor(Color.yellow);
        g.fillRect(500,350,100,100);
        // g.drawLine(500,350,500,450);
        //g.drawLine(600,350,600,450);
        //g.drawLine(500,350,600,350);
        // g.drawLine(500,450,600,450);
//red
        for(int k=0; k<101; k++) {
        g.setColor(Color.red);
        g.fillRect(550,400,100,100);
        //g.drawLine(550,400,550,500);
       // g.drawLine(650,400,650,500);
       // g.drawLine(550,400,650,400);
       // g.drawLine(550,500,650,500);

//blue
        g.setColor(Color.blue);
        Polygon penta = new Polygon();
        penta.addPoint(600,350);
        penta.addPoint(600,400);
        penta.addPoint(650,400);
        g.fillPolygon(penta);
//green
        g.setColor(Color.green);
        Polygon penta2 = new Polygon();
        penta2.addPoint(500,350);
        penta2.addPoint(500,450);
        penta2.addPoint(550,500);
        penta2.addPoint(550,400);
        g.fillPolygon(penta2);
        }



    }

}



    
 