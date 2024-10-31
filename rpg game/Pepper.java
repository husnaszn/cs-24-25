import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Pepper extends Playabl {
    public Pepper(){
        super();
    }

    public Pepper(int x, int y){
        super(x,y, 400,400,10,5,5,1, new ImageIcon("tobidle.gif"),new Tuna(x,y));
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