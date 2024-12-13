import javax.swing.ImageIcon;

public class Fish extends Enemy{
    public Fish(){
        super();
    }

    public Fish(int x, int y){
        // super(x, y, 400, 400, 50, 50, y, y, 50, 50, y, new ImageIcon("rpg game\\res\\characters\\fish\\fishidle.gif"), new ImageIcon("rpg game\\res\\characters\\fish\\fishidle.gif"), new ImageIcon("rpg game\\res\\characters\\fish\\fishidle.gif"), new ImageIcon("rpg game\\res\\characters\\fish\\fishidle.gif"), new ImageIcon("rpg game\\res\\characters\\fish\\fishidle.gif"),new Tuna());
        super(x, y, 400, 400, 50, 50, y, y, 50, 50, y, new ImageIcon("res/characters/fish/fishidle.gif"), new ImageIcon("res/characters/fish/fishidle.gif"), new ImageIcon("res/characters/fish/fishidle.gif"), new ImageIcon("res/characters/fish/fishidle.gif"), new ImageIcon("res/characters/fish/fishidle.gif"),new Tuna());
    }
    public String toString(){
        return "Fish"+super.getHealth();

    }
}

// fishidle 1