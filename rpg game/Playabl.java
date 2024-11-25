import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

// playable characters - tob, sim, pepper

public class Playabl extends Characters {

    private String playerName, udesc;

    public Playabl(){
        super();
        udesc = "";
    }

    public Playabl(int x, int y, int dx, int dy, int w, int h, int speed, int hea, int dam, int st, ImageIcon pic, ImageIcon uset, ImageIcon uidle, ImageIcon uwalkl, ImageIcon uwalkr, Tools t){
        super(x, y, dx, dy, w, h, speed, hea, dam, st, pic,uset, uidle,uwalkl, uwalkr,t);
        playerName = "";
    }
    
    public Playabl(String pn, int x, int y, int dx, int dy, int w, int h, int speed, int hea, int dam, int st, ImageIcon pic, ImageIcon uset, ImageIcon uidle, ImageIcon uwalkl, ImageIcon uwalkr, Tools t){
        super(x, y, dx, dy, w, h, speed, hea, dam, st, pic,uset, uidle,uwalkl, uwalkr,t);
        playerName = pn;
    }
    
    public Playabl(String ud){
        udesc = ud;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getUdesc() {
        return udesc;
    }

    public void setUdesc(String udesc) {
        this.udesc = udesc;
    }

    public void writeDesc(Graphics g2d){
        g2d.setColor(Color.BLACK);
        g2d.drawString("DESCRIPTION:", 800, 70);
        g2d.drawString(getUdesc(), 800, 100);

        g2d.drawString("STATS:", 800, 130);
    }

    // walk right
    // walk left

   
}
