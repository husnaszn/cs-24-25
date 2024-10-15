import javax.swing.ImageIcon;

public class Fish extends Characters{
    public Fish(){
        super();
    }

    public Fish(int x, int y){
        super(x,y, 50,50,10,5,5,1, new ImageIcon("C:\\Users\\S1780821\\OneDrive - Houston Independent School District\\cs 24-25\\rpg game\\fish.png"));
    }
    public String toString(){
        return "Fish"+super.getHealth();

    }
}