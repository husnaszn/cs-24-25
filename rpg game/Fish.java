import javax.swing.ImageIcon;

public class Fish extends Enemy{
    public Fish(){
        super();
    }

    public Fish(int x, int y){
        super(x, y, 400, 400, 50, 50, 50, 50, new ImageIcon("fishidle.gif"), new Tuna());
    }
    public String toString(){
        return "Fish"+super.getHealth();

    }
}

// fishidle 1