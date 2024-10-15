import javax.swing.ImageIcon;

public class Lion extends Characters{
    public Lion(){
        super();
    }

    public Lion(int x, int y){
        super(x,y, 50,50,10,5,5,1, new ImageIcon("C:\\Users\\S1780821\\OneDrive - Houston Independent School District\\cs 24-25\\rpg game\\lion.png"));
    }
    public String toString(){
        return "Lion"+super.getHealth();

    }
}