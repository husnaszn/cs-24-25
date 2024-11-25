import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Simm extends Playabl{
    public Simm(){
        super();
    }

    public Simm(int x, int y){
        super(x,y, 0,0,190,270,5, y, y, 1, new ImageIcon("placeholdercat.gif"),new ImageIcon("placeholdercat.gif"),new ImageIcon("placeholdercat.gif"), new ImageIcon("placeholdercat.gif"), new ImageIcon("placeholdercat.gif"), new Tuna(x, y));
        super.getTools().setX(super.getX()+super.getW());
        super.setTools(setList());
    }
    public String toString(){
        return "Simm"+super.getHealth();

    }

    public ArrayList <Tools> setList(){
        ArrayList <Tools> temp = new ArrayList<Tools>();
        temp.add(new Tuna());
        temp.add(new Tuna());
        temp.add(new Tuna());
        return temp;
    }
}
