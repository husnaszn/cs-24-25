import javax.swing.ImageIcon;

public class Weapons extends Tools{
   
    private int damage, durability;
   
    public Weapons(){
        super();
        damage = 0;
        durability = 0;

    }

    public Weapons(int x, int y, int dmg, int dur, ImageIcon pic){
       super(x, y, pic);
        damage = dmg;
        durability = dur;
    }
}

