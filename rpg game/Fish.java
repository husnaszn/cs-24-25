import javax.swing.ImageIcon;

public class Fish extends Characters{
    public Fish(){
        super();
    }

    public Fish(int x, int y){
        super(x,y, 50,50,10,5,5,1, new ImageIcon("lala.png"));
    }
    public String toString(){
        return "Fish"+super.getHealth();

    }
}