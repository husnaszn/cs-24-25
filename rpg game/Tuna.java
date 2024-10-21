import javax.swing.ImageIcon;

public class Tuna extends Food {
    public Tuna(){
        super();
    }

    public Tuna(int x, int y){
        super(x,y,100,2,159, new ImageIcon("meow.png"));
    }

    public String toString(){
        return "Tuna";
    }
}
