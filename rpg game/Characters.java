import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Characters {

    private int x,y,w,h, speed, health, dmg, stam, dx, dy;
    ImageIcon pic;

    public Characters(){
        y=0;
        x=0;
        w=0;
        h=0;
        speed=0;
        health=0;
        stam=0;
        dmg=0;
        dx=0;
        dy=0;
        pic= new ImageIcon();
    }
    
    public Characters(int x1, int y1, int width, int height, int sp, int hea, int dam, int st, ImageIcon p){
        x=x1;
        y=y1;
        width=w;
        height =h;
        speed = sp;
        dmg = dam;
        stam=st;
        pic=p;
        dx=0;
    }

    public String toString(){
        return "HAVEN'T SET TOSTRING YET";
    }

    public void drawChar(Graphics g2d){
        g2d.drawImage(pic.getImage(), x, y, w, h, null);
        
    }
}