import javax.swing.ImageIcon;

// playable characters - tob, sim, pepper

public class Playabl extends Characters {


    public Playabl(){
        super();
    }

    public Playabl(int x, int y, int dx, int dy, int w, int h, int speed, int hea, int dam, int st, ImageIcon pic, ImageIcon uset, ImageIcon uidle, ImageIcon uwalkl, ImageIcon uwalkr, Tools t){
        super(x, y, dx, dy, w, h, speed, hea, dam, st, pic,uset, uidle,uwalkl, uwalkr,t);
    }

    // walk right
    // walk left

   
}
