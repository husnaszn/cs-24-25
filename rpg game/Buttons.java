import javax.swing.ImageIcon;

public class Buttons extends Interface {

    private ImageIcon ppressed, pselected;

    public Buttons(){
        super();
    }

    public Buttons(String bname, int x, int y, int w, int h, ImageIcon pic){
        super(bname, x, y, w, h, pic);
        ppressed = new ImageIcon();
        pselected = new ImageIcon();
    }

    public Buttons(String bname, int x, int y, int w, int h, ImageIcon pic, ImageIcon pp, ImageIcon ps){
        super(bname, x, y, w, h, pic);
        ppressed = pp;
        pselected = ps;
    }

    
}
