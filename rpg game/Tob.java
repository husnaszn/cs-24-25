import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Tob extends Playabl{
    public Tob(){
        super();
        
    }

    public Tob(int x, int y){
        super("TOB", x,y, 0,0,190,270,0, 0, 0,1, new ImageIcon("tobidle.gif"),new ImageIcon("tobidle.gif"),new ImageIcon("tobidle.gif"),new ImageIcon("tobwalkl.gif"),new ImageIcon("tobwalkr.gif"),new Tuna(x,y));
        super.getTools().setX(super.getX()+super.getW());
        super.setTools(setList());
        super.setUdesc("meow blah blah blah wawawwa");
    }

    public String toString(){
        return "Tob"+super.getHealth();

    }

    public ArrayList <Tools> setList(){
        ArrayList <Tools> temp = new ArrayList<Tools>();
        temp.add(new Tuna());
        temp.add(new Tuna());
        temp.add(new Tuna());
        return temp;
    }
}

//tobidle 3
//tob eat tuna 2 sec
//tobwalk 4fps