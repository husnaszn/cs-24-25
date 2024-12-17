import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Tools {
    // 
    int x, y;
    ImageIcon pic;
    public Tools(){
        x = 0;
        y = 0;
        pic = new ImageIcon();

    }


    public Tools(int x1, int y1, ImageIcon p) {
        x = x1;
        y = y1;
        pic = p;
    }


    public void setX(int i) {
        x=i;
    }
    public ImageIcon getPic() {
        return pic;
    }

    public void drawTool(Graphics g2d){
        // System.out.println("null");
        g2d.drawImage(pic.getImage(), x,x, null);
        System.out.println("ughhh");
        
    }
}