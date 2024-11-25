import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Pepper extends Playabl {
    public Pepper(){
        super();
    }

    public Pepper(int x, int y){
        super("pepper", x,y, 400,400,190,270,5, y, y, 1, new ImageIcon("placeholdercat.gif"),new ImageIcon("placeholdercat.gif"),new ImageIcon("placeholdercat.gif"), new ImageIcon("placeholdercat.gif"), new ImageIcon("placeholdercat.gif"), new Tuna(x, y));
        super.getTools().setX(super.getX()+super.getW());
        super.setTools(setList());
    }
    public String toString(){
        return "Pepper"+super.getHealth();

    }

    public ArrayList <Tools> setList(){
        ArrayList <Tools> temp = new ArrayList<Tools>();
        temp.add(new Tuna());
        temp.add(new Tuna());
        temp.add(new Tuna());
        return temp;
}
}
