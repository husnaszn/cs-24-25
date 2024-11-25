import java.awt.Image;

import javax.swing.ImageIcon;

// playable characters - tob, sim, pepper

public class Playabl extends Characters {

    private String playerName;
    private ImageIcon uspin;

    public Playabl(){
        super();
    }

    public Playabl(int x, int y, int dx, int dy, int w, int h, int speed, int hea, int dam, int st, ImageIcon pic, ImageIcon uset, ImageIcon uidle, ImageIcon uwalkl, ImageIcon uwalkr, Tools t){
        super(x, y, dx, dy, w, h, speed, hea, dam, st, pic,uset, uidle,uwalkl, uwalkr,t);
        playerName = "";
    }
    
    public Playabl(String pn, int x, int y, int dx, int dy, int w, int h, int speed, int hea, int dam, int st, ImageIcon pic, ImageIcon uset, ImageIcon uidle, ImageIcon uwalkl, ImageIcon uwalkr, Tools t){
        super(x, y, dx, dy, w, h, speed, hea, dam, st, pic,uset, uidle,uwalkl, uwalkr,t);
        playerName = pn;
        uspin = new ImageIcon();
    }
    
    
    public Playabl(String pn, int x, int y, int dx, int dy, int w, int h, int speed, int hea, int dam, int st, ImageIcon pic, ImageIcon uset, ImageIcon usp, ImageIcon uidle, ImageIcon uwalkl, ImageIcon uwalkr, Tools t){
        super(x, y, dx, dy, w, h, speed, hea, dam, st, pic,uset, uidle,uwalkl, uwalkr,t);
        playerName = pn;
        uspin = usp;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // walk right
    // walk left

   
}
