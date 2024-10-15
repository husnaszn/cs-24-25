import javax.swing.ImageIcon;

public class Tob extends Characters{
    public Tob(){
        super();
    }

    public Tob(int x, int y){
        super(x,y, 50,50,10,5,5,1, new ImageIcon("C:\\Users\\S1780821\\OneDrive - Houston Independent School District\\cs 24-25\\rpg game\\tob.png"));
    }
    public String toString(){
        return "Tob"+super.getHealth();

    }
}