import javax.swing.ImageIcon;

public class Tob extends Characters{
    public Tob(){
        super();
    }

    public Tob(int x, int y){
        super(x,y, 50,50,10,5,5,1, new ImageIcon("tob.png"));
    }
    public String toString(){
        return "Tob"+super.getHealth();

    }
}