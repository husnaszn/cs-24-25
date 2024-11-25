import javax.swing.ImageIcon;

public class Buttons extends Interface {

    private ImageIcon pdefault, ppressed, pselected;

    public Buttons(){
        super();
    }

    public Buttons(String bname, int x, int y, int w, int h, ImageIcon pic){
        super(bname, x, y, w, h, pic);
        pdefault = new ImageIcon();
        ppressed = new ImageIcon();
        pselected = new ImageIcon();
    }

    public Buttons(String bname, int x, int y, int w, int h, ImageIcon pic, ImageIcon pd, ImageIcon pp, ImageIcon ps){
        super(bname, x, y, w, h, pic);
        pdefault = pd;
        ppressed = pp;
        pselected = ps;
    }

    
}
