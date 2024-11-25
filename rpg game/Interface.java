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
}
