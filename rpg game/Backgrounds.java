import java.awt.Toolkit;

import javax.swing.ImageIcon;

public class Backgrounds extends Interface{

    private int dx, dy;
    private boolean moving;
    private Playabl player;

    public Backgrounds(){
        super();
        dx= 0;
        dy = 0;
        player = new Playabl();
        moving = false;
    
    }

    public Backgrounds(String bname, int x, int y, int dx1, int dy1, int w, int h, ImageIcon p){
           super(bname, x, y, w, h, p);
        dx = dx1;
        dy =dy1; 
        
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
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
       setX(getX()+dx);

       if(getX()+getW()<=Toolkit.getDefaultToolkit().getScreenSize().width){
            setX(Toolkit.getDefaultToolkit().getScreenSize().width-getW());
            moving = false;
        }else if(getX()>=0){
            setX(0);
            moving=false;
        } else{
            moving = true;
        }

        System.out.println(moving);
    }

}
