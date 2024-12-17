import javax.swing.ImageIcon;

public class Weapons extends Tools{
   
    private int damage, durability;
    private WeapUse wuh;
   
    public Weapons(){
        super();
        damage = 0;
        durability = 0;
        wuh = new WeapUse();

    }
    
    public Weapons(int x, int y, int dmg, int dur, ImageIcon pic){
        super(x, y, pic);
        damage = dmg;
        durability = dur;
    }
    
    public Weapons(int x, int y, int dmg, int dur, ImageIcon pic, WeapUse wu){
        super(x, y, pic);
        damage = dmg;
        durability = dur;
        wuh = wu;
    }
    public WeapUse getWuh() {
        return wuh;
    }

    public void setWuh(WeapUse wuh) {
        this.wuh = wuh;
    }
    
        public int getDamage() {
            return damage;
        }
    
        public void setDamage(int damage) {
            this.damage = damage;
        }
    
        public int getDurability() {
            return durability;
        }
    
        public void setDurability(int durability) {
            this.durability = durability;
        }
}

