
import java.awt.Color;
import java.awt.Graphics;

public class Face {
    private int xPos, yPos, diameter, mood;
    private Color color, coloreye;
    private Graphics g;
    
    public Face(Graphics g, int x, int y){
        xPos = x;
        yPos = y;
        //let the "g" property = the "g" param
        this.g=g;
        //default size and color
        diameter = 100;
        color = Color.red;
        coloreye = Color.yellow;
        mood = 180;
    }
    
    public void draw(){
        drawHead();
        drawEyes();
        drawMouth();
    }
    
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xPos - 10, yPos - 10, diameter + 20, diameter + 20);
    }
    
    public void drawHead(){
        g.setColor(color);
        g.fillOval(xPos, yPos, diameter, diameter);
    }
    
    public void drawEyes(){
        g.setColor(coloreye);
        g.fillOval((int)(xPos+.15*diameter), (int)(yPos+.25*diameter), diameter/4, diameter/4);
        g.fillOval((int)(xPos+.65*diameter), (int)(yPos+.25*diameter), diameter/4, diameter/4);
    }
    
    public void drawMouth(){
        g.setColor(Color.black);
        g.drawArc(xPos+(int)(.20*diameter), yPos+(int)(.50*diameter), diameter - (int)(.40*diameter), diameter - (int)(.60*diameter), mood,mood);
    }
    
    public void move(int newx, int newy){
        xPos = newx;
        yPos = newy;
    }
    
    public void resize(int newsize){
        diameter = newsize;
    }
    
    public void setColor(Color newcolor, Color neweyecolor){
        color = newcolor;
        coloreye = neweyecolor;
    }
    
    public void changeMood(){
      mood = -mood;
    }
}
