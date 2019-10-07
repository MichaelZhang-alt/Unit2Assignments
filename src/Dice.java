

import java.awt.Color;
import java.awt.Graphics;

public class Dice {
    private int value;
    private Graphics g;
    private Color c;
    private Color dc; //dot color
    //variables needed to scale
    private int size;
    private int dotSize;
    private int pos1,pos2,pos3; //dot locations
    
    
    public Dice(){
        value = (int)(Math.random() * 6 + 1);
        g = null; //null = nothing
        c = null; //not needed for basic dice
        dc = null;
    }
    
    public Dice(Graphics pg, int dsize){
        value = (int)(Math.random() * 6 + 1);
        g = pg;
        c = Color.white;
        dc = Color.black;
        size = dsize;
        dotSize = (int)(size*.167);
        pos1 = (int)(size*.2);
        pos2 = (int)(size*.4);
        pos3 = (int)(size*.6);
    }
    
    public void roll(){
        value = (int)(Math.random() * 6 + 1);
    }
    
    public void setColor(Color newc, Color newd){
        c = newc;
        dc = newd;
    }
    
    public int getValue(){
        return value;
    }
    
    public void draw(){
        if(g==null) return;
        //draw dice body
        g.setColor(c);
        g.fillRoundRect(dotSize, dotSize, (int)(.67*size), (int)(.67*size), 20, 20);
        
        //draw 7 dots
        g.setColor(dc);
        
        if(value==1){
            dot4();
        }
        else if(value==2){
            dot1();
            dot7();
        }
        else if(value==3){
            dot1();
            dot4();
            dot7();
        }
        else if(value==4){
            dot1();
            dot2();
            dot6();
            dot7();
        }
        else if(value==5){
            dot1();
            dot2();
            dot4();
            dot6();
            dot7();
        }
        else if(value==6){
            dot1();
            dot2();
            dot3();
            dot5();
            dot6();
            dot7();
        }
        
    }
    
    private void dot1(){
        g.fillOval(pos1, pos1, dotSize,dotSize); //r1, dot1
    }
    private void dot2(){
         g.fillOval(pos3, pos1, dotSize,dotSize); //r1, dot2
    }
    private void dot3(){
         g.fillOval(pos1, pos2, dotSize,dotSize); //r2, dot3
    }
    private void dot4(){
          g.fillOval(pos2, pos2, dotSize,dotSize); //r2, dot4
    }
    private void dot5(){
         g.fillOval(pos3, pos2, dotSize,dotSize); //r2, dot5
    }
    private void dot6(){
         g.fillOval(pos1, pos3, dotSize,dotSize); //r3, dot6
    }
    private void dot7(){
         g.fillOval(pos3,pos3 , dotSize,dotSize); //r3, dot7
    }
    
    
    
}
