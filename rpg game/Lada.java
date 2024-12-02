import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Lada extends Playabl {
    public Lada(){
        super();
    }

    public Lada(int x, int y){
        super("LADA", x,y, 400,400,190,270,110, 100, 100, 90, 100, new ImageIcon("rpg game\\res\\characters\\lada\\ladaidle.gif"),new ImageIcon("rpg game\\res\\characters\\lada\\ladaidle.gif"),new ImageIcon("rpg game\\res\\characters\\lada\\ladaidle.gif"), new ImageIcon("rpg game\\res\\characters\\lada\\ladawalkl.gif"), new ImageIcon("rpg game\\res\\characters\\lada\\ladawalkr.gif"), new Tuna(x, y));
        super.getTools().setX(super.getX()+super.getW());
        super.setTools(setList());
        super.setUdesc("She's shy, and patient. Too precious to harm.");

    }
    public String toString(){
        return "Lada"+super.getHealth();

    }

    public ArrayList <Tools> setList(){
        ArrayList <Tools> temp = new ArrayList<Tools>();
        temp.add(new Tuna());
        temp.add(new Tuna());
        temp.add(new Tuna());
        return temp;
}
}

// ladaidle 1fps