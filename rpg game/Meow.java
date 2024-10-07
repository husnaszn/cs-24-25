import javax.swing.ImageIcon;

public class Meow extends Characters{
    public Meow(){
        super();
    }

    public Meow(int x, int y){
        super(x,y, 50,50,2,7,7674,2, new ImageIcon("meow.png"));
    }
}