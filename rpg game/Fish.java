import javax.swing.ImageIcon;

public class Fish extends Enemy{
    public Fish(){
        super();
    }

    public Fish(int x, int y){
        super(x, y, 400, 400, 50, 50, y, y, 50, 50, new ImageIcon("C:\\Users\\S1780821\\OneDrive - Houston Independent School District\\cs 24-25\\rpg-game\\rpg game\\fishidle.gif"), new ImageIcon("C:\\Users\\S1780821\\OneDrive - Houston Independent School District\\cs 24-25\\rpg-game\\rpg game\\fishidle.gif"), new ImageIcon("C:\\Users\\S1780821\\OneDrive - Houston Independent School District\\cs 24-25\\rpg-game\\rpg game\\fishidle.gif"), new Tuna());
    }
    public String toString(){
        return "Fish"+super.getHealth();

    }
}

// fishidle 1