import javax.swing.ImageIcon;

public class Mud extends Characters{
    public Mud(){
        super();
    }

    public Mud(int x, int y){
        super(x,y, 50,50,2,7,7674,2, y, y, new ImageIcon("mud.png"), new ImageIcon("mud.png"), new ImageIcon("mud.png"), new ImageIcon("mud.png"));
    }
}