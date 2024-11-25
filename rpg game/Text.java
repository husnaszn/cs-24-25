import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class Text extends Interface {

    private Color bColor;
    private int textSize, textNum;

    public Text(){
        super();
    }

    public Text(String bname, int x, int y){
        super(bname, x, y);
        bColor = Color.BLACK;
        textSize = 0;
    }
    
    public int getTextNum() {
        return textNum;
    }

    public void setTextNum(int textNum) {
        this.textNum = textNum;
    }

    public Text(String bname, int x, int y, int ts, Color bc){
        super(bname, x, y);
        bColor = bc;
        textSize = ts;
        textNum = 1;
    }
   
    public Text(String bname, int tn, int x, int y, int ts, Color bc){
        super(bname, x, y);
        bColor = bc;
        textSize = ts;
        textNum = tn;
    }

    public Color getbColor() {
        return bColor;
    }

    public void setbColor(Color bColor) {
        this.bColor = bColor;
    }

    public void drawText(Graphics g2d){
        g2d.setFont(new Font("Pixelify Sans", Font.PLAIN, getTextSize()));
        g2d.setColor(getbColor());
        g2d.drawString(getBname(),getX(),getY());
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }
}
