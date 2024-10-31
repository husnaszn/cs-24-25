import javax.swing.ImageIcon;

// playable characters - tob, sim, pepper

public class Playabl extends Characters {
    public Playabl(){
        super();
    }

    public Playabl(int x, int y, int w, int h, int speed, int hea, int dam, int st, ImageIcon pic, Tools t){
        super(x, y, w, h, speed, hea, dam, st, pic,t);
}
}
