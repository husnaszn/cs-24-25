import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Interface {

    private int x, y, w, h;
    private ImageIcon pic;
    private String bname;

    public Interface(){
        x=0;
        y=0;
        w=0;
        h=0;
        pic = new ImageIcon();
        // picpressed = new ImageIcon();
        // picselected = new ImageIcon();
        bname = "";
    }

    public Interface(String bn, int x1, int y1, int width, int height, ImageIcon p){
        x =x1;
        y = y1;
        w = width;
        h = height;
        pic = p;
        // picpressed = pp;
        // picselected = ps;
        bname = bn;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public ImageIcon getPic() {
        return pic;
    }

    public void setPic(ImageIcon pic) {
        this.pic = pic;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void drawPart(Graphics g2d){
        g2d.drawImage(pic.getImage(), x, y, w, h, null);
    }
}
