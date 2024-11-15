import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Pepper extends Playabl {
    public Pepper(){
        super();
    }

    public Pepper(int x, int y){
        super(x,y, 400,400,10,5,5, y, y, 1, new ImageIcon("C:\\Users\\S1780821\\OneDrive - Houston Independent School District\\cs 24-25\\rpg-game\\rpg game\\placeholdercat.gif"),new ImageIcon("C:\\Users\\S1780821\\OneDrive - Houston Independent School District\\cs 24-25\\rpg-game\\rpg game\\placeholdercat.gif"),new ImageIcon("C:\\Users\\S1780821\\OneDrive - Houston Independent School District\\cs 24-25\\rpg-game\\rpg game\\placeholdercat.gif"),new Tuna(x,y));
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
