import javax.swing.ImageIcon;

public class Tuna extends Food {
    public Tuna(){
        super();
    }

    public Tuna(int x, int y){
        super(x,y,100,2,159, new ImageIcon("C:\\Users\\S1780821\\OneDrive - Houston Independent School District\\cs 24-25\\rpg game\\tuna.png"));
    }

    public String toString(){
        return "Tuna";
    }
}
