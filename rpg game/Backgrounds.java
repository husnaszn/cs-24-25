import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Backgrounds extends Interface{

    private int dx, dy;
    private boolean movingw, movingh;
    private Playabl player;

    public Backgrounds(){
        super();
        dx= 0;
        dy = 0;
        player = new Playabl();
        movingw = false;
        movingh = false;
    
    }

    public Backgrounds(String bname, int x, int y, int dx1, int dy1, int w, int h, ImageIcon p){
           super(bname, x, y, w, h, p);
        dx = dx1;
        dy =dy1; 
        
    }

    public boolean isMovingw() {
        return movingw;
    }

    public void setMovingw(boolean moving) {
        this.movingw = moving;
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

    public void move(Playabl pla){
         player = pla;

        if (player.isMovingw()==false){
             setX(getX()+dx); 
             movingw =true;           
        }

       if(getX()+getW()<=Toolkit.getDefaultToolkit().getScreenSize().width){
            setX(Toolkit.getDefaultToolkit().getScreenSize().width-getW());
            movingw = false;
        }else if(getX()>=0){
            setX(0);
            movingw=false;
        } else{
            movingw = true;
        }

    }

}
