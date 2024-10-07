import javax.swing.ImageIcon;

public class Lala extends Characters{
    public Lala(){
        super();
    }

    public Lala(int x, int y){
        super(x,y, 50,50,10,5,5,1, new ImageIcon("lala.png"));
    }
    public String toString(){
        return "Lala"+super.getHealth();

    }
}