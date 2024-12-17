
import javax.swing.ImageIcon;

public class ClawWu extends WeapUse{

    public ClawWu(){
        super();
    }

    public ClawWu(int x, int y, int dx, int dy, int dmg, ImageIcon pic, Characters en){
        super(x, y, 0, 0, 10, new ImageIcon("testpew.png"), en);
    }

}
