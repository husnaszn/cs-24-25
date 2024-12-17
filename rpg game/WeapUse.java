
import javax.swing.ImageIcon;

public class WeapUse extends Weapons{

    private int dx, dy;
    private Characters ent;

    public WeapUse(){
        super();
        dx = 0;
        dy = 0;
        ent = new Characters();
    }

    
    public WeapUse(int x, int y, int dmg, int dur, ImageIcon pic){
        super(x, y, dmg, dur, pic);
    }
    
    public WeapUse(int x, int y, int dx1, int dy1, int dmg, int dur, ImageIcon pic){
        super(x, y, dmg, dur, pic);
        dx = dx1;
        dy = dy1;
    }
    
    public WeapUse(int x, int y, int dx1, int dy1, int dmg, ImageIcon pic, Characters en){
        super(x, y, dmg, pic);
        dx = dx1;
        dy = dy1;
        ent = en;
    }
    
    public WeapUse(int x, int y, int dx1, int dy1, int dmg, int dur, ImageIcon pic, Characters en){
        super(x, y, dmg, dur, pic);
        dx = dx1;
        dy = dy1;
        ent = en;
    }
    
    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }


    public Characters getEnt() {
        return ent;
    }


    public void setEnt(Characters ent) {
        this.ent = ent;
    }
}
