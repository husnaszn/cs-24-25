import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Lion extends Characters{
    public Lion(){
        super();
    }

    public Lion(int x, int y){

        super(x,y, 50,50,10,5,5,1, y, y, y, new ImageIcon("lion.png"), new ImageIcon("lion.png"), new ImageIcon("lion.png"),new ImageIcon("lion.png"),new ImageIcon("lion.png"), new Tuna(x,y));
        super.getTools().setX(super.getX()+super.getW()); 
        super.setTools(setList());
    }
    public String toString(){
        return "Lion"+super.getHealth();

    }

    public ArrayList <Tools> setList(){
        ArrayList <Tools> temp = new ArrayList <Tools>();
        temp.add(new Tuna());
        temp.add(new Tuna());
        temp.add(new Tuna());
        return temp;
    }
}