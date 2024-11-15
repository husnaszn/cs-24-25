import javax.swing.ImageIcon;

public class Enemy extends Characters {
    

    public Enemy(){
        super();
    }

    public Enemy(int x, int y, int dx, int dy, int w, int h, int speed, int hea, int dam, int st, ImageIcon pic, ImageIcon uset, ImageIcon uwalk, Tools t){
        super(x, y, w, h, dx, dy, speed, hea, dam, st, pic,uset,uwalk,t);
    }

}
