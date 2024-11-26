import javax.swing.ImageIcon;

public class Enemy extends Characters {
    

    public Enemy(){
        super();
    }

    public Enemy(int x, int y, int dx, int dy, int w, int h, int speed, int mhea, int hea, int dam, int st, ImageIcon pic, ImageIcon uset, ImageIcon uidle, ImageIcon uwalkl, ImageIcon uwalkr, Tools t){
        super(x, y, w, h, dx, dy, speed, mhea, hea, dam, st, pic,uset, uidle, uwalkl, uwalkr,t);
    }   
}


