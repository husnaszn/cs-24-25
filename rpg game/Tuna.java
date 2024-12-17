import javax.swing.ImageIcon;

public class Tuna extends Food {
    public Tuna(){
        super();
    }

    public Tuna(int x, int y){
        super(x,y, 1, 10, new ImageIcon("tuna.png"));
    }

    public String toString(){
        return "Tuna";
    }
}
