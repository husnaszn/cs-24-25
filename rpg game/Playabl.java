import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

// playable characters - tob, sim, pepper

public class Playabl extends Characters {

    private String playerName, udesc;
    private Backgrounds blah;
    private boolean movingw, movingh;
    private Enemy e;

    public boolean isMovingh() {
        return movingh;
    }

    public void setMovingh(boolean movingh) {
        this.movingh = movingh;
    }

    public Playabl(){
        super();
        udesc = "";
        blah = new Backgrounds();
        movingw = false;
        e = new Enemy();
    }

    public Playabl(int x, int y, int dx, int dy, int w, int mhea, int h, int speed, int hea, int dam, int st, ImageIcon pic, ImageIcon uset, ImageIcon uidle, ImageIcon uwalkl, ImageIcon uwalkr, Tools t){
        super(x, y, dx, dy, w, h, speed, mhea, hea, dam, st, pic,uset, uidle,uwalkl, uwalkr,t);
        playerName = "";
    }
    
    public Playabl(String pn, int x, int y, int dx, int dy, int w, int h, int speed, int mhea, int hea, int dam, int st, ImageIcon pic, ImageIcon uset, ImageIcon uidle, ImageIcon uwalkl, ImageIcon uwalkr, Tools t){
        super(x, y, dx, dy, w, h, speed, mhea, hea, dam, st, pic,uset, uidle,uwalkl, uwalkr,t);
        playerName = pn;
    }
    
    public Playabl(String pn, int x, int y, int dx, int dy, int w, int h, int speed, int mhea, int hea, int dam, int st, ImageIcon pic, ImageIcon uset, ImageIcon uidle, ImageIcon uwalkl, ImageIcon uwalkr, ImageIcon uwalkf, ImageIcon uwalkb, Tools t){
        super(x, y, dx, dy, w, h, speed, mhea, hea, dam, st, pic,uset, uidle,uwalkl, uwalkr, uwalkf, uwalkb, t);
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
        g2d.setFont(new Font("VT323", Font.PLAIN,38));
        g2d.drawString(getPlayerName(), 800, 65);
        
        g2d.setFont(new Font("VT323", Font.PLAIN,27));
        g2d.drawString("DESCRIPTION:", 800, 100);
        g2d.drawString(getUdesc(), 800, 124);
        g2d.drawString("STATS:", 800, 160);
        g2d.drawString("MAX HEALTH: " + getMaxHealth(), 800, 184);
        g2d.drawString("DMG: " + getDmg(), 800, 204);
        g2d.drawString("SPEED: " +getSpeed(), 800, 224);
        g2d.drawString("STAMINA: " +getStam(), 800, 244);
    }

    
    public boolean isMovingw() {
        return movingw;
    }
    
    public void setMovingw(boolean moving) {
        this.movingw = moving;
    }
    
    public void move(Backgrounds buh){
        blah = buh;

        if (blah.isMovingh()== false){
            setY(getY()+getDy());
            if (getY()<=0){
                setY(0);
            } else if (getY()+getH()>=Toolkit.getDefaultToolkit().getScreenSize().height){
                setY(Toolkit.getDefaultToolkit().getScreenSize().height-getH());
            } else if (getY() != (Toolkit.getDefaultToolkit().getScreenSize().height/2)-(getH()/2)){
                movingh = true;
            } else if (getY() == (Toolkit.getDefaultToolkit().getScreenSize().height/2)-(getH()/2)){
                movingh = false;
            }

        }
        
        // setY(getY()+getDy());
    if (blah.isMovingw()== false){
            setX(getX()+getDx());
        if((getX()+getW())>=Toolkit.getDefaultToolkit().getScreenSize().width){
            setX(Toolkit.getDefaultToolkit().getScreenSize().width-(getW())); 
        }else if(getX()<=0){
            setX(0);        
        }else if(getX()!=(Toolkit.getDefaultToolkit().getScreenSize().width/2)-(getW()/2)){
            movingw =true;
        }else if(getX()==(Toolkit.getDefaultToolkit().getScreenSize().width/2)-(getW()/2)){
            movingw = false;
        }

        System.out.println(movingw);
    }

    }
  
    public boolean enemiesCol(Enemy e){
       if(getX()+getW() >= (e.getX()-10) && getX() <= (e.getX() + e.getW()+10)){
        return true;
       }else{
        return false;
       }      
    }
}
